package com.mapitz.gwt.googleMaps.client;

public interface GMarkerEventMouseListener
{
	/**
	 *mousedown none  This event is fired when the DOM mousedown event is fired on the marker icon. Notice that the marker will stop the mousedown DOM event, so that it doesn't cause the map to start dragging. 
	 */
	public void onMouseDown(GMarker marker);
	
	/**
	 *mouseup none  This event is fired for the DOM mouseup on the marker. Notice that the marker will not stop the mousedown DOM event, because it will not confuse the drag handler of the map. 
	 */
	public void onMouseUp(GMarker marker);
	
	/**
	 * mouseover none  This event is fired when the mouse enters the area of the marker icon.
	 */ 
	public void onMouseOver(GMarker marker);
	
	/**
	 * mouseout none  This event is fired when the mouse leaves the area of the marker icon. 
	 */
	public void onMouseOut(GMarker marker);
}
