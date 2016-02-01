package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Creates a new cache for storing a map from adresses to locations. The constructor immediately calls the GGeocodeCache.reset method. (Since 2.55)
 * @author aglaforge
 *
 */
public class GGeocodeCache extends JavaScriptObject
{

	protected GGeocodeCache(int opaque)
	{
		super(opaque);
	}

}
