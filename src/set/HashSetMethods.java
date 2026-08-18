package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetMethods {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(null);
		
		System.out.println(set);
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(40);
		
		System.out.println(set1);
		
		System.out.println(set.containsAll(set1));
		
		set.removeAll(set1);
		System.out.println(set);
		
	}

}
