package OopsPrinciples.Inheritance;

public class Dog extends Animal {

    String name = "dog";

    public Dog() {
        this(30);
        System.out.println("It is Dog Constructor");
    }

    public Dog(int a) {
        super(20);
        System.out.println(a);
    }

    void makeSound() {
        System.out.println("Bow Bow......");
        System.out.println(getClass());
    }

    void display() {
        System.out.println(name);
        System.out.println(super.name);

        makeSound();
        super.makeSound();
    }
}