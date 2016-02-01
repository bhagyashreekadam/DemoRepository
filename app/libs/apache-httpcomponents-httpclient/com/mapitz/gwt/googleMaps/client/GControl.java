package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

/**
 * Interface and factory for contols to control the Map (Zoom, Scale, etc...).  Controls are added to the map using the GMap2.addControl() method.
 * <br/>In contrast to overlays, which are positioned relative to the map, controls are positioned relative to the map view, i.e. they don't move when the map moves.
 * @author aglaforge
 *
 */
public class GControl extends JavaScriptObject
{
	private static GControlImpl impl = new GControlImpl();
	
	protected GControl(int opaque) {
		super(opaque);
	}
	
	/**
	 * Creates a control with buttons to pan in four directions, and zoom in and zoom out, and a zoom slider.
	 * @return
	 */
	public static GControl GLargeMapControl(){
		return GControlImpl.GLargeMapControl();
	}

	/**
	 * Creates a control with a collapsible overview map in the corner of the screen
	 */
	public static GControl GOverviewMapControl()
	{
		return GControlImpl.GOverviewMapControl();
	}
	
	/**
	 * Creates a control with buttons to switch between map types.
	 * @return 
	 */
	public static GControl GMapTypeControl(){
		return GControlImpl.GMapTypeControl();
	}

	/**
	 * Creates a control that displays the map scale.
	 * @return 
	 */
	public static GControl GScaleControl(){
		return GControlImpl.GScaleControl();
	}

	/**
	 * Creates a control with buttons to pan in four directions, and zoom in and zoom out.
	 * @return 
	 */
	public static GControl GSmallMapControl(){
		return GControlImpl.GSmallMapControl();
	}
	
	/**
	 * Creates a control with buttons to zoom in and zoom out.
	 * @return 
	 */
	public static GControl GSmallZoomControl(){
		return GControlImpl.GSmallZoomControl();
	}
	
	/**
	 * printable() Boolean  Returns to the map if the control should be printable.
	 * @return
	 */ 
	public boolean printable()
	{
		return impl.printable(this);
	}

	/**
	 * selectable() Boolean  Returns to the map if the control contains selectable text.
	 * @return
	 */ 
	public boolean selectable()
	{
		return impl.selectable(this);
	}
	
	/**
	 * initialize(map) Node  Will be called by the map so the control can initialize itself. The control will use the method GMap2.getContainer() to get hold of the DOM element that contains the map, and add itself to it. It returns the added element.
	 * @return
	 */ 
	public Element initialize(GMap2 map)
	{
		return impl.initialize(this, map);
	}
	
	/**
	 * getDefaultPosition() GControlPosition  Returns to the map the position in the map view at which the control appears by default. This will be overridden by the second argument to GMap2.addControl().
	 * @return
	 */ 
	public GControlPosition getDefaultPosition()
	{
		return impl.getDefaultPosition(this);
	}
}
