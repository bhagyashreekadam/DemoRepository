package com.mapitz.gwt.googleMaps.client;

class GControlPositionImpl
{
	/*
	 * Creates a specification for a control position.
	 */
	public static native GControlPosition create(int anchor, GSize offset)/*-{
		return new $wnd.GControlPosition(anchor, offset);
	}-*/;
}
