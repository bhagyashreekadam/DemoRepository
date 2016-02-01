package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * This is the interface for map projections. A map projection instance is passed to the constructor of GMapType. This interface is implemented by the class GMercatorProjection, which is used by all predefined map types. You can implement this interface if you want to define map types with different map projections.
 * @author aglaforge
 *
 */
public class GProjection extends JavaScriptObject
{
	private static GProjectionImpl impl = new GProjectionImpl();
	
	protected GProjection(int opaque)
	{
		super(opaque);
	}


	/**
	 * fromLatLngToPixel(latlng, zoom) GPoint  Returns the map coordinates in pixels for the point at the given geographical coordinates, and the given zoom level.
	 * @param latlng
	 * @param zoom
	 * @return
	 */
	public GPoint fromLatLngToPixel(GLatLng latlng, int zoom)
	{
		return impl.fromLatLngToPixel(this, latlng, zoom);
	}
	

	/**
	 * fromPixelToLatLng(pixel, zoom, unbounded) none  Returns the geographical coordinates for the point at the given map coordinates in pixels, and the given zoom level. Flag unbounded causes the geographical longitude coordinate not to wrap when beyond the -180 or 180 degrees meridian.
	 * @param pixel
	 * @param zoom
	 * @param unbounded
	 * @return
	 */
	public GLatLng fromPixelToLatLng(GPoint pixel, int zoom, boolean unbounded)
	{
		return impl.fromPixelToLatLng(this, pixel, zoom, unbounded);
	}


	/**
	 * fromPixelToLatLng(pixel, zoom, unbounded) none  Returns the geographical coordinates for the point at the given map coordinates in pixels, and the given zoom level. Flag unbounded causes the geographical longitude coordinate not to wrap when beyond the -180 or 180 degrees meridian.
	 * @param self
	 * @param pixel
	 * @param zoom
	 * @return
	 */
	public GLatLng fromPixelToLatLng(GPoint pixel, int zoom)
	{
		return impl.fromPixelToLatLng(this, pixel, zoom);
	}
	

	/**
	 * tileCheckRange(tile, zoom, tilesize) none  Returns to the map if the tile index is in a valid range for the map type. Otherwise the map will display an empty tile. It also may modify the tile index to point to another instance of the same tile in the case that the map contains more than one copy of the earth, and hence the same tile at different tile coordinates.
	 * @param self
	 * @param tile
	 * @param zoom
	 * @param tilesize
	 */
	public void tileCheckRange(GPoint tile, int zoom, int tilesize)
	{
		impl.tileCheckRange(this, tile, zoom, tilesize);
	}
	

	/**
	 * getWrapWidth(zoom) none  Returns to the map the periodicity in x-direction, i.e. the number of pixels after which the map repeats itself because it wrapped once round the earth. By default, returns Infinity, i.e. the map will not repeat itself. This is used by the map to compute the placement of overlays on map views that contain more than one copy of the earth (this usually happens only at low zoom levels). (Since 2.46)
	 * @param self
	 * @param zoom
	 */
	public void getWrapWidth(int zoom)
	{
		impl.getWrapWidth(this, zoom);
	}
}
