package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * You implement this interface in order to provide custom map tile layers. Your implementation of this interface should use an instance of GTileLayer as a prototype, because this implements the copyright handling for you.
 * @author aglaforge
 *
 */
public abstract class GTileLayer extends JavaScriptObject
{
	private static GTileLayerImpl impl = new GTileLayerImpl();
	
	public GTileLayer(int opaque)
	{
		super(opaque);
	}
	
	/**
	 * GTileLayer(copyrights, minResolution, maxResolution) Constructor arguments can be omitted if instantiated as a prototype. A Subclass constructor must invoke this constructor using call().
	 */
	public static GTileLayer create(GCopyrightCollection copyrights, int minResolution, int maxResolution)
	{
		return GTileLayerImpl.create(copyrights, minResolution, maxResolution);
	}
	
	/**
	 * minResolution() Number  Returns to the map type the lowest zoom level of this tile layer.
	 */
	public int minResolution()
	{
		return impl.minResolution(this);
	}
	 
	/**
	 * maxResolution() Number  Returns to the map type the highest zoom level of this tile layer. 
	 */
	public int maxResolution()
	{
		return impl.maxResolution(this);
	}
	
	/**
	 * getTileUrl(tile, zoom) String  Abstract. Returns to the map the URL of the map tile with the tile indices given by the x and y properties of the GPoint, at the given zoom level. 
	 */
	public String getTileUrl(GPoint tile, int zoom)
	{
		return impl.getTileUrl(this, tile, zoom);
	}

	/**
	 * 	isPng() Boolean  Abstract. Returns to the map whether the tiles are in PNG image format and hence can be transparent. Otherwise GIF is assumed.
	 */
	public boolean isPng()
	{
		return impl.isPng(this);
	}
	
	/**
	 * getOpacity() Number  Abstract. Returns to the map the opacity with which to display this tile layer. 1.0 is opaque, 0.0 is transparent.
	 */ 
	public double getOpacity()
	{
		return impl.getOpacity(this);
	}
	
	//TODO Event - New Copyright

}
