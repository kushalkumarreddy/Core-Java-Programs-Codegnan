package map;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(1, "kushal");
		System.out.println(tm);

		TreeMap<String,Student> tmap = new TreeMap<>();
		tmap.put("java", new Student(101,"ramesh"));
		tmap.put("python", new Student(102,"ganesh"));
		System.out.println(tmap);
		
		
	}

}
