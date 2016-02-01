package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

/**
 * Instantiate class GMap2 in order to create a map. This is the central class in the API. Everything else is auxiliary.
 * @author aglaforge
 *
 */
public class GMap2 extends JavaScriptObject
{
	protected static GMap2Impl impl = new GMap2Impl();
	
	protected GMap2(int opaque)
	{
		super(opaque);
	}

	/**
	 * Creates a GMap2 object by passing a DIV element
	 * @param e
	 * @return
	 */
	public static GMap2 create(Element e)
	{
		return impl.createMapObject(e);
	}
	
	public void enableAutomatedCheckResizeOnMoveEnd()
	{
		impl.enableAutomatedCheckResizeOnMoveEnd(this);
	}
	
	public void enableCheckResizeOnLoad()
	{
		impl.enableCheckResizeOnLoad(this);
	}
	
	
	/**
	 * Set's the center position on the map
	 * @param latlng
	 */
	public void setCenter(GLatLng latlng)
	{
		impl.checkResize(this);
		impl.setCenter(this, latlng);
	}
	
	/**
	 * Enables dragging of the map by the user 
	 *
	 */
	public void enableDragging()
	{
		impl.enableDragging(this);
	}

	/**
	 * Disables dragging of the map by the user
	 *
	 */
	public void disableDragging()
	{
		impl.disableDragging(this);
	}
	
	/***
	 * Test to see if dragging enabled
	 * @return
	 */
	public boolean draggingEnabled()
	{
		return impl.draggingEnabled(this);
	}
	
	/**
	 * Enables display of the information window
	 *
	 */
	public void enableInfoWindow()
	{
		impl.enableInfoWindow(this);
	}

	/**
	 * Disables display of the information window
	 *
	 */
	public void disableInfoWindow()
	{
		impl.disableInfoWindow(this);
	}

	/**
	 * Tests if info window will be displayed
	 * @return
	 */
	public boolean infoWindowEnabled()
	{
		return impl.infoWindowEnabled(this);
	}
	  
	/**
	 * Tests if the map is "loaded" and ready to be used
	 * @return
	 */
	  public boolean isLoaded()
	  {
		  return impl.isLoaded(this);
	  }

	  /**
	   * Returns the geographical coordinates of the center point of the map view. 
	   * @return
	   */
	  public GLatLng getCenter()
	  {
		  return impl.getCenter(this);
	  }
	  
	  /**
	   * Returns the the visible rectangular region of the map view in geographical coordinates.
	   * @return
	   */
	  public GLatLngBounds getBounds()
	  {
		  return impl.getBounds(this);
	  }
	  
	  /**
	   * Returns the zoom level at which the given rectangular region fits in the map view. The zoom level is computed for the currently selected map type. If no map type is selected yet, the first on the list of map types is used.
	   * @param bounds
	   * @return
	   */
	  public int getBoundsZoomLevel(GLatLngBounds bounds)
	  {
		  return impl.getBoundsZoomLevel(this, bounds);
	  }
	  
	  /**
	   * Returns the current zoom level.
	   * @return
	   */
	  public double getZoom()
	  {
		  return impl.getZoom(this);
	  }
	  
	  /**
	   * Returns the size of the map view in pixels.
	   * @return
	   */
	  public GSize getSize()
	  {
		  return impl.getSize(this);
	  }


	  /**
	   * panTo(center) none  Changes the center point of the map to the given point. If the point is already visible in the current map view, change the center in a smooth animation.
	   * @param center
	   */
		public void panTo(GLatLng center)
		{
			impl.panTo(this, center);
		}


		/**
		 * panBy(distance) none  Starts a pan animation by the given distance in pixels.
		 * @param distance
		 */
		public void panBy(int distance)
		{
			impl.panBy(this, distance);
		}


		/**
		 * panDirection(dx, dy) none  Starts a pan animation by half the width of the map in the indicated directions. +1 is right and down, -1 is left and up, respectively.
		 * @param dx
		 * @param dy
		 */
		public void panDirection(int dx, int dy)
		{
			impl.panDirection(this, dx, dy);
		}


