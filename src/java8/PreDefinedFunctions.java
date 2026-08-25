package java8;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefinedFunctions {
	public static void main(String[] args) {
		
		Predicate<Integer> pre = (n) -> n%2==0;
		System.out.println(pre.test(11)); //false
		
		Consumer<String> con = (s) -> System.out.println(s.length());
		con.accept("java"); //4
		
		Function<String, Integer> fun = (s) -> s.length();
		System.out.println(fun.apply("java")); //4
		
		Supplier<Double> sup = () -> Math.random();
		System.out.println(sup.get());
		
		BiPredicate<Integer, Integer> pre1 = (n1,n2) -> (n1+n2)%2==0;
		System.out.println(pre1.test(10, 20));
	}

}
