package com.mapitz.gwt.googleMaps.client;

class GGeocodeCacheImpl
{

	/*
	 * GGeocodeCache() Creates a new cache for storing a map from adresses to locations. The constructor immediately calls the GGeocodeCache.reset method. (Since 2.55)
	 */
	public static native GGeocodeCache create()/*-{
		return new $wnd.GGeocodeCache();
	}-*/;
	
	/*
	 * reset() none  Purges all replies from the cache. After this method returns, the cache is empty. (Since 2.55)
	 */
	public static native GGeocodeCache create(GGeocodeCache self)/*-{
		return self.reset();
	}-*/;
}
