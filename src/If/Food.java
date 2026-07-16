package If;

import java.util.Scanner;

public class Food {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Pizza\n2.Burger\n3.Sandwich\n4.Biryani\n5.Coffee");
		System.out.println("What you would like to order: ");
		int f = sc.nextInt();
		switch(f) {
		case 1 : System.out.println("Pizza\nPrice = ₹200");
		break;
		case 2 : System.out.println("Burger\nPrice = ₹120");
		break;
		case 3 : System.out.println("Sandwich\nPrice = ₹90");
		break;
		case 4 : System.out.println("Biryani\nPrice = ₹250");
		break;
		case 5 : System.out.println("Coffee\nPrice = ₹20");
		break;
		default : System.out.println("Item Not Available");
		}
		sc.close();
	}

}
