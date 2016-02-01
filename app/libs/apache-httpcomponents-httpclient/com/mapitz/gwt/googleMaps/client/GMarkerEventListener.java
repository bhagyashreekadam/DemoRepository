package com.mapitz.gwt.googleMaps.client;

/**
 * 	Defines the interface for all standard GMarker event listeners
 * @author aglaforge
 *
 */
public interface GMarkerEventListener
{	
	/**
	 * remove none  This event is fired when the marker is removed from the map, using GMap2.removeOverlay() or GMap2.clearOverlays(). 
	 */
	public void onRemove(GMarker marker);
}
