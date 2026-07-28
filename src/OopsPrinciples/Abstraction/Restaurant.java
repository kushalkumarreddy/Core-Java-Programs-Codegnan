package OopsPrinciples.Abstraction;

//Abstract Class
abstract class Restaurant {
 String name;
 String location;

 // Constructor
 Restaurant(String name, String location) {
     this.name = name;
     this.location = location;
 }

 void displayDetails() {
     System.out.println("Restaurant Name: " + name);
     System.out.println("Location: " + location);
 }

 abstract void prepareFood();
}

class PizzaRestaurant extends Restaurant {

 PizzaRestaurant(String name, String location) {
     super(name, location);
 }

 @Override
 void prepareFood() {
     System.out.println("Preparing Pizza with cheese and toppings.");
 }
}

class BiryaniRestaurant extends Restaurant {

 BiryaniRestaurant(String name, String location) {
     super(name, location);
 }

 @Override
 void prepareFood() {
     System.out.println("Preparing Biryani with spices and rice.");
 }
}


class Bakery extends Restaurant {

 Bakery(String name, String location) {
     super(name, location);
 }

 @Override
 void prepareFood() {
     System.out.println("Baking cakes and pastries.");
 }
}
