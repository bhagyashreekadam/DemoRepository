package com.mapitz.gwt.googleMaps.client;

class GClientGeocoderImpl
{
	/*
	 * GClientGeocoder(cache?) Creates a new instance of a geocoder that talks directly to Google servers. The optional cache parameter allows one to specify a custom client-side cache of known addresses. If none is specified, a GFactualGeocodeCache is used. (Since 2.55)
	 */
	public static native GClientGeocoder create(GGeocodeCache cache)/*-{
		return new $wnd.GClientGeocoder(cache);
	}-*/;

	/*
	 * GClientGeocoder(cache?) Creates a new instance of a geocoder that talks directly to Google servers. The optional cache parameter allows one to specify a custom client-side cache of known addresses. If none is specified, a GFactualGeocodeCache is used. (Since 2.55)
	 */
	public static native GClientGeocoder create()/*-{
		return new $wnd.GClientGeocoder();
	}-*/; 
//
//	Methods
//	Methods Return Value Description 
//	 
	/*
	 * getLatLng(address, callback) none  Sends a request to Google servers to geocode the specified address. If the address was successfully located, the user-specified callback function is invoked with a GLatLng point. Otherwise, the callback function is given a null point. In case of ambiguous addresses, only the point for the best match is passed to the callback function. (Since 2.55)
	 */
	public native void getLatLng(GClientGeocoder self, String address, GGeocodeResultListener result)/*-{
		self.getLatLng(address,
			function(point) {
			  
		      if (!point) 
		      {
		      	result.@com.mapitz.gwt.googleMaps.client.GGeocodeResultListener::onFail(Ljava/lang/String;)(address);  
		      } 
		      else 
		      {
		        result.@com.mapitz.gwt.googleMaps.client.GGeocodeResultListener::onSuccess(Lcom/mapitz/gwt/googleMaps/client/GLatLng;)(point);
		      }
		    }
        );

	}-*/;
	
	//	getLocations(address, callback) none  Sends a request to Google servers to geocode the specified address. A reply that contains status code, and if successful, one or more Placemark objects, is passed to the user-specified callback function. Unlike the GClientGeocoder.getLatLng method, the callback function may determine the reasons for failure by examining the code value of the Status field. (Since 2.55) 
	public native void getLocations(GClientGeocoder self, String address, GGeocodeAdvancedResultListener result)/*-{
		
		self.getLocations(address,
				function(response) {
	        
				  if (!response || response.Status.code != 200)
				  {
				    if (response)result.@com.mapitz.gwt.googleMaps.client.GGeocodeAdvancedResultListener::onFail(ILjava/lang/String;)(response.Status.code, response.name);
				    else result.@com.mapitz.gwt.googleMaps.client.GGeocodeAdvancedResultListener::onFail(ILjava/lang/String;)(-1, address);
				  } 
				  else
				  {
				    myresult = @com.mapitz.gwt.googleMaps.client.GGeocodeResult::create(ILjava/lang/String;I)(response.Placemark.length, response.name, response.Status.code);
				    	
				    for (myIndex=0; myIndex< response.Placemark.length; myIndex++) 
				    {
					    place = response.Placemark[myIndex];
						address0 = place.address;
					    lat = place.Point.coordinates[1];
					    lng = place.Point.coordinates[0];
						country = place.AddressDetails.Country.CountryNameCode;
						
						var state, county, city, streetLine, zip, accuracy;
						
						accuracy = place.AddressDetails.Accuracy;
						
						if (place.AddressDetails.Country.AdministrativeArea)
						{
							state	= place.AddressDetails.Country.AdministrativeArea.AdministrativeAreaName;
							
							if(place.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea)
							{
								county 	= place.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.SubAdministrativeAreaName;
								city	= place.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality.LocalityName;
								streetLine	= place.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality.Thoroughfare.ThoroughfareName;
								zip	= place.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality.PostalCode.PostalCodeNumber;
							}
					    }
					    temp = @com.mapitz.gwt.googleMaps.client.GGeocodeAddress::create(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDI)(address0, streetLine, city, state, zip, county, country, lat, lng, accuracy);				
					    
					    myresult.@com.mapitz.gwt.googleMaps.client.GGeocodeResult::setAddress(ILcom/mapitz/gwt/googleMaps/client/GGeocodeAddress;)(myIndex, temp);
				    }
				    
				    result.@com.mapitz.gwt.googleMaps.client.GGeocodeAdvancedResultListener::onSuccess(Lcom/mapitz/gwt/googleMaps/client/GGeocodeResult;)(myresult);
				  }
			    }
	        );
	}-*/;
	
	/*
	 * getCache() GGeocodeCache  Returns currently used geocode cache, or null, if no client-side caching is performed. (Since 2.55)
	 */
	public native GGeocodeCache getCache(GClientGeocoder self)/*-{
		return self.getCache();
	}-*/;
	
	/*
	 * setCache(cache) none  Sets a new client-side caching. If this method is invoked with cache set to null, client-side caching is disabled. Setting a new cache discards previously stored addresses. (Since 2.55)
	 */ 
	public native GGeocodeCache setCache(GClientGeocoder self, GGeocodeCache cache)/*-{
		return self.setCache(cache);
	}-*/;
	
	/*
	 * reset() none  Resets the geocoder. In particular this method calls the GGeocodeCache.reset method on the client-side cache, if one is used by this geocoder. (Since 2.55)
	 */ 
	public native void reset(GClientGeocoder self)/*-{
		self.reset();
	}-*/;
}