	/**
	 * setZoom(level) none  Sets the zoom level to the given new value.
	 * @param level
	 */
	public void setZoom(int level)
	{
		impl.setZoom(this, level);
	}
	

	/**
	 * zoomIn() none  Increments zoom level by one.
	 *
	 */
	public void zoomIn()
	{
		impl.zoomIn(this);
	}
	

	/**
	 * zoomOut() none  Decrements zoom level by one. 
	 *
	 */
	public void zoomOut()
	{
		impl.zoomOut(this);
	}
	

	/**
	 * savePosition() none  Stores the current map position and zoom level for later recall by returnToSavedPosition().
	 *
	 */
	public void savePosition()
	{
		impl.savePosition(this);
	}
	

	/**
	 * returnToSavedPosition() none  Restores the map view that was saved by savePosition().
	 *
	 */
	public void returnToSavedPosition()
	{
		impl.returnToSavedPosition(this);
	}
	

	/**
	 * checkResize() none  Notifies the map of a change of the size of its container. Call this method after the size of the container DOM object has changed, so that the map can adjust itself to fit the new size.
	 *
	 */
	public void checkResize()
	{
		impl.checkResize(this);
	}
	
	/**
	 * addControl(control, position?) none  Adds the control to the map. The position on the map is determined by the optional position argument. If this argument is absent, the default position of the control is used, as determined by the GControl.getDefaultPosition() method. A control instance must not be added more than once to the map.
	 */
	public void addControl(GControl control, GControlPosition position)
	{
		impl.addControl(this, control, position);
	}

	/**
	 * addControl(control, position?) none  Adds the control to the map. The position on the map is determined by the optional position argument. If this argument is absent, the default position of the control is used, as determined by the GControl.getDefaultPosition() method. A control instance must not be added more than once to the map.
	 */
	public void addControl(GControl control)	{
		impl.addControl(this, control);
	}
	
	/**
	 * removeControl(control) none  Removes the control from the map. It does nothing if the control was never added to the map.
	 */
	public void removeControl(GControl control)
	{
		impl.removeControl(this, control);
	}
	
	/**
	 * getContainer() Node  Returns the DOM object that contains the map. Used by GControl.initialize().
	 */
	public Element getContainer()
	{
		return impl.getContainer(this);
	}
	
	/**
	 * getMapTypes() Array of GMapType  Returns the array of map types registered with this map.
	 */
	public GMapType[] getMapTypes()
	{
		GMapType[] rtn = null;
		JavaScriptObject hold = impl.getMapTypes(this);
		if (hold != null)
		{
			int size = impl.getMapTypesArraySize(hold);
			rtn = new GMapType[size];
			
			for(int i = 0; i < size; i++)
			{
				rtn[i] = impl.getMapTypesValueAtPosition(hold, i);
			}
		}
		return rtn;
	}
	
	/**
	 * getCurrentMapType() GMapType  Returns the currently selected map type.
	 */
	public GMapType getCurrentMapType()
	{
		return impl.getCurrentMapType(this);
	}
	
	/**
	 * setMapType(type) none  Selects the given new map type. The type must be known to the map. See the constructor, and the method addMapType().
	 */ 
	public void setMapType(GMapType type)
	{
		impl.setMapType(this, type);
	}

	/**
	 * addMapType(type) none  Adds a new map type to the map. See section GMapType for how to define custom map types.
	 */
	public void addMapType(GMapType type)
	{
		impl.addMapType(this, type);
	}
	
	/**
	 * removeMapType(type) none  Removes the map type from the map. Will update the set of buttons displayed by the GMapTypeControl and fire the removemaptype event.
	 */ 
	public void removeMapType(GMapType type)
	{
		impl.removeMapType(this, type);
	}
	
	public void setCenter(GLatLng latlng, int zoomlevel, GMapType type)
	{
		impl.checkResize(this);
		impl.setCenter(this, latlng, zoomlevel, type);
	}

	public void setCenter(GLatLng latlng, int zoom)	
	{
		impl.checkResize(this);
		impl.setCenter(this, latlng, zoom);
	}
	
