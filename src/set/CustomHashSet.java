package set;

import java.util.HashSet;

public class CustomHashSet {
	public static void main(String[] args) {
		
		HashSet<Student> sset = new HashSet<>();
		
		sset.add(new Student(101,"sam",45));
		sset.add(new Student(100,"sam",45));
		sset.add(new Student(102,"ram",45));
		
		System.out.println(sset);
	}

}
