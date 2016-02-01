package com.mapitz.gwt.googleMaps.client;

class GMarkerEventManagerImpl
{
	/*
	 * click none  This event is fired when the marker icon was clicked. Notice that this event will also fire for the map, with the marker passed as the first argument to the event handler there.
	 */
	public static native GEventListener addOnClickListener(GMarkerEventManager manager, GMarker source)/*-{		
	    return $wnd.GEvent.addListener(source, "click", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventManager::onClick(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(source);
			}
		);
	}-*/;

	/*
	 * click none  Clears all instance listeners for a given GMarker
	 */
	public static native void clearInstanceListeners(GMarker source)/*-{		
	    $wnd.GEvent.clearInstanceListeners(source);
	}-*/;
	
	public static native void removeListener(GEventListener event)/*-{		
		$wnd.GEvent.removeListener(event);
	}-*/;

	/*
	 * Undocumented DragStart Listener
	 */
	public static native GEventListener addOnDragStartListener(GMarkerEventManager manager, GMarker source)/*-{		
	    return $wnd.GEvent.addListener(source, "dragstart", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventManager::onDragStart(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(source);
			}
		);
	}-*/;
	
	/*
	 * Undocumented DragEnd Listener
	 */
	public static native GEventListener addOnDragEndListener(GMarkerEventManager manager, GMarker source)/*-{		
	    return $wnd.GEvent.addListener(source, "dragend", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventManager::onDragEnd(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(source);
			}
		);
	}-*/;

	/*
	 * dblclick none  This event is fired when the marker icon was double-clicked. Notice that this event will not fire for the map, because the map centers on double-click as a hardwired behavior.
	 */
	public static native GEventListener addOnDblClickListener(GMarkerEventManager manager, GMarker source)/*-{		
	    return $wnd.GEvent.addListener(source, "dblclick", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventManager::onDblClick(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(source);
			}
		);
	}-*/;
	
	/*
	 * mousedown none  This event is fired when the DOM mousedown event is fired on the marker icon. Notice that the marker will stop the mousedown DOM event, so that it doesn't cause the map to start dragging.
	 */
	public static native GEventListener addOnMouseDownListener(GMarkerEventManager manager, GMarker source)/*-{		
	    return $wnd.GEvent.addListener(source, "mousedown", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventManager::onMouseDown(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(source);
			}
		);
	}-*/;
	
	/*
	 * mouseup none  This event is fired for the DOM mouseup on the marker. Notice that the marker will not stop the mousedown DOM event, because it will not confuse the drag handler of the map.
	 */
	public static native GEventListener addOnMouseUpListener(GMarkerEventManager manager, GMarker source)/*-{		
	    return $wnd.GEvent.addListener(source, "mouseup", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventManager::onMouseUp(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(source);
			}
		);
	}-*/;
	
	
	/*
	 * mouseover none  This event is fired when the mouse enters the area of the marker icon.
	 */
	public static native GEventListener addOnMouseOverListener(GMarkerEventManager manager, GMarker source)/*-{		
	    return $wnd.GEvent.addListener(source, "mouseover", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventManager::onMouseOver(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(source);
			}
		);
	}-*/;
	
	/*
	 * mouseout none  This event is fired when the mouse leaves the area of the marker icon.
	 */
	public static native GEventListener addOnMouseOutListener(GMarkerEventManager manager, GMarker source)/*-{		
	    return $wnd.GEvent.addListener(source, "mouseout", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventManager::onMouseOut(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(source);
			}
		);
	}-*/;

	/*
	 * infowindowopen none  This event is fired when the info window of the map was opened through this marker.
	 */
	public static native GEventListener addOnInfoWindowOpenListener(GMarkerEventManager manager, GMarker source)/*-{		
	    return $wnd.GEvent.addListener(source, "infowindowopen", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventManager::onInfoWindowOpen(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(source);
			}
		);
    }-*/;
	
	/*
	 * infowindowclose none  This event is fired when the info window of the map that was opened through this marker is closed again. This happens when either the info window was closed, or when it was opened on another marker, or on the map.
	 */
	public static native GEventListener addOnInfoWindowCloseListener(GMarkerEventManager manager, GMarker source)/*-{		
	    return $wnd.GEvent.addListener(source, "infowindowclose", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventManager::onInfoWindowClose(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(source);
			}
		);
    }-*/;
	
	/*
	 * remove none  This event is fired when the marker is removed from the map, using GMap2.removeOverlay() or GMap2.clearOverlays().
	 */
	public static native GEventListener addOnRemoveListener(GMarkerEventManager manager, GMarker source)/*-{		
	    return $wnd.GEvent.addListener(source, "remove", 
			function()
			{
			    manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventManager::onRemove(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(source);
			}
		);
	}-*/;
}
