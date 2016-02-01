package com.mapitz.gwt.googleMaps.client;

/**
 * An information panel which displays over the map.  Only created by GMaps2.
 */
public class GInfoWindow extends GOverlay
{
	protected static GInfoWindowImpl impl = new GInfoWindowImpl();
	
	protected GInfoWindow(int opaque)
	{
		super(opaque);
	}

	/**
	 * selectTab(index) none  Selects the tab with the given index. This has the same effect as clicking on the corresponding tab.
	 */
	public void selectTab(int index){
		impl.selectTab(this, index);
	}
	 
	/**
	 * hide() none  Makes the info window invisible. NOTE: This doesn't close the info window. It can be made visible again using show().
	 */
	public void hide(){
		impl.hide(this);
	}
	
	/**
	 * show() none  Makes the info window visible if its currently invisible.
	 */
	public void show(){
		impl.show(this);
	}
	
	/**
	 * isHidden() Boolean  Returns true iff the info window is hidden. This includes the state that it's closed.
	 */
	public boolean isHidden(){
		return impl.isHidden(this);
	}

	/**
	 * reset(point, tabs, size, offset?, selectedTab?) none  Resets the state of the info window. Each argument may be null and then its value will not be changed from the current value.
	 */
	public void reset(GLatLng point, GInfoWindowTab[] tabs, GSize size, GSize offset, int selectedTab){
		impl.reset(this, point, tabs, size, offset, selectedTab);
	}
	
	/**
	 * reset(point, tabs, size, offset?, selectedTab?) none  Resets the state of the info window. Each argument may be null and then its value will not be changed from the current value.
	 */
	public void reset(GLatLng point, GInfoWindowTab[] tabs, GSize size, GSize offset){
		impl.reset(this, point, tabs, size, offset);
	}

	/**
	 * reset(point, tabs, size, offset?, selectedTab?) none  Resets the state of the info window. Each argument may be null and then its value will not be changed from the current value.
	 */
	public void reset(GLatLng point, GInfoWindowTab[] tabs, GSize size){
		impl.reset(this, point, tabs, size);
	}
	
	/**
	 * getPoint() GLatLng  Returns the geographical point at which the info window is anchored. The tip of the window points to this point on the map, modulo the pixel offset.
	 */
	public GLatLng getPoint(){
		return impl.getPoint(this);
	}

	/**
	 * getPixelOffset() GSize  Returns the offset, in pixels, of the tip of the info window from the point on the map at whose geographical coordinates the info window is anchored.
	 */
	public GSize getPixelOffset(){
		return impl.getPixelOffset(this);
	}
	
	/**
	 * getSelectedTab() Number  Returns the index, starting at 0, of the current selected tab.
	 */
	public int getSelectedTab(){
		return impl.getSelectedTab(this);
	}
	
	//TODO Add close event
}
