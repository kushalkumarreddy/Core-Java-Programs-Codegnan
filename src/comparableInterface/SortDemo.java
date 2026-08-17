package comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		
		al.add(90);
		al.add(30);
		System.out.println(al);
		Collections.sort(al);
		System.out.println("After sorting");
		System.out.println(al);
	}

}
