package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * Options for the InfoWindow
 * @author aglaforge
 *
 */
public class GInfoWindowOptions extends JavaScriptObject
{
	protected GInfoWindowOptions(int opaque)
	{
		super(opaque);
	}

	public static GInfoWindowOptions create()
	{
		return GInfoWindowOptionsImpl.create();
	}
	
	/**
	 * selectedTab Number Selects the tab with the given index, starting at 0, instead of the first tab (with index 0). 
	 */
	public int getSelectedTab()
	{
		return JavaScriptObjectHelper.getAttributeAsInt(this, "selectedTab");
	}
	
	/**
	 * selectedTab Number Selects the tab with the given index, starting at 0, instead of the first tab (with index 0).
	 */
	public void setSelectedTab(int var)
	{
		JavaScriptObjectHelper.setAttribute(this, "selectedTab", var);
	}

	/**
	 * maxWidth Number Maximum width of the info window content, in pixels. 
	 */
	public int getMaxWidth()
	{
		return JavaScriptObjectHelper.getAttributeAsInt(this, "maxWidth");
	}
	
	/**
	 * maxWidth Number Maximum width of the info window content, in pixels.
	 */
	public void setMaxWidth(int var)
	{
		JavaScriptObjectHelper.setAttribute(this, "maxWidth", var);
	}
	
	/**
	 * zoomLevel Number Pertinent for showMapBlowup() only. The zoom level of the blowup map in the info window. 
	 */
	public int getZoomLevel()
	{
		return JavaScriptObjectHelper.getAttributeAsInt(this, "zoomLevel");
	}
	
	/**
	 * zoomLevel Number Pertinent for showMapBlowup() only. The zoom level of the blowup map in the info window.
	 */
	public void setZoomLevel(int var)
	{
		JavaScriptObjectHelper.setAttribute(this, "zoomLevel", var);
	} 

	/**
	 * mapType GMapType Pertinent for showMapBlowup() only. The map type of the blowup map in the info window. 
	 */
	public GMapType getMapType()
	{
		return getMapType(this);
	}
	
	private native GMapType getMapType(GInfoWindowOptions self) /*-{
		var ret = self.mapType;
		return (ret === undefined) ? null : ret;
	}-*/;
	
	/**
	 * mapType GMapType Pertinent for showMapBlowup() only. The map type of the blowup map in the info window.
	 */
	public void setMapType(GMapType var)
	{
		JavaScriptObjectHelper.setAttribute(this, "mapType", var);
	}
	
	//TODO Code these as Events
//	onOpenFn Function Function is called after the info window is opened and the content is displayed. 
//	onCloseFn Function Function is called when the info window is closed. 

	
}
