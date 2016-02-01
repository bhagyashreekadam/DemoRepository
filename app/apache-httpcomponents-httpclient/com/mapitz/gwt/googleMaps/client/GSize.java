package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A GSize is the size in pixels of a rectangular area of the map. The size object has two parameters, width and height. Width is a difference in the x-coordinate; height is a difference in the y-coordinate, of points.
 * <br/>Notice that while the two parameters of a GSize are accessible as properties width and height, it is better to never modify them, but to create a new object with different paramaters instead.
 * @author aglaforge
 *
 */
public class GSize extends JavaScriptObject
{	
	protected static GSizeImpl impl = new GSizeImpl();
	
	public static GSize create(int width, int height)
	{
		return GSizeImpl.create(width, height);
	}
	
	public GSize(int opaque) {
		super(opaque);
	}
	
	public int getHeight()
	{
		return Integer.parseInt(JavaScriptObjectHelper.getAttribute(this, "height"));
	}

	public void setHeight(int val)
	{
		JavaScriptObjectHelper.setAttribute(this, "height", val);
	}
	
	public int getWidth()
	{
		return Integer.parseInt(JavaScriptObjectHelper.getAttribute(this, "width"));
	}
	
	public void setWidth(int val)
	{
		JavaScriptObjectHelper.setAttribute(this, "width", val);
	}
	
	public boolean equals(GSize other)
	{
		return impl.equals(this, other);
	}
}
