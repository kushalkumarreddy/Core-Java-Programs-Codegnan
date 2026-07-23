package OopsPrinciples.Polymorphism;

public class ProductMain {
	public static void main(String[] args) {
		
		Product p1 = new Product("Mobile");
		
		Product p2 = new Product("Laptop",100000);
		
		Product p3 = new Product("Car",500000,"Transport");
		
		p1.display();
		p2.display();
		p3.display();
		
	}
}
