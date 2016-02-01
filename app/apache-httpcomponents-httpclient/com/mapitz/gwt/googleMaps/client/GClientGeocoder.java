package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * This class is used to communicate directly with Google servers to obtain geocodes for user specified addresses. In addition, a geocoder maintains its own cache of addresses, which allows repeated queries to be answered without a round trip to the server.
 * @author aglaforge
 *
 */
public class GClientGeocoder extends JavaScriptObject
{

	static protected GClientGeocoderImpl impl = new GClientGeocoderImpl();
	
	protected GClientGeocoder(int opaque)
	{
		super(opaque);
	}
	
	/**
	 * GClientGeocoder(cache?) Creates a new instance of a geocoder that talks directly to Google servers. The optional cache parameter allows one to specify a custom client-side cache of known addresses. If none is specified, a GFactualGeocodeCache is used. (Since 2.55)
	 * @return
	 */
	public static GClientGeocoder create(GGeocodeCache cache)
	{
		return GClientGeocoderImpl.create(cache);
	}

	/**
	 * GClientGeocoder(cache?) Creates a new instance of a geocoder that talks directly to Google servers. The optional cache parameter allows one to specify a custom client-side cache of known addresses. If none is specified, a GFactualGeocodeCache is used. (Since 2.55)
	 * @return
	 */

	public static GClientGeocoder create()
	{
		return GClientGeocoderImpl.create();
	}
//
//	Methods
//	Methods Return Value Description 
//	 
	/**
	 * getLatLng(address, callback) none  Sends a request to Google servers to geocode the specified address. If the address was successfully located, the user-specified callback function is invoked with a GLatLng point. Otherwise, the callback function is given a null point. In case of ambiguous addresses, only the point for the best match is passed to the callback function. (Since 2.55)
	 */
	public void getLatLng(String address, GGeocodeResultListener result)
	{
		impl.getLatLng(this, address, result);
	}
	
	/**
	 * getLocations(address, callback) none  Sends a request to Google servers to geocode the specified address. A reply that contains status code, and if successful, one or more Placemark objects, is passed to the user-specified callback function. Unlike the GClientGeocoder.getLatLng method, the callback function may determine the reasons for failure by examining the code value of the Status field. (Since 2.55)
	 * @param address
	 * @param result
	 */ 
	public void getLocations(String address, GGeocodeAdvancedResultListener result)
	{
		impl.getLocations(this, address, result);
	}
	
	
	/**
	 * getCache() GGeocodeCache  Returns currently used geocode cache, or null, if no client-side caching is performed. (Since 2.55)
	 */
	public GGeocodeCache getCache()
	{
		return impl.getCache(this);
	}
	
	/**
	 * setCache(cache) none  Sets a new client-side caching. If this method is invoked with cache set to null, client-side caching is disabled. Setting a new cache discards previously stored addresses. (Since 2.55)
	 * @return
	 */ 
	public GGeocodeCache setCache(GGeocodeCache cache)
	{
		return impl.setCache(this, cache);
	}
	
	/**
	 * reset() none  Resets the geocoder. In particular this method calls the GGeocodeCache.reset method on the client-side cache, if one is used by this geocoder. (Since 2.55)
	 * @return
	 */ 
	public void reset()
	{
		impl.reset(this);
	}

}
