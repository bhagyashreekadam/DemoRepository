package com.mapitz.gwt.googleMaps.client;

public interface GMap2EventLoadListener
{
	/**
	 * load none  This event is fired when the map setup is complete, and isLoaded() would return true. This means position, zoom, and map type are all initialized, but tile images may still be loading. (Since 2.52)
	 */
	public void onLoad(GMap2 map); 
}
