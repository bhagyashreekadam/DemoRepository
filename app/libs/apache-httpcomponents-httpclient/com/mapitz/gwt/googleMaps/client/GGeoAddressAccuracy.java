package com.mapitz.gwt.googleMaps.client;

public class GGeoAddressAccuracy
{
	/**
	 * 0 Unknown location. (Since 2.59)
	 */
	private static final GGeoAddressAccuracy UNKNOWN_LOCATION = new GGeoAddressAccuracy(0, "Unknown Location.");
	
	/**
	 * 1 Country level accuracy. (Since 2.59)
	 */
	private static final GGeoAddressAccuracy COUNTRY = new GGeoAddressAccuracy(1, "Country level accuracy.");
	
	/**
	 * 2 Region (state, province, prefecture, etc.) level accuracy. (Since 2.59) 
	 */
	private static final GGeoAddressAccuracy REGION = new GGeoAddressAccuracy(2, "Region (state, province, prefecture, etc.) level accuracy.");
	
	/**
	 * 3 Sub-region (county, municipality, etc.) level accuracy. (Since 2.59) 
	 */
	private static final GGeoAddressAccuracy SUB_REGION = new GGeoAddressAccuracy(3, "Sub-region (county, municipality, etc.) level accuracy.");
	
	/**
	 * 4 Town (city, village) level accuracy. (Since 2.59) 
	 */
	private static final GGeoAddressAccuracy TOWN = new GGeoAddressAccuracy(4, "Town (city, village) level accuracy.");
	
	/**
	 * 5 Post code (zip code) level accuracy. (Since 2.59) 
	 */
	private static final GGeoAddressAccuracy POST_CODE = new GGeoAddressAccuracy(5, "Post code (zip code) level accuracy.");
	
	/**
	 * 6 Street level accuracy. (Since 2.59) 
	 */
	private static final GGeoAddressAccuracy STREET_LEVEL = new GGeoAddressAccuracy(6, "Street level accuracy.");
	
	/**
	 * 7 Intersection level accuracy. (Since 2.59) 
	 */
	private static final GGeoAddressAccuracy INTERSECTION_LEVEL = new GGeoAddressAccuracy(7, "Intersection level accuracy.");
	
	/**
	 * 8 Address level accuracy. (Since 2.59) 
	 */
	private static final GGeoAddressAccuracy ADDRESS_LEVEL = new GGeoAddressAccuracy(8, "Address level accuracy.");
	
	int value;
	String desc;
	
	private GGeoAddressAccuracy(int value, String desc)
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
	
	public static GGeoAddressAccuracy translate(int i)
	{
		switch(i)
		{
			case 8: return ADDRESS_LEVEL;
			case 7: return INTERSECTION_LEVEL;
			case 6: return STREET_LEVEL;
			case 5: return POST_CODE;
			case 4: return TOWN;
			case 3: return SUB_REGION;
			case 2: return REGION;
			case 1: return COUNTRY;
			default: return UNKNOWN_LOCATION;
		}
	}
}
