//using Arrays
package Constructor;

import java.util.Scanner;

public class Fruit {
	String name;
	double price;
	String color;
	
	static Fruit[] fru = new Fruit[10];
	static int index = 0;
	
	public Fruit(String name,double price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;		
	}
	
	static void addFruit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fruit Name: ");
		String name = sc.nextLine();
					sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Enter color: ");
		String color=sc.next();
		
		Fruit f=new Fruit(name,price,color);
		fru[index++]=f;
		System.out.println("add fruit successfully");
	}
	
	  static void displayFruits() {
		  for(int i=0;i<index;i++) {
			  System.out.println(i+" :index fruit");
			  System.out.println(fru[i].name);
			  System.out.println(fru[i].price);
			  System.out.println(fru[i].color);
			 
		  } 
	  }
	  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean start=true;
				
		do {
			System.out.println("1.addfruit \n2.displayfruit \n3.checkfruit \n4.exit");
			System.out.println("enter the choice");
			int choice=sc.nextInt();
			
		switch(choice) {
		case 1:addFruit();
		       break;
		case 2:displayFruits();
		       break;
		case 4:System.out.println("exit successfully");
		       start=false;
		       break;
		default:System.out.println("invalid choice try again");
		}
	}while(start);

	}

}
