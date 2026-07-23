package OopsPrinciples.Polymorphism;

public class CalculatorMain {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int sum = cal.add(10, 20);
		System.out.println(sum);
		
		
		System.out.println(cal.add(20.3, 30));
		
	}

}
