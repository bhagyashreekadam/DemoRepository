package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A GPoint represents a point on the map by its pixel coordinates. Notice that in v2, it doesn't represent a point on the earth by its geographical coordinates anymore. Geographical coordinates are now represented by GLatLng.
 * <br/>In the map coordinate system, the x coordinate increases to the left, and the y coordinate increases downwards.
 * <br/>Notice that while the two parameters of a GPoint are accessible as properties x and y, it is better to never modify them, but to create a new object with different paramaters instead.
 * @author aglaforge
 *
 */
public class GPoint extends JavaScriptObject
{
	private static GPointImpl impl = new GPointImpl();
	
	protected GPoint(int opaque)
	{
		super(opaque);
	}
	
	public static GPoint create(int x, int y)
	{
		return GPointImpl.CreateGPoint(x,y);
	}


	/**
	 * x Number x coordinate, increases to the left.
	 * @return
	 */
	public int getX()
	{
		return Integer.parseInt(JavaScriptObjectHelper.getAttribute(this, "x"));
	}

	/**
	 * x Number x coordinate, increases to the left.
	 * @param x
	 */
	public void setX(int x)
	{
		JavaScriptObjectHelper.setAttribute(this, "x", String.valueOf(x));
	}
	
	/**
	 * y Number y coordinate, increases downwards. 
	 * @return
	 */
	public int getY()
	{
		return Integer.parseInt(JavaScriptObjectHelper.getAttribute(this, "y"));
	}

	/**
	 * y Number y coordinate, increases downwards.
	 * @param y
	 */ 
	public void setY(int y)
	{
		JavaScriptObjectHelper.setAttribute(this, "y", String.valueOf(y));
	}
	
	public boolean equals(GPoint other)
	{
		return impl.Equals(this, other);
	}
}
