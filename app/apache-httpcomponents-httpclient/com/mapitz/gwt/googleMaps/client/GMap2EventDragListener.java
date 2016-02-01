package com.mapitz.gwt.googleMaps.client;

public interface GMap2EventDragListener
{
	/**
	 * dragstart none  This event is fired when the user starts dragging the map. 
	 */
	public void onDragStart(GMap2 map);
	
	/**
	 * drag none  This event is repeatedly fired while the user drags the map.
	 */
	public void onDrag(GMap2 map);
	 
	/**
	 * dragend none  This event is fired when the user stops dragging the map. 
	 */
	public void onDragEnd(GMap2 map);
}
