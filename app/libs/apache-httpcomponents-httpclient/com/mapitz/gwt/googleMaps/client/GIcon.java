package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * An icon specifies the images used to display a GMarker on the map. For browser compatibility reasons, specifying an icon is actually quite complex. Note that you can use the default Maps icon G_DEFAULT_ICON if you don't want to specify your own.
 * @author aglaforge
 *
 */
public class GIcon extends JavaScriptObject
{
	private static GIconImpl impl = new GIconImpl();
	
	protected GIcon(int opaque)
	{
		super(opaque);
	}

	public static GIcon create(GIcon other, String url)
	{
		return GIconImpl.create(other, url);
	}

	public static GIcon create(GIcon other)
	{
		return GIconImpl.create(other);
	}

	public static GIcon create()
	{
		return GIconImpl.create();
	}
	
	/**
	 * G_DEFAULT_ICON
	 */
	public GIcon getDefaultIcon()
	{
		return GIconImpl.G_DEFAULT_ICON();
	}
	
	/**
	 * The foreground image URL of the icon.
	 */ 
	public String getImage()
	{
		return JavaScriptObjectHelper.getAttribute(this, "image");
	}

	/**
	 * The foreground image URL of the icon.
	 */ 
	public void setImage(String url)
	{
		JavaScriptObjectHelper.setAttribute(this, "image", url);
	}

	/**
	 * The shadow image URL of the icon.
	 */
	public String getShadow()
	{
		return JavaScriptObjectHelper.getAttribute(this, "shadow");
	}

	/**
	 * The shadow image URL of the icon.
	 */	
	public void setShadow(String url)
	{
		JavaScriptObjectHelper.setAttribute(this, "shadow", url);
	}

	/**
	 * The pixel size of the foreground image of the icon.
	 */ 
	public GSize getIconSize()
	{
		return impl.getIconSize(this);
	}

	/**
	 * The pixel size of the foreground image of the icon.
	 */
	public void setIconSize(GSize size)
	{
		JavaScriptObjectHelper.setAttribute(this, "iconSize", size);
	}

	/**
	 * The pixel size of the shadow image. 
	 */
	public GSize getShadowSize()
	{
		return impl.getShadowSize(this);
	}

	/**
	 * The pixel size of the shadow image. 
	 */
	public void setShadowSize(GSize size)
	{
		JavaScriptObjectHelper.setAttribute(this, "shadowSize", size);
	}
	
	/**
	 * The pixel coordinate relative to the top left corner of the icon image at which this icon is anchored to the map.
	 */
	public void setIconAnchor(GPoint gpoint)
	{
		JavaScriptObjectHelper.setAttribute(this, "iconAnchor", gpoint);
	}

	/**
	 * The pixel coordinate relative to the top left corner of the icon image at which this icon is anchored to the map.
	 */
	public GPoint getIconAnchor()
	{
		return impl.getIconAnchor(this);
	}

	/**
	 * infoWindowAnchor GPoint The pixel coordinate relative to the top left corner of the icon image at which the info window is anchored to this icon.
	 */
	public void setInfoWindowAnchor(GPoint gpoint)
	{
		JavaScriptObjectHelper.setAttribute(this, "infoWindowAnchor", gpoint);
	}

	/**
	 * infoWindowAnchor GPoint The pixel coordinate relative to the top left corner of the icon image at which the info window is anchored to this icon.
	 */
	public GPoint getInfoWindowAnchor()
	{
		return impl.getInfoWindowAnchor(this);
	}

	/**
	 * The URL of the foreground icon image used for printed maps. It must be the same size as the main icon image given by image.
	 */
	public String getPrintImage()
	{
		return JavaScriptObjectHelper.getAttribute(this, "printImage");
	}

	/**
	 * The URL of the foreground icon image used for printed maps. It must be the same size as the main icon image given by image.
	 */
	public void setPrintImage(String url)
	{
		JavaScriptObjectHelper.setAttribute(this, "printImage", url);
	}
	
	/**
	 * The URL of the foreground icon image used for printed maps in Firefox/Mozilla. It must be the same size as the main icon image given by image.
	 */
	public String getMozPrintImage()
	{
		return JavaScriptObjectHelper.getAttribute(this, "mozPrintImage");
	}	
	
	/**
	 * The URL of the foreground icon image used for printed maps in Firefox/Mozilla. It must be the same size as the main icon image given by image.
	 */
	public void setMozPrintImage(String url)
	{
		JavaScriptObjectHelper.setAttribute(this, "mozPrintImage", url);
	}	
	
	/**
	 * The URL of the shadow image used for printed maps. It should be a GIF image since most browsers cannot print PNG images.
	 */
	public String getPrintShadow()
	{
		return JavaScriptObjectHelper.getAttribute(this, "printShadow");
	}
	
	/**
	 * The URL of the shadow image used for printed maps. It should be a GIF image since most browsers cannot print PNG images.
	 */
	public void setPrintShadow(String url)
	{
		JavaScriptObjectHelper.setAttribute(this, "printShadow", url);
	}

	/**
	 * The URL of a virtually transparent version of the foreground icon image used to capture click events in Internet Explorer. This image should be a 24-bit PNG version of the main icon image with 1% opacity, but the same shape and size as the main icon.
	 */
	public String getTransparent()
	{
		return JavaScriptObjectHelper.getAttribute(this, "transparent");
	}
	
	/**
	 * The URL of a virtually transparent version of the foreground icon image used to capture click events in Internet Explorer. This image should be a 24-bit PNG version of the main icon image with 1% opacity, but the same shape and size as the main icon.
	 */
	public void setTransparent(String url)
	{
		JavaScriptObjectHelper.setAttribute(this, "transparent", url);
	}

	/**
	 * An array of integers representing the x/y coordinates of the image map we should use to specify the clickable part of the icon image in browsers other than Internet Explorer.
	 */
	public int[] getImageMap()
	{
		return JavaScriptObjectHelper.getAttributeAsIntArray(this, "imageMap");
	}
	
	/**
	 * An array of integers representing the x/y coordinates of the image map we should use to specify the clickable part of the icon image in browsers other than Internet Explorer.
	 */
	public void setImageMap(int[] val)
	{
		JavaScriptObjectHelper.setAttributeAsIntArray(this, "imageMap", val);
	}

}
