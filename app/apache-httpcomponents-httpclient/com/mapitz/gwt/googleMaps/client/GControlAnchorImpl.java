package com.mapitz.gwt.googleMaps.client;

class GControlAnchorImpl
{
	/*
	 * G_ANCHOR_TOP_RIGHT The control will be anchored in the top right corner of the map.
	 */
	public native static int G_ANCHOR_TOP_RIGHT()/*-{
		return $wnd.G_ANCHOR_TOP_RIGHT;
	}-*/;

	/*
	 * G_ANCHOR_TOP_LEFT The control will be anchored in the top left corner of the map. 
	 */
	public native static int G_ANCHOR_TOP_LEFT()/*-{
		return $wnd.G_ANCHOR_TOP_LEFT;
	}-*/;
	
	/*
	 * G_ANCHOR_BOTTOM_RIGHT The control will be anchored in the bottom right corner of the map. 
	 */
	public native static int G_ANCHOR_BOTTOM_RIGHT()/*-{
		return $wnd.G_ANCHOR_BOTTOM_RIGHT;
	}-*/;
	
	/*
	 * G_ANCHOR_BOTTOM_LEFT The control will be anchored in the bottom left corner of the map.
	 */
	public native static int G_ANCHOR_BOTTOM_LEFT()/*-{
		return $wnd.G_ANCHOR_BOTTOM_LEFT;
	}-*/;

}
