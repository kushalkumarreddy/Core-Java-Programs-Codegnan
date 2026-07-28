package OopsPrinciples.Abstraction;

public class RideServiceMain {
	    public static void main(String[] args) {

	        RideService ride;

	        ride = new BikeRide("Ravi", "KA01AB1234", "MG Road", "Majestic");
	        ride.displayRideDetails();
	        ride.calculateFare();

	        System.out.println();

	        ride = new CarRide("Suresh", "KA02CD5678", "Whitefield", "Electronic City");
	        ride.displayRideDetails();
	        ride.calculateFare();

	        System.out.println();

	        ride = new AutoRide("Mahesh", "KA03EF9012", "BTM Layout", "Koramangala");
	        ride.displayRideDetails();
	        ride.calculateFare();
	}
}
