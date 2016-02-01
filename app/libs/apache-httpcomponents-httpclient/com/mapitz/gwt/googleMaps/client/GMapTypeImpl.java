package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;

class GMapTypeImpl
{
	/*
	 * GMapType(layers, projection, name, opts?) Constructs a map type with the given tile layers, projection, name, and optional parameters.
	 */
	public static native GMapType create(JavaScriptObject layers, GProjection projection, String name)/*-{
		return new $wnd.GMapType(layers, projection, name)
	}-*/;

	/*
	 * GMapType(layers, projection, name, opts?) Constructs a map type with the given tile layers, projection, name, and optional parameters.
	 */
	public static native GMapType create(JavaScriptObject layers, GProjection projection, String name, GMapTypeOptions opts)/*-{
		return new $wnd.GMapType(layers, projection, name, opts)
	}-*/;

//	Methods
//	These methods are mostly called by the map that this maptype is passed to, but some methods may also be called from outside the map, e.g. getBoundsZoomLevel().
//
//	Methods Return Value Description 

	/*
	 * getSpanZoomLevel(center, span, viewSize) Number  Returns to the map the zoom level at which the map section defined by center and span fits into the map view of the given size in pixels. 
	 */
	public native int getSpanZoomLevel(GMapType self, GLatLng center, GLatLng span, GSize viewSize)/*-{
		return self.getSpanZoomLevel(center, span, viewSize);
	}-*/;

	/*
	 * getBoundsZoomLevel(bounds, viewSize) none  Returns to the map the zoom level at which the map section defined by bounds fits into the map view of the given size in pixels.
	 */
	public native int getBoundsZoomLevel(GMapType self, GLatLngBounds bounds, GSize viewSize)/*-{
		return self.getBoundsZoomLevel(bounds, viewSize);
	}-*/;
	 
	/*
	 * getName(opt_short) String  Returns to the map the name of the map type to be used as the button label in the GMapTypeControl.
	 */
	public native String getName(GMapType self, boolean opt_short)/*-{
		return self.getName(opt_short);
	}-*/;
	
	/*
	 * getProjection() GProjection  Returns to the map the projection of this map type. 
	 */
	public native GProjection getProjection(GMapType self)/*-{
		var ret = self.getProjection();
	    return (ret === undefined) ? null : ret;
	}-*/;

	/*
	 * getTileSize() Number  Returns to the map the map tile size in pixels of this map type. The tiles are assumed to be quadratic. All tile layers have the same tile size.
	 */
	public native int getTileSize(GMapType self)/*-{
		return self.getTileSize();
	}-*/;
	
	/*
	 * getTileLayers() Array of GTileLayer  Returns to the map the array of tile layers.
	 */
	public native GTileLayer[] getTileLayers(GMapType self)/*-{
		return self.getTileLayers();
	}-*/;
	
	/*
	 * getMinimumResolution(latlng?) Number  Returns to the map the lowest zoom level at which this map type is defined.
	 */
	public native int getMinimumResolution(GMapType self, GLatLng latlng)/*-{
		return self.getMinimumResolution(latlng);
	}-*/;
	
	/*
	 * getMinimumResolution(latlng?) Number  Returns to the map the lowest zoom level at which this map type is defined.
	 */
	public native int getMinimumResolution(GMapType self)/*-{
		return self.getMinimumResolution();
	}-*/;

	/*
	 * getMaximumResolution(latlng?) Number  Returns to the map the highest zoom level at which this map type is defined.
	 */
	public native int getMaximumResolution(GMapType self, GLatLng latlng)/*-{
		return self.getMaximumResolution(latlng);
	}-*/;
	
	/*
	 * getMaximumResolution(latlng?) Number  Returns to the map the highest zoom level at which this map type is defined.
	 */
	public native int getMaximumResolution(GMapType self)/*-{
		return self.getMaximumResolution();
	}-*/;
	
	/*
	 * getTextColor() String  Returns to the map the color that is best used for text that is overlaid on the map. Used for the color of the text of the copyright message displayed by the copyroght control.
	 */
	public native String getTextColor(GMapType self)/*-{
		return self.getTextColor();
	}-*/;
	
	/*
	 * getLinkColor() String  Returns to the map the color that is best used for a hyperlink that is overlaid on the map. Used for the color of the link to the terms of use displayed by the copyroght control.
	 */
	public native String getLinkColor(GMapType self)/*-{
		return self.getLinkColor();
	}-*/;
	
	/*
	 * getErrorMessage() String  Returns to the map the error message that is displayed in areas or on zoom level where this map type doesn't have map tiles.
	 */
	public native String getErrorMessage(GMapType self)/*-{
		return self.getErrorMessage();
	}-*/;
	
	/*
	 * getCopyrights(bounds, zoom) Array of String  Returns to the map the copyright messages appropriate for the region described by bounds at the given zoom level. This is used by the GCopyrightControl to display the copyright message on the map.
	 */
	public native String[] getCopyrights(GMapType self, GLatLngBounds bounds, int zoom)/*-{
		return self.getCopyrights(bounds, zoom);
	}-*/;
	
	/*
	 * getUrlArg() String  Returns to the map a value that is used as a URL paramater value to identify this map type in permalinks to the current map view. This is currently only used by the maps application.
	 */ 
	public native String getUrlArg(GMapType self)/*-{
		return self.getUrlArg();
	}-*/;
	
//	Constants
//	Constants Description 

	/*
	 * G_NORMAL_MAP  This is the normal street map type.
	 */
	public native static GMapType G_NORMAL_MAP()/*-{
		return $wnd.G_NORMAL_MAP;
	}-*/;
	
	/*
	 * G_SATELLITE_MAP  This map type shows Google Earth satellite images.
	 */
	public native static GMapType G_SATELLITE_MAP()/*-{
		return $wnd.G_SATELLITE_MAP;
	}-*/;
	
	/*
	 * G_HYBRID_MAP  This map type shows transparent street maps over Google Earth satellite images.
	 */
	public native static GMapType G_HYBRID_MAP()/*-{
		return $wnd.G_HYBRID_MAP;
	}-*/;	
	
	/*
	 * G_DEFAULT_MAP_TYPES  An array of all three predefined map types described above.
	 */
	public native static GMapType[] G_DEFAULT_MAP_TYPES()/*-{
		return $wnd.G_DEFAULT_MAP_TYPES;
	}-*/;
//
//	Events
//	Events Arguments Description 
//	TODO newcopyright copyright  This event is fired when a new copyright is added to the copyright collection of one of the tile layers contained in this map type. 

}
