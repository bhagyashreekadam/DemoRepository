package com.mapitz.gwt.googleMaps.client;

/**
 * Event listener for advanced geocoding results
 * @author aglaforge
 *
 */
public interface GGeocodeAdvancedResultListener
{
	/**
	 * Called when the geocode operation is successful, returns a set of "matching" results
	 * @param result
	 */
	public void onSuccess(GGeocodeResult result);
	
	/**
	 * Called when the geocode operation fails
	 *
	 */
	public void onFail(int statusCode, String address);
}
