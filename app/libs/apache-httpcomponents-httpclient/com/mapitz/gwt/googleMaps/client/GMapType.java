package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The are some predefined map types. This class can be used to define custom map types. In order to pass them to the map, use the GMap2 constructor, or the GMap2.addMapType() method.
 * <br/>This class can also be subclassed. Constructor arguments can be omitted if instantiated as a prototype. A subclass constructor must invoke the GMapType constructor using call().
 * @author aglaforge
 *
 */
public class GMapType extends JavaScriptObject
{
	private static GMapTypeImpl impl = new GMapTypeImpl();
	
	protected GMapType(int opaque)
	{
		super(opaque);
	}

	/**
	 * GMapType(layers, projection, name, opts?) Constructs a map type with the given tile layers, projection, name, and optional parameters.
	 */
	public static GMapType create(GTileLayer[] layers, GProjection projection, String name)
	{
		return GMapTypeImpl.create(JavaScriptObjectHelper.arrayConvert(layers), projection, name);
	}

	/**
	 * GMapType(layers, projection, name, opts?) Constructs a map type with the given tile layers, projection, name, and optional parameters.
	 */
	public static GMapType create(GTileLayer[] layers, GProjection projection, String name, GMapTypeOptions opts)
	{
		return GMapTypeImpl.create(JavaScriptObjectHelper.arrayConvert(layers), projection, name, opts);
	}

	/**
	 * getSpanZoomLevel(center, span, viewSize) Number  Returns to the map the zoom level at which the map section defined by center and span fits into the map view of the given size in pixels. 
	 */
	public int getSpanZoomLevel(GLatLng center, GLatLng span, GSize viewSize){
		return impl.getSpanZoomLevel(this, center, span, viewSize);
	}

	/**
	 * getBoundsZoomLevel(bounds, viewSize) none  Returns to the map the zoom level at which the map section defined by bounds fits into the map view of the given size in pixels.
	 */
	public int getBoundsZoomLevel(GLatLngBounds bounds, GSize viewSize){
		return impl.getBoundsZoomLevel(this, bounds, viewSize);
	}
	 
	/**
	 * getName(opt_short) String  Returns to the map the name of the map type to be used as the button label in the GMapTypeControl.
	 */
	public String getName(boolean opt_short){
		return impl.getName(this, opt_short);
	}
	
	/**
	 * getProjection() GProjection  Returns to the map the projection of this map type. 
	 */
	public GProjection getProjection(){
		return impl.getProjection(this);
	}

	/**
	 * getTileSize() Number  Returns to the map the map tile size in pixels of this map type. The tiles are assumed to be quadratic. All tile layers have the same tile size.
	 */
	public int getTileSize(){
		return impl.getTileSize(this);
	}
	
	/**
	 * getTileLayers() Array of GTileLayer  Returns to the map the array of tile layers.
	 */
	//TODO This might need a helper method to conver the tiles over
	public GTileLayer[] getTileLayers(){
		return impl.getTileLayers(this);
	}
	
	/**
	 * getMinimumResolution(latlng?) Number  Returns to the map the lowest zoom level at which this map type is defined.
	 */
	public int getMinimumResolution(GLatLng latlng){
		return impl.getMinimumResolution(this,latlng);
	}
	
	/**
	 * getMinimumResolution(latlng?) Number  Returns to the map the lowest zoom level at which this map type is defined.
	 */
	public int getMinimumResolution(){
		return impl.getMinimumResolution(this);
	}

	/**
	 * getMaximumResolution(latlng?) Number  Returns to the map the highest zoom level at which this map type is defined.
	 */
	public int getMaximumResolution(GLatLng latlng){
		return impl.getMaximumResolution(this, latlng);
	}
	
	/**
	 * getMaximumResolution(latlng?) Number  Returns to the map the highest zoom level at which this map type is defined.
	 */
	public int getMaximumResolution(){
		return impl.getMaximumResolution(this);
	}
	
	/**
	 * getTextColor() String  Returns to the map the color that is best used for text that is overlaid on the map. Used for the color of the text of the copyright message displayed by the copyroght control.
	 */
	public String getTextColor(){
		return impl.getTextColor(this);
	}
	
	/**
	 * getLinkColor() String  Returns to the map the color that is best used for a hyperlink that is overlaid on the map. Used for the color of the link to the terms of use displayed by the copyroght control.
	 */
	public String getLinkColor(){
		return impl.getLinkColor(this);
	}
	
	/**
	 * getErrorMessage() String  Returns to the map the error message that is displayed in areas or on zoom level where this map type doesn't have map tiles.
	 */
	public String getErrorMessage(){
		return impl.getErrorMessage(this);
	}
	
	/**
	 * getCopyrights(bounds, zoom) Array of String  Returns to the map the copyright messages appropriate for the region described by bounds at the given zoom level. This is used by the GCopyrightControl to display the copyright message on the map.
	 */
	public String[] getCopyrights(GLatLngBounds bounds, int zoom){
		return impl.getCopyrights(this, bounds, zoom);
	}
	
	/**
	 * getUrlArg() String  Returns to the map a value that is used as a URL paramater value to identify this map type in permalinks to the current map view. This is currently only used by the maps application.
	 */ 
	public String getUrlArg(){
		return impl.getUrlArg(this);
	}

	/**
	 * G_NORMAL_MAP  This is the normal street map type.
	 */
	public static GMapType G_NORMAL_MAP()
	{
		return GMapTypeImpl.G_NORMAL_MAP();
	}
	
	/**
	 * G_SATELLITE_MAP  This map type shows Google Earth satellite images.
	 */
	public static GMapType G_SATELLITE_MAP()
	{
		return GMapTypeImpl.G_SATELLITE_MAP();
	}
	
	/**
	 * G_HYBRID_MAP  This map type shows transparent street maps over Google Earth satellite images.
	 */
	public static GMapType G_HYBRID_MAP()
	{
		return GMapTypeImpl.G_HYBRID_MAP();
	}	
	
	/**
	 * G_DEFAULT_MAP_TYPES  An array of all three predefined map types described above.
	 */
	public static GMapType[] G_DEFAULT_MAP_TYPES()
	{
		return GMapTypeImpl.G_DEFAULT_MAP_TYPES();
	}

}
