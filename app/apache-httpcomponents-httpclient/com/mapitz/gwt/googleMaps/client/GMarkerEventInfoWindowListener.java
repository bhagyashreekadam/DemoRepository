package com.mapitz.gwt.googleMaps.client;

public interface GMarkerEventInfoWindowListener
{
	/**
	 * infowindowopen none  This event is fired when the info window of the map was opened through this marker.
	 */
	public void onInfoWindowOpen(GMarker marker);
	
	/**
	 * infowindowclose none  This event is fired when the info window of the map that was opened through this marker is closed again. This happens when either the info window was closed, or when it was opened on another marker, or on the map.
	 */ 
	public void onInfoWindowClose(GMarker marker);
}
