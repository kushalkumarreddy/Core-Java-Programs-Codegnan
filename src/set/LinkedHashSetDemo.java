package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(30);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
	}

}
