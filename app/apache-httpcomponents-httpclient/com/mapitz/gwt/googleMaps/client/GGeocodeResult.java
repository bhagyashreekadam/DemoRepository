package com.mapitz.gwt.googleMaps.client;

/**
 * Geocode results returned from GClientGeocoder.getLocations(), contains all "matching" addresses, status code, and orignal address
 * @author aglaforge
 *
 */
public class GGeocodeResult
{
	GGeocodeAddress[] addresses;
	String origAddrees;
	int statusCode;
	
	public GGeocodeResult(int results, String origAddrees, int status)
	{
		this.addresses = new GGeocodeAddress[results];
		this.origAddrees = origAddrees;
		this.statusCode = status;
	}
	
	public static GGeocodeResult create(int results, String origAddrees, int statusCode)
	{
		return new GGeocodeResult(results, origAddrees, statusCode);
	}
	
	/**
	 * Retrieve addresses
	 * @return
	 */
	public GGeocodeAddress[] getAddresses()
	{
		return addresses;
	}
	
	public void setAddress(int i, GGeocodeAddress address)
	{
		addresses[i] = address;
	}
	
	/**
	 * Retrieves the original address passed to the geocoder
	 * @return
	 */
	public String getOrigAddrees()
	{
		return origAddrees;
	}
	
	/**
	 * Returns the status code value
	 * @return
	 */
	public int getStatusCode()
	{
		return statusCode;
	}

	public GGeoStatusCode getGGeoStatusCode()
	{
		return GGeoStatusCode.translate(statusCode);
	}
}