	/**
	 * addOverlay(overlay) none  Adds an overlay to the map and fires the addoverlay event.
	 */
	public void addOverlay(GOverlay overlay)
	{
		impl.addOverlay(this, overlay);
	}

	/**
	 * addOverlay(collection) none  Adds a collection of overlays to the map.
	 */
	public void addOverlay(GOverlayCollection collection)
	{
		if (collection != null)
		{
			int size = collection.size();
			
			for(int i = 0; i < size; i++)
			{
				addOverlay(collection.get(i));
			}
		}
	}
	
	/**
	 * removeOverlay(overlay) none  Removes the overlay from the map. If the overlay was on the map, it fires the removeoverlay event.
	 */
	public void removeOverlay(GOverlay overlay)
	{
		impl.removeOverlay(this, overlay);
	}

	/**
	 * removeOverlay(collection) none  Removes a collection of overlays to the map.
	 */
	public void removeOverlay(GOverlayCollection collection)
	{
		if (collection != null)
		{
			int size = collection.size();
			
			for(int i = 0; i < size; i++)
			{
				removeOverlay(collection.get(i));
			}
		}
	}
	
	/**
	 * clearOverlays() none  Removes all overlay from the map, and fires the clearoverlays event.
	 */
	public void clearOverlays()
	{
		impl.clearOverlays(this);
	}
	
	/**
	 * getPane(pane) Node  Returns a DIV that holds the object in the layer identified by pane. Used by GOverlay instances in method GOverlay.initialize() instances to draw themselves on the map
	 */ 
	public Element getPane(GMapPane pane)
	{
		return impl.getPane(this, pane.getIndex());
	}
	
	/**
	 * openInfoWindow(point, node, opts?) none  Opens a simple info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as a DOM node.
	 */
	public void openInfoWindow(GLatLng point, Element node, GInfoWindowOptions opts){
		impl.openInfoWindow(this, point, node, opts);
	}

	/**
	 * openInfoWindow(point, node, opts?) none  Opens a simple info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as a DOM node.
	 */
	public void openInfoWindow(GLatLng point, Element node){
		impl.openInfoWindow(this, point, node);
	}
	
	/**
	 * openInfoWindowHtml(point, html, opts?) none  Opens a simple info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as HTML text.
	 */
	public void openInfoWindowHtml(GLatLng point, String html, GInfoWindowOptions opts){
		impl.openInfoWindowHtml(this, point, html, opts);
	}

	/**
	 * openInfoWindowHtml(point, html, opts?) none  Opens a simple info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as HTML text.
	 */
	public void openInfoWindowHtml(GLatLng point, String html){
		impl.openInfoWindowHtml(this, point, html);
	}
	
	/**
	 * openInfoWindowTabs(point, tabs, opts?) none  Opens a tabbed info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as DOM nodes.
	 */
	public void openInfoWindowTabs(GLatLng point, GInfoWindowTab[] tabs, GInfoWindowOptions opts){
		impl.openInfoWindowTabs(this, point, JavaScriptObjectHelper.arrayConvert(tabs), opts);
	}
	
	/**
	 * openInfoWindowTabs(point, tabs, opts?) none  Opens a tabbed info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as DOM nodes.
	 */
	public void openInfoWindowTabs(GLatLng point, GInfoWindowTab[] tabs){
		impl.openInfoWindowTabs(this, point, JavaScriptObjectHelper.arrayConvert(tabs));
	}
	
	/**
	 * openInfoWindowTabsHtml(point, tabs, opts?) none  Opens a tabbed info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as HTML text.
	 */
	public void openInfoWindowTabsHtml(GLatLng point, GInfoWindowTab[] tabs, GInfoWindowOptions opts){
		impl.openInfoWindowTabsHtml(this,point, JavaScriptObjectHelper.arrayConvert(tabs), opts);
	}

