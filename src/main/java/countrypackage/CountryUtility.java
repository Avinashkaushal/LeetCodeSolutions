package countrypackage;

import java.util.HashMap;

public class CountryUtility {
	
	String countryCode = null;
	String countryName = null;	

	HashMap<String,String> countryMap = new HashMap<String, String>();
	
	public HashMap<String,String> initialiseHashMap(String countyCode,String countyName){
		
		return countryMap;
		
	}
	
	public String getCountryName(String key) {		
		
	return countryMap.get(key);		
	
	}
	
	

}
