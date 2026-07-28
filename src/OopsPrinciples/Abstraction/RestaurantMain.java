package OopsPrinciples.Abstraction;

public class RestaurantMain {
	public static void main(String[] args) {

	     Restaurant r;

	     r = new PizzaRestaurant("Pizza Hut", "Hyderabad");
	     r.displayDetails();
	     r.prepareFood();

	     System.out.println();

	     r = new BiryaniRestaurant("Paradise", "Bangalore");
	     r.displayDetails();
	     r.prepareFood();

	     System.out.println();

	     r = new Bakery("Sweet Treats", "Chennai");
	     r.displayDetails();
	     r.prepareFood();
	 }

}
