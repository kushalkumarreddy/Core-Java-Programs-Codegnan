package OopsPrinciples.Polymorphism;

public class Courier {

    public void calculateCharge(double weight) {
        double charge = weight * 50;
        System.out.println("Delivery Charge: " + charge);
    }

    public void calculateCharge(double weight, double distance) {
        double charge = (weight * 50) + (distance * 2);
        System.out.println("Delivery Charge: " + charge);
    }

    public void calculateCharge(double weight, double distance, boolean express) {
        double charge = (weight * 50) + (distance * 2);
        if (express) {
            charge += 100;
        }

        System.out.println("Delivery Charge: " + charge);
    }
    
    

    public static void main(String[] args) {

        Courier courier = new Courier();

        courier.calculateCharge(5);
        courier.calculateCharge(5, 100);
        courier.calculateCharge(5, 100, true);
    }
}