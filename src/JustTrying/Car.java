package JustTrying;

import java.util.Scanner;

public class Car {
	String name;
	double price;
	String color;
	
	static Car[] c = new Car[5];
	static int index = 0;
	
	public Car(String name, double price,String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	static void addCar(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Car name: ");
		String name = sc.nextLine();
		System.out.println("Enter Car Price: ");
		double price = sc.nextDouble();
		System.out.println("Enter color: ");
		String color = sc.next();
		
		Car car = new Car(name,price,color);
		c[index++] = car;
		System.out.println("Car added Sucessfully");		
	}
	
	static void display() {
		for(int i=0;i<index;i++) {
			System.out.println(i+" : index Car details");
			System.out.println(c[i].name);
			System.out.println(c[i].price);
			System.out.println(c[i].color);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean start = true;
		
		do {
			System.out.println("1.Add Car\n2.Display Available Cars\n3.Exit\n");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : 
				addCar();
				break;
			case 2 : 
				display();
				break;
			case 3 : 
				System.out.println("Exited Sucessfully");
				start = false;
				break;
				default: 
					System.out.println("invalid choice try again");
			}
		} while(start);
	}

}
