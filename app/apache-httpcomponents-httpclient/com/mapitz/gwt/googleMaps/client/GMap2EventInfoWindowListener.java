package com.mapitz.gwt.googleMaps.client;

public interface GMap2EventInfoWindowListener
{
	/**
	 * infowindowopen none  This event is fired when the info window opens.
	 */
	public void onInfoWindowOpen(GMap2 map);
	
	/**
	 * infowindowclose none  This event is fired when the info window closes. If a currently open info window is reopened at a different point using another call to openInfoWindow*(), then infowindowclose will fire first.
	 */
	public void onInfoWindowClose(GMap2 map);
}
