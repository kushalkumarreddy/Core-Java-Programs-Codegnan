package java8;

import java.util.Optional;

public class OptionalClassDemo {
	public static void main(String[] args) {
		
		String name1 = null;
		String name = "Java";
		
		Optional<String> op = Optional.of(name);
		System.out.println(op);
		
		Optional<String> op1 = Optional.ofNullable(name1);
		System.out.println(op1);
		
		Optional<String> op2 = Optional.empty();
		System.out.println(op2);
		
		System.out.println(op.isPresent());
		System.out.println(op1.isPresent());
		
		System.out.println(op1.isPresent());
		System.out.println(op1.orElse("unknown"));
		
		op.ifPresent((n) -> System.out.println(n));
		op1.ifPresent((n) -> System.out.println(n));
	}

}
