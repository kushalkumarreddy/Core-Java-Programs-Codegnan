package java8.innerclass;

class Emp {
    int eid;
    
    public void getDetails() {
        System.out.println("It is employee class");
    }

    class Address {
        public void getAddress() {
            System.out.println("It is an address class");
        }
    }
}

public class Employee {
    public static void main(String[] args) {

        Emp emp = new Emp();
        emp.getDetails();

        Emp.Address ad = emp.new Address();
        ad.getAddress();
    }
}