package com.mapitz.gwt.googleMaps.client;

public interface GMap2EventMoveListener
{
	/**
	 * movestart none  This event is fired when the map view starts changing. This can be caused by dragging, in which case a dragstart event is also fired, or by invocation of a method that changes the map view.
	 */
	public void onMoveStart(GMap2 map);
	
	/**
	 * move none  This event is fired, possibly repeatedly, while the map view is changing.
	 */
	public void onMove(GMap2 map);
	 
	/**
	 * moveend none  This event is fired when the change of the map view ends.
	 */
	public void onMoveEnd(GMap2 map);
}
