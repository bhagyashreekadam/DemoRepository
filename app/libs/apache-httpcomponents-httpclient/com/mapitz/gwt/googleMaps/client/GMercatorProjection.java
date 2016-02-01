package com.mapitz.gwt.googleMaps.client;

/**
 * This implementation of the GProjection interface for the mercator projection is used by all predefined map types.
 * @author aglaforge
 *
 */
public class GMercatorProjection extends GProjection
{
	//private static GMercatorProjectionImpl impl = new GMercatorProjectionImpl();
	
	protected GMercatorProjection(int opaque)
	{
		super(opaque);
	}
	
	public static GMercatorProjection create(int zoomlevels)
	{
		return GMercatorProjectionImpl.create(zoomlevels);
	}

}
