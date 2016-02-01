package com.mapitz.gwt.googleMaps.client;

class GMapPaneImpl
{	
	/*
	 * This pane is still below the shadows of the markers, directly on top of the map. It contains for instance the polylines.
	 */
	public native static int G_MAP_MAP_PANE()/*-{
		return $wnd.G_MAP_MAP_PANE;
	}-*/;

	/*
	 * This pane contains the shadows of the markers. It is below the markers.
	 */
	public native static int G_MAP_MARKER_SHADOW_PANE()/*-{
		return $wnd.G_MAP_MARKER_SHADOW_PANE;
	}-*/;

	/*
	 * This pane contains the markers.
	 */
	public native static int G_MAP_MARKER_PANE()/*-{
		return $wnd.G_MAP_MARKER_PANE;
	}-*/;

	/*
	 * This pane conatains the shadow of the info window. It is above the G_MAP_MARKER_PANE, so that markers can be in the shadow of the info window.
	 */
	public native static int G_MAP_FLOAT_SHADOW_PANE()/*-{
		return $wnd.G_MAP_FLOAT_SHADOW_PANE;
	}-*/;

	/*
	 * This pane contains transparent elements that receive DOM mouse events for the markers. Is is above the G_MAP_FLOAT_SHADOW_PANE, so that markers in the shadow of the info window can be clickable.
	 */
	public native static int G_MAP_MARKER_MOUSE_TARGET_PANE()/*-{
		return $wnd.G_MAP_MARKER_MOUSE_TARGET_PANE;
	}-*/;
	
	/*
	 * This pane contains the info window. It is above everything else on the map. 
	 */
	public native static int G_MAP_FLOAT_PANE()/*-{
		return $wnd.G_MAP_FLOAT_PANE;
    }-*/;
	
}
