package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * This class described the position of a control in the map view. It consists of a corner relative to where the control is postioned, and an offset that determines this position. It can be passed as optional argument position to the method GMap2.addControl(), and it is returned from method GControl.getDefaultPosition()
 * @author aglaforge
 *
 */
public class GControlPosition extends JavaScriptObject
{

	protected GControlPosition(int opaque)
	{
		super(opaque);
	}
	
	/**
	 * Creates a specification for a control position.
	 * @param anchor
	 * @param offset
	 * @return
	 */
	public static GControlPosition create(GControlAnchor anchor, GSize offset)
	{
		return GControlPositionImpl.create(anchor.getIndex(), offset);
	}

}
