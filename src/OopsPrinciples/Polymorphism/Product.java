package OopsPrinciples.Polymorphism;

public class Product {
	
	String ProductName;
	double Price;
	String Category;
	
	public Product(String ProductName) {
		this.ProductName = ProductName;
	}
	
	public Product(String ProductName, double Price) {
		this.ProductName = ProductName;
		this.Price = Price;
	}
	
	public Product(String ProductName, double Price, String Category) {
		this.ProductName = ProductName;
		this.Price = Price;
		this.Category = Category;
	}
	
	void display() {
		System.out.println("Product Name: "+ProductName);
		
		if(Price != 0) {
		System.out.println("Price: "+Price);
		}
		
		if(Category != null) {
		System.out.println("Category: "+Category);
		}
		
		System.out.println();
	}

}
