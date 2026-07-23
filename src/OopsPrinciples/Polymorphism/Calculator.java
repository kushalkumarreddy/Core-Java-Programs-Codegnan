package OopsPrinciples.Polymorphism;

public class Calculator {
	
	public int add(int a, int b) {
		System.out.println("It is a 2 paarameter method");
		return a+b;
	}
	
	public int add(int a, int b,int c) {
		System.out.println("It is a 3 paarameter method");
		return a+b+c;
	}
	
	public void add(float a, int b ) {
		System.out.println(a+b);
	}
	
	public double add(double a, int b) {
		return a+b;
	}

}
