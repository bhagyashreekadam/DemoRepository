package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * The basic GMap2Widget, the is the class you need to start with in the GWT framework.
 * <br/>Example:
 * <br/>GMap2Widget mapWidget = new GMap2Widget(e);
 * <br/>
 * <br/>access the GMap2 object by:
 * <br/>GMap2 gmaps = mapWidget.getGmap(); 
 * @author aglaforge
 *
 */
public class GMap2Widget extends Widget
{
	GMap2 gmap;
	
	public GMap2Widget(Element e)
	{
	    setElement(e);
	}
	
	public GMap2Widget(String height, String width)
	{
		Element e = DOM.createDiv();
	    setElement(e);
	    setHeight(height);
	    setWidth(width);
	}
	
	public void setHeight(String height)
	{
		super.setHeight(height);
		if (gmap != null) gmap.checkResize();
	}

	public void setWidth(String width)
	{
		super.setWidth(width);
		if (gmap != null) gmap.checkResize();
	}

	public GMap2 getGmap()
	{
		//The preference here is lazy initalization
		if (gmap == null)
		{
			gmap = GMap2.create(getElement());
			gmap.enableAutomatedCheckResizeOnMoveEnd();
			gmap.enableCheckResizeOnLoad();
			//Corrects a centering issue
			gmap.checkResize();
		}
		return gmap;
	}
}
