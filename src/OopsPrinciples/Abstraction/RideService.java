package OopsPrinciples.Abstraction;

abstract class RideService {
    String driverName;
    String vehicleNumber;
    String pickupLocation;
    String dropLocation;

    RideService(String driverName, String vehicleNumber,
                String pickupLocation, String dropLocation) {
        this.driverName = driverName;
        this.vehicleNumber = vehicleNumber;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
    }

    void displayRideDetails() {
        System.out.println("Driver Name: " + driverName);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Pickup Location: " + pickupLocation);
        System.out.println("Drop Location: " + dropLocation);
    }

    abstract void calculateFare();
}

class BikeRide extends RideService {

    BikeRide(String driverName, String vehicleNumber,
             String pickupLocation, String dropLocation) {
        super(driverName, vehicleNumber, pickupLocation, dropLocation);
    }

    @Override
    void calculateFare() {
        System.out.println("Bike Ride Fare: ₹100");
    }
}

class CarRide extends RideService {

    CarRide(String driverName, String vehicleNumber,
            String pickupLocation, String dropLocation) {
        super(driverName, vehicleNumber, pickupLocation, dropLocation);
    }

    @Override
    void calculateFare() {
        System.out.println("Car Ride Fare: ₹250");
    }
}

class AutoRide extends RideService {

    AutoRide(String driverName, String vehicleNumber,
             String pickupLocation, String dropLocation) {
        super(driverName, vehicleNumber, pickupLocation, dropLocation);
    }

    @Override
    void calculateFare() {
        System.out.println("Auto Ride Fare: ₹150");
    }
}