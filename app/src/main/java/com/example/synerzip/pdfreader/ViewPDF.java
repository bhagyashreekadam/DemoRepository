package com.example.synerzip.pdfreader;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.joanzapata.pdfview.PDFView;
import com.joanzapata.pdfview.listener.OnPageChangeListener;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class ViewPDF extends AppCompatActivity implements OnPageChangeListener {

    private int REQUEST_CODE_DOC = 0;
    private static final int REQUEST_PICK_FILE = 1;
    private PDFView pdfview;
    private String docFilePath;
    private Integer pageNumber = 1;
    private TextView filePath;
    private Button Browse;
    private File selectedFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pdf);
        pdfview = (PDFView) findViewById(R.id.pdfview);
    }

    public void upload(View view) {
        /*
        pdfview.fromAsset("pdf-sample.pdf")
                .defaultPage(1)
                .onPageChange(this)
                .load();*/
        Intent intent = new Intent(this, FilePicker.class);
        startActivityForResult(intent, REQUEST_PICK_FILE);


    }

    public void dropBox(View view)
      {

      }


    public void googlrDrive(View view)
    {
        Intent intent = new Intent(this, SelectDriveFolder.class);
        startActivityForResult(intent, REQUEST_PICK_FILE);
    }




/*
    @Override
    protected void onActivityResult(int req, int result, Intent data)
    {
        // TODO Auto-generated method stub
        super.onActivityResult(req, result, data);
        if (result == RESULT_OK)
        {
            Uri fileuri = data.getData();
            docFilePath = getFileNameByUri(this, fileuri);
            Log.d("UPLOAD PDF", fileuri.getPath());
            try {
                File file = new File(new URI(docFilePath));
                if (file.exists()) {
                    pdfview.fromFile(file)
                            .defaultPage(1)
                            .onPageChange(this)
                            .load();
                }
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }*/

    // get file path

    private String getFileNameByUri(Context context, Uri uri)
    {
        String filepath = "";//default fileName
        //Uri filePathUri = uri;
        File file;
        if (uri.getScheme().toString().compareTo("content") == 0)
        {
            Cursor cursor = context.getContentResolver().query(uri, new String[] { MediaStore.Images.ImageColumns.DATA, MediaStore.Images.Media.ORIENTATION }, null, null, null);
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);

            cursor.moveToFirst();

            String mImagePath = cursor.getString(column_index);
            cursor.close();
            filepath = mImagePath;
        }
        else
        if (uri.getScheme().compareTo("file") == 0)
        {
            try
            {
                file = new File(new URI(uri.getPath()));
                if (file.exists())
                    filepath = file.getAbsolutePath();

            }
            catch (URISyntaxException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else
        {
            filepath = uri.getPath();
        }
        Log.d("FILE PATH ====> ", filepath);
        return filepath;
    }

    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber = page;
        setTitle(String.format("%s %s / %s", "pdf-sample.pdf", page, pageCount));
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(resultCode == RESULT_OK) {

            switch(requestCode) {

                case REQUEST_PICK_FILE:

                    if(data.hasExtra(FilePicker.EXTRA_FILE_PATH)) {

                        selectedFile = new File
                                (data.getStringExtra(FilePicker.EXTRA_FILE_PATH));
//                        filePath.setText(selectedFile.getPath());

                        pdfview.fromFile(selectedFile)
                                .defaultPage(1)
                                .onPageChange(this)
                                .load();

                    }
                    break;
            }
        }




    }

    public void displayDrivefile(String DI)
    {

        pdfview.fromFile(selectedFile)
                .defaultPage(1)
                .onPageChange(this)
                .load();
    }

}
