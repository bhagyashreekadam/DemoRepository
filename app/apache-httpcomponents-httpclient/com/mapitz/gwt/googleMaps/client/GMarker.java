package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;

/**
 * A GMarker marks a position on the map. It implements the GOverlay interface and thus is added to the map using the GMap2.addOverlay() method.
 * <br/>A marker object has a point, which is the geographical position where the marker is anchored on the map, and an icon. If the icon is not set in the constructor, the default icon G_DEFAULT_ICON is used.
 * <br/>After it is added to a map, the info window of that map can be opened through the marker. The marker object will fire mouse events and infowindow events.
 * @author aglaforge
 *
 */
public class GMarker extends GOverlay
{

	protected static GMarkerImpl impl = new GMarkerImpl();
	
	protected GMarker(int opaque)
	{
		super(opaque);
	}

	/**
	 * GMarker(point, opts?) Creates a marker at point with options specified in GMarkerOptions. By default markers are clickable & have the default icon G_DEFAULT_ICON. (Since 2.50) 
	 */
	public static GMarker create(GLatLng point, GMarkerOptions opts)
	{
		return GMarkerImpl.create(point, opts);
	}
	
	/**
	 * GMarker(point, opts?) Creates a marker at point with options specified in GMarkerOptions. By default markers are clickable & have the default icon G_DEFAULT_ICON. (Since 2.50) 
	 */
	public static GMarker create(GLatLng point)
	{
		return GMarkerImpl.create(point);
	}
	
	 /**
	  * openInfoWindow(content, opts?) none  Opens the map info window over the icon of the marker. The content of the info window is given as a DOM node. Only option GInfoWindowOptions.maxWidth is applicable.
	  */
	public void openInfoWindow( Element content, GInfoWindowOptions opts){
		impl.openInfoWindow(this, content, opts);
	}

	 /**
	  * openInfoWindow(content, opts?) none  Opens the map info window over the icon of the marker. The content of the info window is given as a DOM node. Only option GInfoWindowOptions.maxWidth is applicable.
	  */
	public void openInfoWindow( Element content){
		impl.openInfoWindow(this, content);
	}
	 
	/**
	 * openInfoWindowHtml(content, opts?) none  Opens the map info window over the icon of the marker. The content of the info window is given as a string that contains HTML text. Only option GInfoWindowOptions.maxWidth is applicable.
	 */ 
	public void openInfoWindowHtml( String content, GInfoWindowOptions opts){
		impl.openInfoWindowHtml(this, content, opts);
	}

	/**
	 * openInfoWindowHtml(content, opts?) none  Opens the map info window over the icon of the marker. The content of the info window is given as a string that contains HTML text. Only option GInfoWindowOptions.maxWidth is applicable.
	 */ 
	public void openInfoWindowHtml( String content){
		impl.openInfoWindowHtml(this, content);
	}

	/**
	 * Undocumented method to enable Draggable points
	 */ 
	public void enableDragging( ){
		impl.enableDragging(this);
	}
	
	/**
	 * openInfoWindowTabs(tabs, opts?) none  Opens the tabbed map info window over the icon of the marker. The content of the info window is given as an array of tabs that contain the tab content as DOM nodes. Only options GInfoWindowOptions.maxWidth and InfoWindowOptions.selectedTab are applicable.
	 */ 
	public void openInfoWindowTabs( GInfoWindowTab[] tabs, GInfoWindowOptions opts){
		impl.openInfoWindowTabs(this, JavaScriptObjectHelper.arrayConvert(tabs), opts);
	}
	
	/**
	 * openInfoWindowTabs(tabs, opts?) none  Opens the tabbed map info window over the icon of the marker. The content of the info window is given as an array of tabs that contain the tab content as DOM nodes. Only options GInfoWindowOptions.maxWidth and InfoWindowOptions.selectedTab are applicable.
	 */ 
	public void openInfoWindowTabs( GInfoWindowTab[] tabs){
		impl.openInfoWindowTabs(this, JavaScriptObjectHelper.arrayConvert(tabs));
	}
	
	/**
	 * openInfoWindowTabsHtml(tabs, opts?) none  Opens the tabbed map info window over the icon of the marker. The content of the info window is given as an array of tabs that contain the tab content as Strings that contain HTML text. Only options InfoWindowOptions.maxWidth and InfoWindowOptions.selectedTab are applicable.
	 */
	public void openInfoWindowTabsHtml( GInfoWindowTab[] tabs, GInfoWindowOptions opts){
		impl.openInfoWindowTabsHtml(this, JavaScriptObjectHelper.arrayConvert(tabs), opts);
	}
	
	/**
	 * openInfoWindowTabsHtml(tabs, opts?) none  Opens the tabbed map info window over the icon of the marker. The content of the info window is given as an array of tabs that contain the tab content as Strings that contain HTML text. Only options InfoWindowOptions.maxWidth and InfoWindowOptions.selectedTab are applicable.
	 */
	public void openInfoWindowTabsHtml( GInfoWindowTab[] tabs){
		impl.openInfoWindowTabsHtml(this,  JavaScriptObjectHelper.arrayConvert(tabs));
	}
	
	/**
	 * showMapBlowup(opts?) none  Opens the map info window over the icon of the marker. The content of the info window is a closeup map around the marker position. Only options InfoWindowOptions.zoomLevel and InfoWindowOptions.mapType are applicable.
	 */ 
	public void showMapBlowup( GInfoWindowOptions opts){
		impl.showMapBlowup(this, opts);
	}

	/**
	 * showMapBlowup(opts?) none  Opens the map info window over the icon of the marker. The content of the info window is a closeup map around the marker position. Only options InfoWindowOptions.zoomLevel and InfoWindowOptions.mapType are applicable.
	 */ 
	public void showMapBlowup(){
		impl.showMapBlowup(this);
	}
	
	/**
	 * getIcon() GIcon  Returns the icon of this marker, as set by the constructor.
	 */
	public GIcon getIcon(){
		return impl.getIcon(this);
	}
	
	/**
	 * getPoint() GLatLng  Returns the geographical coordinates of the point at which this marker is anchored, as set by the constructor or by setPoint().
	 */
	public GLatLng getPoint(){
		return impl.getPoint(this);
    }
	
	/**
	 * setPoint(point) none  Sets the geographical coordinates of the point at which this marker is anchored.
	 */
	public void setPoint( GLatLng point){
		impl.setPoint(this,point);
	}
}
