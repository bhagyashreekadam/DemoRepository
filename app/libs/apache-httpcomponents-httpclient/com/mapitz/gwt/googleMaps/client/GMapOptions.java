package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Additional options for the GMap
 * @author aglaforge
 *
 */
public class GMapOptions extends JavaScriptObject
{

	protected GMapOptions(int opaque)
	{
		super(opaque);
	}

	public static GMapOptions create()
	{
		return GMapOptionsImpl.create();
	}

	/**
	 * size GSize Sets the size in pixels of the map. The container that is
	 * passed to the map constructor will be resized to the given size. By
	 * default, the map will assume the size of its container.
	 */
	public void setSize(GSize size)
	{
		JavaScriptObjectHelper.setAttribute(this, "size", size);
	}

	/**
	 * size GSize Sets the size in pixels of the map. The container that is
	 * passed to the map constructor will be resized to the given size. By
	 * default, the map will assume the size of its container.
	 */
	public GSize getSize()
	{
		return getSize(this);
	}
	
	private native GSize getSize(GMapOptions self) /*-{
		var ret = self.size;
		return (ret === undefined) ? null : ret;
	}-*/;

	/**
	 * mapTypes Array of GMapType Array of map types to be used by this map. By
	 * default, G_DEFAULT_MAP_TYPES is used. You can use this option to restrict
	 * the set of predefined map types that is displayed on the map, or to pass
	 * your own map types to the map. See also GMap2.addMapType().
	 */
	public void setMapTypes(GMapType[] array)
	{
		JavaScriptObjectHelper.setAttribute(this, "mapTypes", array);
	}

	/**
	 * mapTypes Array of GMapType Array of map types to be used by this map. By
	 * default, G_DEFAULT_MAP_TYPES is used. You can use this option to restrict
	 * the set of predefined map types that is displayed on the map, or to pass
	 * your own map types to the map. See also GMap2.addMapType().
	 */
	public GMapType[] getMapTypes()
	{
		return (GMapType[]) JavaScriptObjectHelper
				.getAttributeAsJavaScriptObjectArray(this, "mapTypes");
	}

}
