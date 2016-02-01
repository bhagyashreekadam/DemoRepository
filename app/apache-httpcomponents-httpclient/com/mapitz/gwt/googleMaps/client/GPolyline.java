package com.mapitz.gwt.googleMaps.client;

/**
 * This is a map overlay that draws a polyline on the map, using the vector drawing facilities of the browser if they are available, or an image overlay from Google servers otherwise.
 * @author aglaforge
 *
 */
public class GPolyline extends GOverlay
{

	protected static GPolylineImpl impl = new GPolylineImpl();
	
	protected GPolyline(int opaque)
	{
		super(opaque);
	}
	
	/**
	 * Creates a polyline from an array of vertices. The color is given as a string that contains the color in hexadecimal numeric HTML style, i.e. #RRGGBB. The weight is the width of the line in pixels. The opacity is given as a number between 0 and 1. The line will be antialiased and semitransparent.
	 */
	public static GPolyline create(GLatLng[] points, String color, int weight, double opacity)
	{
    	return GPolylineImpl.create(JavaScriptObjectHelper.arrayConvert(points), color, weight, opacity);
    };

	/**
	 * Creates a polyline from an array of vertices. The color is given as a string that contains the color in hexadecimal numeric HTML style, i.e. #RRGGBB. The weight is the width of the line in pixels. The opacity is given as a number between 0 and 1. The line will be antialiased and semitransparent.
	 */
	public static GPolyline create(GLatLng[] points, String color, int weight)
	{
		return GPolylineImpl.create(JavaScriptObjectHelper.arrayConvert(points), color, weight);
	}
	
	/**
	 * Creates a polyline from an array of vertices. The color is given as a string that contains the color in hexadecimal numeric HTML style, i.e. #RRGGBB. The weight is the width of the line in pixels. The opacity is given as a number between 0 and 1. The line will be antialiased and semitransparent.
	 */
	public static GPolyline create(GLatLng[] points, String color)
	{
		return GPolylineImpl.create(JavaScriptObjectHelper.arrayConvert(points), color);
	}
	
	/**
	 * Creates a polyline from an array of vertices. The color is given as a string that contains the color in hexadecimal numeric HTML style, i.e. #RRGGBB. The weight is the width of the line in pixels. The opacity is given as a number between 0 and 1. The line will be antialiased and semitransparent.
	 */
	public static GPolyline create(GLatLng[] points)
	{
		return GPolylineImpl.create(JavaScriptObjectHelper.arrayConvert(points));
	}
	
	/**
	 * getVertexCount() Number  Returns the number of vertices in the polyline. (Since 2.46)
	 */
	public int getVertexCount()
	{
		return impl.getVertexCount(this);
	}
	 
	/**
	 * getVertex(index) GLatLng  Returns the vertex with the given index in the polyline. (Since 2.46)
	 */
	public GLatLng getVertex(int index)
	{
		return impl.getVertex(this, index);
	}

	//TODO Added remove event
}
