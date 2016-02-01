package com.mapitz.gwt.googleMaps.client;

public interface GMap2EventMapTypeListener
{
	/**
	 * addmaptype type  This event is fired when a map type is added to the map.
	 */
	public void onAddMapType(GMap2 map, GMapType type);
	
	/**
	 * removemaptype type  This event is fired when a map type is removed from the map.
	 */
	public void onRemoveMapType(GMap2 map, GMapType type);
	 
	/**
	 * maptypechanged none  This event is fired when another map type is selected.
	 */
	public void onMapTypeChanged(GMap2 map);

}
