package java8;

import java.util.function.Predicate;

public class PreDefinedFunctions {
	public static void main(String[] args) {
		
		Predicate<Integer> pre = (n) -> n%2==0;
		System.out.println(pre.test(11)); //false
	}

}
