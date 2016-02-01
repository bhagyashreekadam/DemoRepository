package com.mapitz.gwt.googleMaps.client;

public interface GMap2EventMouseListener
{
	/**
	 * mouseover latlng  This event is fired when the user moves the mouse over the map from outside the map.
	 */
	public void onMouseOver(GMap2 map, GLatLng latlng);
	
	/**
	 * mouseout latlng  This event is fired when the user moves the mouse off the map.
	 */
	public void onMouseOut(GMap2 map, GLatLng latlng);
	
	/**
	 * mousemove latlng  This event is fired when the user moves the mouse inside the map.
	 */
	public void onMouseMove(GMap2 map, GLatLng latlng); 
}
