package OopsPrinciples.Inheritance;

public class Animal {

    String name = "animal";

    public Animal(int a) {
        System.out.println(a);
        System.out.println("It is Animal Constructor");
    }

    void makeSound() {
        System.out.println("It makes Animal Sound");
        System.out.println(getClass().getSuperclass());
    }
}