package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Additional options of the GMapType
 * @author aglaforge
 *
 */
public class GMapTypeOptions extends JavaScriptObject
{

	//private static GMapTypeOptionsImpl impl = new GMapTypeOptionsImpl();
	
	protected GMapTypeOptions(int opaque)
	{
		super(opaque);
	}

	public static GMapTypeOptions create()
	{
		return GMapTypeOptionsImpl.create();
	}
	
	/**
	 * shortName String Sets the short name of the map type that is returned from GMapType.getName(true). Default is the same as the name. 
	 */
	public String getShortName()
	{
		return JavaScriptObjectHelper.getAttribute(this, "shortName");
	}
	
	/**
	 * shortName String Sets the short name of the map type that is returned from GMapType.getName(true). Default is the same as the name. 
	 */
	public void setShortName(String val)
	{
		JavaScriptObjectHelper.setAttribute(this, "shortName", val);
	}

	/**
	 * urlArg String Sets the url argument of the map type that is returned from GMapType.getUrlArg(). Default is the empty string.
	 */
	public String getUrlArg()
	{
		return JavaScriptObjectHelper.getAttribute(this, "urlArg");
	}
	
	/**
	 * urlArg String Sets the url argument of the map type that is returned from GMapType.getUrlArg(). Default is the empty string. 
	 */
	public void setUrlArg(String val)
	{
		JavaScriptObjectHelper.setAttribute(this, "urlArg", val);
	}  

	/**
	 * maxResolution Number Sets the maximum zoom level of this map type, returned by GMapType.getMaximumResolution(). Default is the maximum of all tile layers.
	 */
	public int getMaxResolution()
	{
		return Integer.parseInt(JavaScriptObjectHelper.getAttribute(this, "maxResolution"));
	}
	
	/**
	 * maxResolution Number Sets the maximum zoom level of this map type, returned by GMapType.getMaximumResolution(). Default is the maximum of all tile layers. 
	 */
	public void setMaxResolution(int val)
	{
		JavaScriptObjectHelper.setAttribute(this, "maxResolution", String.valueOf(val));
	}	
	
	/**
	 * minResolution Number Sets the minimum zoom level of this map type, returned by GMapType.getMinimumResolution(). Default is the minimum of all tile layers.
	 */
	public int getMinResolution()
	{
		return Integer.parseInt(JavaScriptObjectHelper.getAttribute(this, "minResolution"));
	}
	
	/**
	 * minResolution Number Sets the minimum zoom level of this map type, returned by GMapType.getMinimumResolution(). Default is the minimum of all tile layers. 
	 */
	public void setMinResolution(int val)
	{
		JavaScriptObjectHelper.setAttribute(this, "minResolution", String.valueOf(val));
	}
	
	/**
	 * tileSize Number Set the tile size returned by GMapType.getTileSize(). Default is 256.
	 */
	public int getTileSize()
	{
		return Integer.parseInt(JavaScriptObjectHelper.getAttribute(this, "tileSize"));
	}
	
	/**
	 * tileSize Number Set the tile size returned by GMapType.getTileSize(). Default is 256. 
	 */
	public void setTileSize(int val)
	{
		JavaScriptObjectHelper.setAttribute(this, "tileSize", String.valueOf(val));
	}	
	
	/**
	 * textColor String Sets the text color returned by GMapType.getTextColor(). Default is "black".
	 */
	public String getTextColor()
	{
		return JavaScriptObjectHelper.getAttribute(this, "textColor");
	}
	
	/**
	 * textColor String Sets the text color returned by GMapType.getTextColor(). Default is "black". 
	 */
	public void setTextColor(String val)
	{
		JavaScriptObjectHelper.setAttribute(this, "textColor", val);
	}
	
	/**
	 * linkColor String Sets the text color returned by GMapType.getLinkColor(). Default is "#7777cc".
	 */
	public String getLinkColor()
	{
		return JavaScriptObjectHelper.getAttribute(this, "linkColor");
	}
	
	/**
	 * linkColor String Sets the text color returned by GMapType.getLinkColor(). Default is "#7777cc". 
	 */
	public void setLinkColor(String val)
	{
		JavaScriptObjectHelper.setAttribute(this, "linkColor", val);
	}
	
	/**
	 * errorMessage String Sets the error message returned by GMapType.getErrorMessage(). Default is the empty string.
	 */
	public String getErrorMessage()
	{
		return JavaScriptObjectHelper.getAttribute(this, "errorMessage");
	}
	
	/**
	 * errorMessage String Sets the error message returned by GMapType.getErrorMessage(). Default is the empty string. 
	 */
	public void setErrorMessage(String val)
	{
		JavaScriptObjectHelper.setAttribute(this, "errorMessage", val);
	} 	
}
