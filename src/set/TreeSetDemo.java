package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> tset = new TreeSet<>();
		
		tset.add(20);
		tset.add(10);
		tset.add(30);
		tset.add(10);  //replaces duplicate value
//		tset.add(null); // nullpointerexception null values not allowed
		System.out.println(tset);
	}

}
