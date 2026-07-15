package Constructor;

public class Laptop {
	String brand;
	String model;
	int price;
	
	public Laptop(String b,String m,int p) {
		brand = b;
		model = m;
		price = p;
	}
	
	Laptop (Laptop l){
		brand = l.brand;
		model = l.model;
		price = l.price;
	}
	
	void display() {
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
	}
	
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell","Inspiron 15",62000);
		
		Laptop l2 = new Laptop(l1);
		
		System.out.println("Laptop 1");
		l1.display();
		
		System.out.println();
		
		System.out.println("Laptop 2");
		l2.display();
	}

}
