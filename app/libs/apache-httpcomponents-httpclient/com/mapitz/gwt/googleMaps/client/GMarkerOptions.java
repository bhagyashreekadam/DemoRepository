package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * Additional options for the GMarker
 * @author aglaforge
 *
 */
public class GMarkerOptions extends JavaScriptObject
{

	protected GMarkerOptions(int opaque)
	{
		super(opaque);
	}
	
	public static GMarkerOptions create()
	{
		return GMarkerOptionsImpl.create();
	}
	
	/*
	 * Undocumented Dragging
	 */
	public boolean getDraggable()
	{
		return JavaScriptObjectHelper.getAttributeAsBoolean(this, "draggable");
	}

	/*
	 * Undocumented Dragging
	 */
	public void setDraggable(boolean draggable)
	{
		JavaScriptObjectHelper.setAttribute(this, "draggable", draggable);
	}
	 
	/*
	 * icon GIcon Chooses the Icon for this class. If not specified, G_DEFAULT_ICON is used. (Since 2.50) 
	 */
	public GIcon getIcon()
	{
		return getIcon(this);
	}
	
	private native GIcon getIcon(GMarkerOptions self) /*-{
		var ret = self.icon;
		return (ret === undefined) ? null : ret;
	}-*/;
	
	/*
	 * icon GIcon Chooses the Icon for this class. If not specified, G_DEFAULT_ICON is used. (Since 2.50)
	 */
	public void setIcon(GIcon icon)
	{
		JavaScriptObjectHelper.setAttribute(this, "icon", icon);
	}

	/*
	 * clickable Boolean Toggles whether or not the marker is clickable. Markers that are not clickable or draggable are inert, consume less resources and do not respond to any events. The default value for this option is true, i.e. if the option is not specified, the marker will be clickable. (Since 2.50)
	 */
	public boolean getClickable()
	{
		return JavaScriptObjectHelper.getAttributeAsBoolean(this, "clickable");
	}
	
	/*
	 * clickable Boolean Toggles whether or not the marker is clickable. Markers that are not clickable or draggable are inert, consume less resources and do not respond to any events. The default value for this option is true, i.e. if the option is not specified, the marker will be clickable. (Since 2.50)
	 */
	public void setClickable(boolean clickable)
	{
		JavaScriptObjectHelper.setAttribute(this, "clickable", clickable);
	}

	/*
	 * title String This string will appear as tooltip on the marker, i.e. it will work just as the title attribute on HTML elements. (Since 2.50) 
	 */
	public String getTitle()
	{
		return JavaScriptObjectHelper.getAttribute(this, "title");
	}
	
	/*
	 * title String This string will appear as tooltip on the marker, i.e. it will work just as the title attribute on HTML elements. (Since 2.50)  
	 */
	public void setTitle(String val)
	{
		JavaScriptObjectHelper.setAttribute(this, "title", val);
	} 	

}
