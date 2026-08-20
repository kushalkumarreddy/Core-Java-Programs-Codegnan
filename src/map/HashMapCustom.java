package map;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCustom {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Student>> hmap = new HashMap<>();
		
		ArrayList<Student> java= new ArrayList<>(); 
		ArrayList<Student> python= new ArrayList<>(); 
		
		java.add(new Student(101, "koushik"));
		java.add(new Student(102, "kushal"));
		java.add(new Student(103, "nikhil"));
		
		python.add(new Student(101, "bharath"));
		python.add(new Student(102, "sai"));
		python.add(new Student(103, "arjun"));
		
		hmap.put("java", java);
		hmap.put("python", python);
		
		System.out.println(hmap.get("java"));
		System.out.println(hmap.get("python"));
		
	}

}
