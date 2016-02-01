package com.mapitz.gwt.googleMaps.client;
/**
 * Factory for Location anchors used for GControl
 * @author aglaforge
 *
 */
public class GControlAnchor
{
	int index;
	
	protected GControlAnchor(int index)
	{
		this.index = index;
	}

	//TODO One could go so far as to simplify this and hardcode the numbers, but who knows if they will change
	
	/**
	 * G_ANCHOR_TOP_RIGHT The control will be anchored in the top right corner of the map.
	 * @return
	 */
	public static GControlAnchor G_ANCHOR_TOP_RIGHT(){
		int index = GControlAnchorImpl.G_ANCHOR_TOP_RIGHT();
		return new GControlAnchor(index);
	}

	/**
	 * G_ANCHOR_TOP_LEFT The control will be anchored in the top left corner of the map.
	 * @return 
	 */
	public static GControlAnchor G_ANCHOR_TOP_LEFT(){
		int index = GControlAnchorImpl.G_ANCHOR_TOP_LEFT();
		return new GControlAnchor(index);
	}
	
	/**
	 * G_ANCHOR_BOTTOM_RIGHT The control will be anchored in the bottom right corner of the map.
	 * @return 
	 */
	public static GControlAnchor G_ANCHOR_BOTTOM_RIGHT(){
		int index = GControlAnchorImpl.G_ANCHOR_BOTTOM_RIGHT();
		return new GControlAnchor(index);
	}
	
	/**
	 * G_ANCHOR_BOTTOM_LEFT The control will be anchored in the bottom left corner of the map.
	 * @return
	 */
	public static GControlAnchor G_ANCHOR_BOTTOM_LEFT(){
		int index = GControlAnchorImpl.G_ANCHOR_BOTTOM_LEFT();
		return new GControlAnchor(index);
	}

	/**
	 * get the numerical enum val
	 * @return
	 */
	public int getIndex()
	{
		return index;
	}

}
