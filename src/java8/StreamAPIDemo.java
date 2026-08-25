package java8;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,40,5,30,60,10,40);
		
		list.stream()
		.forEach((n) -> System.out.println(n));
	}

}