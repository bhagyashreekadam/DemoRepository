package com.mapitz.gwt.googleMaps.client;

public class GGeoStatusCode
{
	/**
	 * No errors occurred; the address was successfully parsed and its geocode has been returned.
	 */
	public static final GGeoStatusCode G_GEO_SUCCESS = new GGeoStatusCode(200, "No errors occurred; the address was successfully parsed and its geocode has been returned.");
	
	/**
	 * A geocoding request could not be successfully processed, yet the exact reason for the failure is not known.
	 */
	public static final GGeoStatusCode G_GEO_SERVER_ERROR  = new GGeoStatusCode(500, "A geocoding request could not be successfully processed, yet the exact reason for the failure is not known.");
	/**
	 * The HTTP q parameter was either missing or had no value.
	 */
	public static final GGeoStatusCode G_GEO_MISSING_ADDRESS = new GGeoStatusCode(601, "The HTTP q parameter was either missing or had no value.");
	
	/**
	 * No corresponding geographic location could be found for the specified address. This may be due to the fact that the address is relatively new, or it may be incorrect.
	 */
	public static final GGeoStatusCode G_GEO_UNKNOWN_ADDRESS = new GGeoStatusCode(602, "No corresponding geographic location could be found for the specified address. This may be due to the fact that the address is relatively new, or it may be incorrect.");
	
	/**
	 * The geocode for the given address cannot be returned due to legal or contractual reasons.
	 */
	public static final GGeoStatusCode G_UNAVAILABLE_ADDRESS = new GGeoStatusCode(603, "The geocode for the given address cannot be returned due to legal or contractual reasons.");
	
	/**
	 * The given key is either invalid or does not match the domain for which it was given.
	 */
	public static final GGeoStatusCode G_GEO_BAD_KEY = new GGeoStatusCode(610, "The given key is either invalid or does not match the domain for which it was given.");

	
	public static final GGeoStatusCode G_UNKNOWN = new GGeoStatusCode(-1, "Unknown error");
	
	int value;
	String desc;
	
	private GGeoStatusCode(int value, String desc)
	{
		this.value = value;
		this.desc = desc;
	}

	public String getDesc()
	{
		return desc;
	}

	public int getValue()
	{
		return value;
	}
	
	public static GGeoStatusCode translate(int num)
	{
		switch(num)
		{
			case 200: return G_GEO_SUCCESS;
			case 500: return G_GEO_SERVER_ERROR;
			case 601: return G_GEO_MISSING_ADDRESS;
			case 602: return G_GEO_UNKNOWN_ADDRESS;
			case 603: return G_UNAVAILABLE_ADDRESS;
			case 610: return G_GEO_BAD_KEY;
		}
		
		return G_UNKNOWN;
	}
}
