package com.mapitz.gwt.googleMaps.client;

public interface GMap2EventClickListener
{
	/**
	 * click overlay, point This event is fired when the map is clicked with the mouse. If the click was on a marker, then the marker is passed to the event handler in the overlay argument, and a click event is also fired on the marker. Otherwise, the geographical coordinates of the point that was clicked are passed in the point argument.
	 */
	public void onClick(GMap2 map, GOverlay overlay, GLatLng point); 
}
