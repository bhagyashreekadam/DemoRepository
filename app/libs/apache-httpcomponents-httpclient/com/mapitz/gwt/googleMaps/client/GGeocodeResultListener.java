package com.mapitz.gwt.googleMaps.client;

/**
 * Event listener for geocoding results
 * @author aglaforge
 *
 */
public interface GGeocodeResultListener
{
	/**
	 * Returns the latitude and longitude of the best matching address
	 * @param latlng
	 */
	public void onSuccess(GLatLng latlng);
	
	/**
	 * On geocode failure
	 *
	 */
	public void onFail(String address);
}
