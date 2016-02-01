package com.mapitz.gwt.googleMaps.client;

/**
 * This class refines the basic GGeocodeCache class by placing stricter conditions on cached replies. It only caches replies which are very unlikely to change within a short period of time.
 * @author aglaforge
 *
 */
public class GFactualGeocodeCache extends GGeocodeCache
{

	protected GFactualGeocodeCache(int opaque)
	{
		super(opaque);
	}
	
	/**
	 * Creates a new cache that stores only replies it considers factual. (Since 2.55)
	 * @return
	 */
	public static GFactualGeocodeCache create()
	{
		return GFactualGeocodeCacheImpl.create();
	}

}
