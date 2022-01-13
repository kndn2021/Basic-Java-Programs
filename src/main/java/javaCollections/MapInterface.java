package javaCollections;

import java.util.Map;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
	
//		Map<String, String> map = new HashMap<String, String>();	
//		Map<String, String> map = new LinkedHashMap<String, String>();
		Map<String, String> map = new TreeMap<String, String>();
		
		
		map.put("Rs.125", "2GB/Month");
		map.put("Rs.299", "1GB/Day");
		map.put("Rs.359", "1.5GB/Day");
		map.put("Rs.359", "1.5GB/Day");
		map.put("Rs.400", "2GB/Day");
		map.put(null, null);
		map.put(null, null);
		map.put(null, null);
		
		for(Map.Entry<String, String> str: map.entrySet())
		{
			System.out.println(str.getKey() +" = " +str.getValue());
		}
		
		
	}

}
