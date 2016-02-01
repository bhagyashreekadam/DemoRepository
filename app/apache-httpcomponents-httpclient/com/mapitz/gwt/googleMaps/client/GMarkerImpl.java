package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

class GMarkerImpl
{
	/*
	 * GMarker(point, opts?) Creates a marker at point with options specified in GMarkerOptions. By default markers are clickable & have the default icon G_DEFAULT_ICON. (Since 2.50) 
	 */
	public native static GMarker create(GLatLng point, GMarkerOptions opts)/*-{
		return new $wnd.GMarker(point, opts);
	}-*/;
	
	public native void enableDragging(GMarker self)/*-{
		self.enableDragging();
	}-*/;
	/*
	 * GMarker(point, opts?) Creates a marker at point with options specified in GMarkerOptions. By default markers are clickable & have the default icon G_DEFAULT_ICON. (Since 2.50) 
	 */
	public native static GMarker create(GLatLng point)/*-{
		return new $wnd.GMarker(point);
	}-*/;
	
	 /*
	  * openInfoWindow(content, opts?) none  Opens the map info window over the icon of the marker. The content of the info window is given as a DOM node. Only option GInfoWindowOptions.maxWidth is applicable.
	  */
	public native void openInfoWindow(GMarker self, Element content, GInfoWindowOptions opts)/*-{
		self.openInfoWindow(content, opts);
	}-*/;

	 /*
	  * openInfoWindow(content, opts?) none  Opens the map info window over the icon of the marker. The content of the info window is given as a DOM node. Only option GInfoWindowOptions.maxWidth is applicable.
	  */
	public native void openInfoWindow(GMarker self, Element content)/*-{
		self.openInfoWindow(content);
	}-*/;
	 
	/*
	 * openInfoWindowHtml(content, opts?) none  Opens the map info window over the icon of the marker. The content of the info window is given as a string that contains HTML text. Only option GInfoWindowOptions.maxWidth is applicable.
	 */ 
	public native void openInfoWindowHtml(GMarker self, String content, GInfoWindowOptions opts)/*-{
		self.openInfoWindowHtml(content, opts);
	}-*/;

	/*
	 * openInfoWindowHtml(content, opts?) none  Opens the map info window over the icon of the marker. The content of the info window is given as a string that contains HTML text. Only option GInfoWindowOptions.maxWidth is applicable.
	 */ 
	public native void openInfoWindowHtml(GMarker self, String content)/*-{
		self.openInfoWindowHtml(content);
	}-*/;
	
	/*
	 * openInfoWindowTabs(tabs, opts?) none  Opens the tabbed map info window over the icon of the marker. The content of the info window is given as an array of tabs that contain the tab content as DOM nodes. Only options GInfoWindowOptions.maxWidth and InfoWindowOptions.selectedTab are applicable.
	 */ 
	public native void openInfoWindowTabs(GMarker self, JavaScriptObject tabs, GInfoWindowOptions opts)/*-{
		self.openInfoWindowTabs(tabs, opts);
	}-*/;
	
	/*
	 * openInfoWindowTabs(tabs, opts?) none  Opens the tabbed map info window over the icon of the marker. The content of the info window is given as an array of tabs that contain the tab content as DOM nodes. Only options GInfoWindowOptions.maxWidth and InfoWindowOptions.selectedTab are applicable.
	 */ 
	public native void openInfoWindowTabs(GMarker self, JavaScriptObject tabs)/*-{
		self.openInfoWindowTabs(tabs);
	}-*/;
	
	/*
	 * openInfoWindowTabsHtml(tabs, opts?) none  Opens the tabbed map info window over the icon of the marker. The content of the info window is given as an array of tabs that contain the tab content as Strings that contain HTML text. Only options InfoWindowOptions.maxWidth and InfoWindowOptions.selectedTab are applicable.
	 */
	public native void openInfoWindowTabsHtml(GMarker self, JavaScriptObject tabs, GInfoWindowOptions opts)/*-{
		self.openInfoWindowTabsHtml(tabs, opts);
	}-*/;
	
	/*
	 * openInfoWindowTabsHtml(tabs, opts?) none  Opens the tabbed map info window over the icon of the marker. The content of the info window is given as an array of tabs that contain the tab content as Strings that contain HTML text. Only options InfoWindowOptions.maxWidth and InfoWindowOptions.selectedTab are applicable.
	 */
	public native void openInfoWindowTabsHtml(GMarker self, JavaScriptObject tabs)/*-{
		self.openInfoWindowTabsHtml(tabs);
	}-*/;
	
	/*
	 * showMapBlowup(opts?) none  Opens the map info window over the icon of the marker. The content of the info window is a closeup map around the marker position. Only options InfoWindowOptions.zoomLevel and InfoWindowOptions.mapType are applicable.
	 */ 
	public native void showMapBlowup(GMarker self, GInfoWindowOptions opts)/*-{
		self.showMapBlowup(opts);
	}-*/;

	/*
	 * showMapBlowup(opts?) none  Opens the map info window over the icon of the marker. The content of the info window is a closeup map around the marker position. Only options InfoWindowOptions.zoomLevel and InfoWindowOptions.mapType are applicable.
	 */ 
	public native void showMapBlowup(GMarker self)/*-{
		self.showMapBlowup();
	}-*/;
	
	/*
	 * getIcon() GIcon  Returns the icon of this marker, as set by the constructor.
	 */
	public native GIcon getIcon(GMarker self)/*-{
		return self.getIcon();
	}-*/;
	
	/*
	 * getPoint() GLatLng  Returns the geographical coordinates of the point at which this marker is anchored, as set by the constructor or by setPoint().
	 */
	public native GLatLng getPoint(GMarker self)/*-{
		return self.getPoint();
    }-*/;
	
	/*
	 * setPoint(point) none  Sets the geographical coordinates of the point at which this marker is anchored.
	 */
	public native void setPoint(GMarker self, GLatLng point)/*-{
		self.setPoint(point);
	}-*/;
}
