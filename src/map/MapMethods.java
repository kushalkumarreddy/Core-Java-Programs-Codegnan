package map;

import java.util.HashMap;

public class MapMethods {
public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<>();
		
		hmap.put(101, "rakesh");
		hmap.put(102, "ramesh");
		hmap.put(103, "ganesh");
		hmap.put(104, "somesh");
		hmap.put(null, null);
		hmap.put(null, null); //replace old value
		hmap.put(102, "suresh"); //replaces old value
		System.out.println(hmap);
		
		for(Integer key:hmap.keySet()) {
			System.out.println(key+" : "+hmap.get(key));
		}
		
//		for(Map.Entry<Integer,String> entry: hmap.entrySet()) {
//			System.out.println(entry);
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
		
		System.out.println(hmap.values());
		System.out.println(hmap.keySet());
		
		System.out.println(hmap.get(101));
		System.out.println(hmap.containsKey(100));
		System.out.println(hmap.containsValue("ganesh"));
		System.out.println(hmap.size());
		
		
		
	}

}
