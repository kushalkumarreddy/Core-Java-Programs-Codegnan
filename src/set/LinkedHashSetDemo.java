package set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(30);
		set.add(null);
		set.add(null);
		
		System.out.println("Set: "+set);
		
		List<Integer> list = new ArrayList<>(set);
		System.out.println("List: "+list);
	}

}
