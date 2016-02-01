package com.example.synerzip.pdfreader;

/**
 * Created by synerzip on 27/1/16.
 */

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.OpenFileActivityBuilder;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.drive.DriveRequest;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/*www.101apps.co.za*/
public class SelectDriveFolder extends Activity implements
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener{
ViewPDF Vpdf=new ViewPDF();
    private static final String TAG = "drive";
    private static final int REQUEST_CODE_SELECT = 102;
    private static final int REQUEST_CODE_RESOLUTION = 103;
    private GoogleApiClient googleApiClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        you can check if play services installed and up to date - returns integer value
        Log.i(TAG, "Is Google Play Services available and up to date? "
                + GooglePlayServicesUtil.isGooglePlayServicesAvailable(this));

        buildGoogleApiClient();
        AccountManager am = AccountManager.get(Vpdf.getBaseContext());

        am.getAuthToken(am.getAccounts()[0],
                "oauth2:" + DriveScopes.DRIVE,
                new Bundle(),
                true,
                new OnTokenAcquired(),
                null);

    }


    private class OnTokenAcquired implements AccountManagerCallback<Bundle> {
        @Override
        public void run(AccountManagerFuture<Bundle> result) {
            try {
                final String token = result.getResult().getString(AccountManager.KEY_AUTHTOKEN);
                HttpTransport httpTransport = new NetHttpTransport();
                JacksonFactory jsonFactory = new JacksonFactory();
                com.google.api.services.drive.Drive.Builder b = new com.google.api.services.drive.Drive.Builder(httpTransport, jsonFactory, null);

                b.setHttpRequestInitializer(new HttpRequestInitializer() {
                    @Override
                    public void initialize(HttpRequest request) throws IOException {
                        DriveRequest driveRequest = request;
                        driveRequest.setPrettyPrint(true);
                        driveRequest.setKey("1038951995911-os1eackdtk7essjodrsl1278ov9gcvvj.apps.googleusercontent.com");
                        driveRequest.setOauthToken(token);
                    }
                });

                final com.google.api.services.drive.Drive drive = b.build();

                final com.google.api.services.drive.model.File body = new com.google.api.services.drive.model.File();
                body.setTitle("My Test File");
                body.setDescription("A Test File");
                body.setMimeType("text/plain");

                final FileContent mediaContent = new FileContent("text/plain", an ordinary java.io.File you'd like to upload. Make it using a FileWriter or something, that's really outside the scope of this answer.)
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            com.google.api.services.drive.model.File file = drive.files().insert(body, mediaContent).execute();
                            alreadyTriedAgain = false; // Global boolean to make sure you don't repeatedly try too many times when the server is down or your code is faulty... they'll block requests until the next day if you make 10 bad requests, I found.
                        } catch (IOException e) {
                            if (!alreadyTriedAgain) {
                                alreadyTriedAgain = true;
                                AccountManager am = AccountManager.get(activity);
                                am.invalidateAuthToken(am.getAccounts()[0].type, null); // Requires the permissions MANAGE_ACCOUNTS & USE_CREDENTIALS in the Manifest
                                am.getAuthToken (same as before...)
                            } else {
                                // Give up. Crash or log an error or whatever you want.
                            }
                        }
                    }
                }).start();
                Intent launch = (Intent)result.getResult().get(AccountManager.KEY_INTENT);
                if (launch != null) {
                    startActivityForResult(launch, 3025);
                    return; // Not sure why... I wrote it here for some reason. Might not actually be necessary.
                }
            } catch (OperationCanceledException e) {
                // Handle it...
            } catch (AuthenticatorException e) {
                // Handle it...
            } catch (IOException e) {
                // Handle it...
            } catch (AuthenticatorException e) {
                e.printStackTrace();
            } catch (OperationCanceledException e) {
                e.printStackTrace();
            }
        }
    }

    /*connect client to Google Play Services*/
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "In onStart() - connecting...");
        googleApiClient.connect();
    }

    /*close connection to Google Play Services*/
    @Override
    protected void onStop() {
        super.onStop();
        if (googleApiClient != null) {
            Log.i(TAG, "In onStop() - disConnecting...");
            googleApiClient.disconnect();
        }
    }

    /*Connection callback - on successful connection*/
    @Override
    public void onConnected(Bundle bundle) {
        Log.i(TAG, "in onConnected() - we're connected, let's do the work in the background...");
//        build an intent that we'll use to start the open file activity
        IntentSender intentSender = Drive.DriveApi.newOpenFileActivityBuilder().setActivityTitle("test")
                .setMimeType(new String[]
                        {
                                "text/plain", "text/html", "image/jpeg", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/pdf"}).build(googleApiClient);

        try {
            startIntentSenderForResult(intentSender, REQUEST_CODE_SELECT, null, 0, 0, 0);
        }
        catch (IntentSender.SendIntentException e)
        {
        }
    }

    /*Connection callback - Called when the client is temporarily in a disconnected state*/
    @Override
    public void onConnectionSuspended(int i) {
        switch (i) {
            case 1:
                Log.i(TAG, "Connection suspended - Cause: " + "Service disconnected");
                break;
            case 2:
                Log.i(TAG, "Connection suspended - Cause: " + "Connection lost");
                break;
            default:
                Log.i(TAG, "Connection suspended - Cause: " + "Unknown");
                break;
        }
    }

    /*connection failed callback - Called when there was an error connecting the client to the service*/
    @Override
    public void onConnectionFailed(ConnectionResult result) {
        Log.i(TAG, "Connection failed - result: " + result.toString());
        if (!result.hasResolution()) {
//            display error dialog
            GooglePlayServicesUtil.getErrorDialog(result.getErrorCode(), this, 0).show();
            return;
        }

        try {
            Log.i(TAG, "trying to resolve the Connection failed error...");
//            tries to resolve the connection failure by trying to restart this activity
            result.startResolutionForResult(this, REQUEST_CODE_RESOLUTION);
        } catch (IntentSender.SendIntentException e) {
            Log.i(TAG, "Exception while starting resolution activity", e);
        }
    }

    /*build the google api client*/
    private void buildGoogleApiClient() {
        Log.i(TAG, "Building the client");
        if (googleApiClient == null) {
            googleApiClient = new GoogleApiClient.Builder(this)
                    .addApi(Drive.API)
                    .addScope(Drive.SCOPE_FILE)
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .build();
        }
    }


    /* receives returned result - called by the open file activity when it's exited
    by user pressing Select. This passes the request code, result code and data back
    which is received here*/
    @Override
    protected void onActivityResult(final int requestCode, int resultCode, Intent data) {
        Log.i(TAG, "in onActivityResult() - triggered on pressing Select");
        switch (requestCode) {
            case REQUEST_CODE_SELECT:
                if (resultCode == RESULT_OK) {
                    DriveId driveId = (DriveId) data.getParcelableExtra(OpenFileActivityBuilder.EXTRA_RESPONSE_DRIVE_ID);
                   // String pdfUrl = "https://drive.google.com/open?id="+driveId;
                   //String pdfUrl = "http://www.tutorialspoint.com/java/java_tutorial.pdf";
                    String pdfUrl = "https://drive.google.com/file/d/0ByCuL812wpdXbzlqYnhUcXdjTGc/view?usp=sharing";


                    new DownloadFileAsync().execute(pdfUrl);
//Vpdf.displayDrivefile("https://drive.google.com/open?id="+driveId);



                }

                break;
            case REQUEST_CODE_RESOLUTION:
                if (resultCode == RESULT_OK) {
                    Log.i(TAG, "in onActivityResult() - resolving connection, connecting...");
                    googleApiClient.connect();
                }
                break;

            default:
                super.onActivityResult(requestCode, resultCode, data);
                break;
        }
    }
    private java.io.File downloadGFileToJFolder(Drive drive, String token, File gFile, java.io.File jFolder) throws IOException {
        if (gFile.getDownloadUrl() != null && gFile.getDownloadUrl().length() > 0 ) {
            if (jFolder == null) {
                jFolder = Environment.getExternalStorageDirectory();
                jFolder.mkdirs();
            }

            try {

                HttpClient client = new DefaultHttpClient();
                HttpGet get = new HttpGet(gFile.getDownloadUrl());
                get.setHeader("Authorization", "Bearer " + token);
                HttpResponse response = client.execute(get);

                InputStream inputStream = response.getEntity().getContent();
                jFolder.mkdirs();
                java.io.File jFile = new java.io.File(jFolder.getAbsolutePath() + "/" + "temp"); // getGFileName() is my own method... it just grabs originalFilename if it exists or title if it doesn't.
                FileOutputStream fileStream = new FileOutputStream(jFile);
                byte buffer[] = new byte[1024];
                int length;
                while ((length=inputStream.read(buffer))>0) {
                    fileStream.write(buffer, 0, length);
                }
                fileStream.close();
                inputStream.close();
                return jFile;
            } catch (IOException e) {
                // Handle IOExceptions here...
                return null;
            }
        } else {
            // Handle the case where the file on Google Drive has no length here.
            return null;
        }
    }


    class DownloadFileAsync extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        }

        @Override
        protected String doInBackground(String... aurl) {
            int count;

            try {

                URL url = new URL(aurl[0]);
                URLConnection conexion = url.openConnection();
                conexion.connect();

                int lenghtOfFile = conexion.getContentLength();
                Log.d("ANDRO_ASYNC", "Lenght of file: " + lenghtOfFile);

                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream(Environment.getExternalStorageDirectory()+"/demopdf292.pdf");

                byte data[] = new byte[1024];

                long total = 0;
                while ((count = input.read(data)) != -1) {
                    total += count;
                    publishProgress(""+(int)((total*100)/lenghtOfFile));
                    output.write(data, 0, count);
                }

                output.flush();
                output.close();
                input.close();
            } catch (Exception e) {}
            return null;

        }
        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC",progress[0]);

        }

        @Override
        protected void onPostExecute(String unused) {
            Log.i(TAG,"download complete");
        }
    }



}