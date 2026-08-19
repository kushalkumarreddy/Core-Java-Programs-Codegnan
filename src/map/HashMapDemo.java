package map;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<>();
		
		hmap.put(101, "rakesh");
		hmap.put(102, "ramesh");
		hmap.put(103, "ganesh");
		hmap.put(102, "suresh"); //replaces old value
		System.out.println(hmap);
		
	}

}