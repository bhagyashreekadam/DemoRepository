package com.mapitz.gwt.googleMaps.client;

/**
 * Factory for these constants which define the layering system that is used by overlay to display themselves on the map. There are different layers for icons, shadows, the info window, the shadow on the info window, and transparent mouse event catching objects.
 * @author aglaforge
 *
 */
public class GMapPane
{
	int index;
	
	protected GMapPane(int index)
	{
		this.index = index;
	}

	//TODO One could go so far as to simplify this and hardcode the numbers, but who knows if they will change

	/**
	 * This pane is still below the shadows of the markers, directly on top of the map. It contains for instance the polylines.
	 */
	public static GMapPane G_MAP_MAP_PANE(){
		int index = GMapPaneImpl.G_MAP_MAP_PANE();
		return new GMapPane(index);
	}

	/**
	 * This pane contains the shadows of the markers. It is below the markers.
	 */
	public static GMapPane G_MAP_MARKER_SHADOW_PANE(){
		int index = GMapPaneImpl.G_MAP_MARKER_SHADOW_PANE();
		return new GMapPane(index);
	}
	
	/**
	 * This pane contains the markers.
	 */
	public static GMapPane G_MAP_MARKER_PANE(){
		int index = GMapPaneImpl.G_MAP_MARKER_PANE();
		return new GMapPane(index);
	}

	/**
	 * This pane conatains the shadow of the info window. It is above the G_MAP_MARKER_PANE, so that markers can be in the shadow of the info window.
	 */
	public static GMapPane G_MAP_FLOAT_SHADOW_PANE(){
		int index = GMapPaneImpl.G_MAP_FLOAT_SHADOW_PANE();
		return new GMapPane(index);
	}

	/**
	 * This pane contains transparent elements that receive DOM mouse events for the markers. Is is above the G_MAP_FLOAT_SHADOW_PANE, so that markers in the shadow of the info window can be clickable.
	 */
	public static GMapPane G_MAP_MARKER_MOUSE_TARGET_PANE(){
		int index = GMapPaneImpl.G_MAP_MARKER_MOUSE_TARGET_PANE();
		return new GMapPane(index);
	}
	
	/**
	 * This pane contains the info window. It is above everything else on the map. 
	 */
	public static GMapPane G_MAP_FLOAT_PANE(){
		int index = GMapPaneImpl.G_MAP_FLOAT_PANE();
		return new GMapPane(index);
	}	

	public int getIndex()
	{
		return index;
	}

}
