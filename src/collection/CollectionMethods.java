package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {
	public static void main(String[] args) {
		
		Collection<String> fn = new ArrayList<>();
		fn.add("Apple");
		fn.add("Banana");
		fn.add("Mango");
		
		Collection<String> fn1 = new ArrayList<>();
		fn.remove("Banana");
		System.out.println(fn.contains("Apple"));
		System.out.println(fn.size());
		System.out.println(fn1.isEmpty());
	}

}
