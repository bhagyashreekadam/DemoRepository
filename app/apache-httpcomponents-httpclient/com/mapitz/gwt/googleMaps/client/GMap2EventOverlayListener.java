package com.mapitz.gwt.googleMaps.client;

public interface GMap2EventOverlayListener
{
	/**
	 * addoverlay overlay  This event is fired when a single overlay is added to the map by the method addOverlay(). The new overlay is passed as an argument overlay to the event handler.
	 */
	public void onAddOverlay(GMap2 map, GOverlay overlay);
	 
	/**
	 * removeoverlay overlay  This event is fired when a single overlay is removed by the method removeOverlay(). The overlay that was removed is passed as an argument overlay to the event handler. 
	 */
	public void onRemoveOverlay(GMap2 map, GOverlay overlay); 
	
	/**
	 * clearoverlays none  This event is fired when all overlays are removed at once by the method clearOverlays().
	 */
	public void onClearOverlays(GMap2 map);
}
