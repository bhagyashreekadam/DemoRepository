package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A copyright object contains information about which copyright message applies to a region of the map given by a rectangle, at a given zoom level. You need this object only if you implement custom map types or tile layers.
 * @author aglaforge
 *
 */
public class GCopyright extends JavaScriptObject
{
	public static GCopyrightImpl impl = new GCopyrightImpl();

	protected GCopyright(int opaque)
	{
		super(opaque);
	}
	
	/**
	 * Creates a copyright information object with the given properties.
	 * @param id
	 * @param bounds
	 * @param minZoom
	 * @param text
	 * @return
	 */
	public static GCopyright create(int id, GLatLngBounds bounds, int minZoom, String text)
	{
		return GCopyrightImpl.create(id, bounds, minZoom, text);
	}
	

	/**
	 * id Number A unique identifier for this copyright information.
	 * @return
	 */
	public int getId()
	{
		return Integer.parseInt(JavaScriptObjectHelper.getAttribute(this, "id"));
	}

	/**
	 * id Number A unique identifier for this copyright information.
	 * @param id
	 */
	public void setId(int id)
	{
		JavaScriptObjectHelper.setAttribute(this, "id", String.valueOf(id));
	}
	

	/**
	 * minZoom Number The lowest zoom level at which this information applies.
	 * @return
	 */
	public int getMinZooom()
	{
		return Integer.parseInt(JavaScriptObjectHelper.getAttribute(this, "minZoom"));
	}


	/**
	 * minZoom Number The lowest zoom level at which this information applies.
	 * @param id
	 */
	public void setMinZooom(int id)
	{
		JavaScriptObjectHelper.setAttribute(this, "minZoom", String.valueOf(id));
	}


	/**
	 * bounds GLatLngBounds The region to which this information applies.
	 * @return
	 */
	public GLatLngBounds getBounds()
	{
		return impl.getBounds(this);
	}

	/**
	 * bounds GLatLngBounds The region to which this information applies.
	 * @param bounds
	 */
	public void setBounds(GLatLngBounds bounds)
	{
		JavaScriptObjectHelper.setAttribute(this, "bounds", bounds);
	}
	

	/**
	 * text String The text of the copyright message.
	 * @return
	 */
	public String getText()
	{
		return JavaScriptObjectHelper.getAttribute(this, "text");
	}


	/**
	 * text String The text of the copyright message. 
	 * @param text
	 */
	public void setText(String text)
	{
		JavaScriptObjectHelper.setAttribute(this, "text", text);
	}

}
