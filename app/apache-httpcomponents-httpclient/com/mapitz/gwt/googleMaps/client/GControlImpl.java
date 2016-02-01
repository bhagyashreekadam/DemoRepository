package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;

class GControlImpl 
{

	/*
	 * Creates a control with buttons to pan in four directions, and zoom in and zoom out, and a zoom slider.
	 */
	public static native GControl GLargeMapControl()/*-{
	return new $wnd.GLargeMapControl();
	}-*/;
	
	/*
	 * a collapsible overview map in the corner of the screen
	 */
	public static native GControl GOverviewMapControl()/*-{
		return new $wnd.GOverviewMapControl();
	}-*/;

	/*
	 * Creates a control with buttons to switch between map types. 
	 */
	public static native GControl GMapTypeControl()/*-{
	return new $wnd.GMapTypeControl();
	}-*/;

	/*
	 * Creates a control that displays the map scale. 
	 */
	public static native GControl GScaleControl()/*-{
	return new $wnd.GScaleControl();
	}-*/;

	/*
	 * Creates a control with buttons to pan in four directions, and zoom in and zoom out. 
	 */
	public static native GControl GSmallMapControl()/*-{
	return new $wnd.GSmallMapControl();
	}-*/;

	/*
	 * Creates a control with buttons to zoom in and zoom out. 
	 */
	public static native GControl GSmallZoomControl()/*-{
	return new $wnd.GSmallZoomControl();
	}-*/;
	
	/*
	 * printable() Boolean  Returns to the map if the control should be printable.
	 */ 
	public native boolean printable(GControl self)/*-{
		return self.printable();
	}-*/;

	/*
	 * selectable() Boolean  Returns to the map if the control contains selectable text.
	 */ 
	public native boolean selectable(GControl self)/*-{
		return self.selectable();
	}-*/;
	
	/*
	 * initialize(map) Node  Will be called by the map so the control can initialize itself. The control will use the method GMap2.getContainer() to get hold of the DOM element that contains the map, and add itself to it. It returns the added element.
	 */ 
	public native Element initialize(GControl self, GMap2 map)/*-{
		return self.initialize(map);
	}-*/;
	
	/*
	 * getDefaultPosition() GControlPosition  Returns to the map the position in the map view at which the control appears by default. This will be overridden by the second argument to GMap2.addControl().
	 */ 
	public native GControlPosition getDefaultPosition(GControl self)/*-{
		return self.getDefaultPosition();
	}-*/;

}
