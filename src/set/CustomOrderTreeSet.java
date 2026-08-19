package set;

import java.util.Set;
import java.util.TreeSet;

public class CustomOrderTreeSet {
	public static void main(String[] args) {
		
		Set<Student> sset = new TreeSet<>();
		
		sset.add(new Student(100,"sam",45));
		sset.add(new Student(101,"sam",85));
		sset.add(new Student(102,"ram",85));
		
		System.out.println(sset);
		
		
		TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);

        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.higher(20));
        System.out.println(set.lower(40));
	}

}