	/**
	 * openInfoWindowTabsHtml(point, tabs, opts?) none  Opens a tabbed info window at the given point. Pans the map such that the opened info window is fully visible. The content of the info window is given as HTML text.
	 */
	public void openInfoWindowTabsHtml(GLatLng point, GInfoWindowTab[] tabs){
		impl.openInfoWindowTabsHtml(this,point, JavaScriptObjectHelper.arrayConvert(tabs));
	}
	
	/**
	 * showMapBlowup(point, opts?) none  Opens an info window at the given point that contains a closeup view on the map around this point.
	 */
	public void showMapBlowup(GLatLng point, GInfoWindowOptions opts){
		impl.showMapBlowup(this,point, opts);
	}

	/**
	 * showMapBlowup(point, opts?) none  Opens an info window at the given point that contains a closeup view on the map around this point.
	 */
	public void showMapBlowup(GLatLng point){
		impl.showMapBlowup(this,point);
	}
	
	/**
	 * closeInfoWindow() none  Closes the currently open info window.
	 */
	public void closeInfoWindow(){
		impl.closeInfoWindow(this);
	}	
	
	/**
	 * getInfoWindow() GInfoWindow  Returns the info window object of this impl. If no info window exists yet, it is created, but not displayed. This operation is not influenced by enableInfoWindow().
	 */
	public GInfoWindow getInfoWindow(){
		return impl.getInfoWindow(this);
	}	

	/**
	 * fromLatLngToDivPixel(latlng)  	  GPoint    	Computes the pixel coordinates of the given geographical point in the DOM element that holds the draggable impl. You need this method to position a custom overlay when you implement the GOverlay.redraw() method for a custom overlay.
	 */
	public GPoint fromLatLngToDivPixel(GLatLng latlng){
		return impl.fromLatLngToDivPixel(this,latlng);
	}
	
	/**
	 * fromDivPixelToLatLng(pixel) 	GLatLng 	Computes the geographical coordinates from pixel coordinates in the div that holds the draggable impl. You need this when you implement interaction with custom overlays.
	 */
	public GLatLng fromDivPixelToLatLng(GPoint pixel){
		return impl.fromDivPixelToLatLng(this,pixel);
	}
	
	/**
	 * fromContainerPixelToLatLng(pixel) 	GLatLng 	Computes the geographical coordinates of the point at the given pixel coordinates in the DOM element that contains the map on the page. You need this when you implement interaction of custom controls with the impl.
	 */
	public GLatLng fromContainerPixelToLatLng(GPoint pixel){
		return impl.fromContainerPixelToLatLng(this,pixel);
	}
	
	/**
	 * enableDoubleClickZoom()  	 none   	Enables double click to zoom in and out (disabled by default). (Since 2.58)
	 */
	public void enableDoubleClickZoom()
	{
	  impl.enableDoubleClickZoom(this);
	}
	

	/**
	 * disableDoubleClickZoom() 	none 	Disables double click to zoom in and out. (Since 2.58)
	 *
	 */
	public void disableDoubleClickZoom()
	{
	   impl.disableDoubleClickZoom(this);
	}
	
	/**
	 * doubleClickZoomEnabled() 	Boolean 	Returns true iff double click to zoom is enabled. (Since 2.58)
	 * 
	 * @return
	 */
	public  boolean doubleClickZoomEnabled(){
	  return impl.doubleClickZoomEnabled(this);
	}

	/**
	 * enableContinuousZoom() 	none 	Enables continuous smooth zooming for select browsers (disabled by default). (Since 2.58)
	 *
	 */
	public  void enableContinuousZoom(){
		impl.enableContinuousZoom(this);
	  }

	/**
	 * disableContinuousZoom() 	none 	Disables continuous smooth zooming. (Since 2.58)
	 *
	 */
	public void disableContinuousZoom(){
		impl.disableContinuousZoom(this);
	  }

	/**
	 * continuousZoomEnabled() 	Boolean 	Returns true iff continuous smooth zooming is enabled. (Since 2.58)
	 * @return
	 */
	public  boolean continuousZoomEnabled(){
	  return impl.continuousZoomEnabled(this);
	 }
	
	/**
	 * @deprecated
	 */
	public void test1()
	{
		impl.test1(this);
	}
}
