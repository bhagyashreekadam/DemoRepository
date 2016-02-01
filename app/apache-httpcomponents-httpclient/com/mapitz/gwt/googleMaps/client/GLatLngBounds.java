package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A GLatLngBounds instance represents a rectangle in geographical coordinates, including one that crosses the 180 degrees meridian.
 * @author aglaforge
 *
 */
public class GLatLngBounds extends JavaScriptObject
{
	private static GLatLngBoundsImpl impl = new GLatLngBoundsImpl();
	
	public GLatLngBounds(int opaque) {
		super(opaque);
	}	

	public static GLatLngBounds create()
	{
		return GLatLngBoundsImpl.CreateLatLngObject();
	}
	
	public static GLatLngBounds create(GLatLng sw, GLatLng ne)
	{
		return GLatLngBoundsImpl.CreateLatLngObject(sw, ne);
	}
	
	/**
	 * equals(other) Boolean  Returns true iff all parameters in this rectangle are equal to the parameters of the other, within a certain roundoff margin.
	 * @param other
	 * @return
	 */
	public boolean equals(GLatLngBounds other)
	{
		return impl.Equals(this, other);
	}
	
	/**
	 * contains(latlng) Boolean  Returns true iff the geographical coordinates of the point lie within this rectangle.
	 * @param latlng
	 * @return
	 */
	public boolean contains(GLatLng latlng)
	{
		return impl.Contains(this, latlng);
	}
	
	/**
	 * intersects(other) Boolean  What the name says. 
	 * @param other
	 * @return
	 */
	public boolean intersects(GLatLngBounds other)
	{
		return impl.Intersects(this, other);
	}
	
	/**
	 * containsBounds(other) Boolean  What the name says. 
	 * @param other
	 * @return
	 */
	public boolean containsBounds(GLatLngBounds other)
	{
		return impl.ContainsBounds(this, other);
	}
	
	/**
	 * extend(latlng) none  Enlarges this rectangle such that it contains the given point. In longitude direction, it is enlarged in the smaller of the two possible ways. If both are equal, it is enlarged at the eastern boundary.
	 * @param latlng
	 */
	public void extend(GLatLng latlng)
	{
		impl.Extend(this, latlng);
	}
	
	/**
	 * getSouthWest() GLatLng  Returns the point at the south-west corner of the rectangle.
	 * @return
	 */
	public GLatLng getSouthWest()
	{
		return impl.GetSouthWest(this);
	}

	/**
	 * getNorthEast() GLatLng  Returns the point at the north-east corner of the rectangle.
	 * @return
	 */
	public GLatLng getNorthEast()
	{
		return impl.GetNorthEast(this);
	}
	
	/**
	 * toSpan() GLatLng  Returns a GLatLng whose cordinates represent the size of this rectangle.
	 * @return
	 */
	public GLatLng toSpan()
	{
		return impl.ToSpan(this);
	}
	
	/**
	 * isFullLat() Boolean  Returns true if this rectangle extends from the south pole to the north pole. 
	 * @return
	 */
	public boolean isFullLat()
	{
		return impl.IsFullLat(this);
	}

	/**
	 * isFullLng() Boolean  Returns true if this rectangle extends fully around the earth in the longitude direction.
	 * @return
	 */
	public boolean isFullLng()
	{
		return impl.IsFullLng(this);
	}

	/**
	 * isEmpty() Boolean  Returns true if this rectangle is empty.
	 * @return
	 */
	public boolean isEmpty()
	{
		return impl.IsEmpty(this);
	}
	
	/**
	 * getCenter() GLatLng  Returns the point at the center of the rectangle. (Since 2.52)
	 * @return
	 */
	public GLatLng getCenter()
	{
		return impl.GetCenter(this);
	}  
}
