package Constructor;

public class Mobile {
	int id;
	String brand;
	String model;
	double price;
	
	public Mobile() {
		id = 1001;
		brand = "Samsung";
		model = "Galaxy A35";
		price = 28000;
	}
	
	public Mobile(int mid, String b, String m, double p) {
		id = mid;
		brand = b;
		model = m;
		price = p;
	}
	
	public Mobile(Mobile m1) {
		id = m1.id;
		brand = m1.brand;
		model = m1.model;
		price = m1.price;
	}
	
	void display() {
		System.out.println("Mobile Id: "+id);
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Mobile mob1 = new Mobile();
		System.out.println("Mobile 1 (Default Constructor)");
		System.out.println("-----------------------------");
		mob1.display();
		
		Mobile mob2 = new Mobile(1002,"OnePlus","Nord CE 5",24999);
		System.out.println("Mobile 2 (Parameterized constructor)");
		System.out.println("------------------------------------");
		mob2.display();
		
		Mobile mob3 = new Mobile(mob2);
		System.out.println("Mobile 3 (Copy Constructor)");
		System.out.println("---------------------------");
		mob3.display();
		
		System.out.println("------------------------------------");
		System.out.println("After Updating the Price of Mobile 3");
		System.out.println("------------------------------------\n");
		
		mob3.price = 23000;
		
		System.out.println("Mobile 2 Details");
		System.out.println("----------------");
		mob2.display();
		
		System.out.println("Mobile 3 Details");
		System.out.println("----------------");
		mob3.display();
	}

}
