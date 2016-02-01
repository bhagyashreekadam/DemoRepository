package com.mapitz.gwt.googleMaps.client;

public interface GMarkerEventClickListener
{
	/**
	 * click none  This event is fired when the marker icon was clicked. Notice that this event will also fire for the map, with the marker passed as the first argument to the event handler there.
	 */ 
	public void onClick(GMarker marker);

	
	/**
	 * dblclick none  This event is fired when the marker icon was double-clicked. Notice that this event will not fire for the map, because the map centers on double-click as a hardwired behavior.
	 */ 
	public void onDblClick(GMarker marker);
}
