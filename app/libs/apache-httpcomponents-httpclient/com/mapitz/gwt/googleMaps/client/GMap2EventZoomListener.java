package com.mapitz.gwt.googleMaps.client;

public interface GMap2EventZoomListener
{
	/**
	 * zoomend oldLevel, newLevel This event is fired when the map reaches a new zoom level. The event handler receives the previous and the new zoom level as arguments.
	 */
	public void onZoomEnd(GMap2 map, int oldLevel, int newLevel);
}
