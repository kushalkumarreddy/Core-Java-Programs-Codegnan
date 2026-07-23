package OopsPrinciples.Encapsulation;

public class SubscriberMain {

    public static void main(String[] args) {

        Subscriber sub = new Subscriber();

        sub.setSubscriberId(101);
        sub.setName("Kushal");
        sub.setEmail("abcd@gmail.com");
        sub.setSubscriptionPlan("Premium");
        sub.setExpiryDate("31-12-2026");

        System.out.println("Subscriber ID : " + sub.getSubscriberId());
        System.out.println("Name          : " + sub.getName());
        System.out.println("Email         : " + sub.getEmail());
        System.out.println("Plan          : " + sub.getSubscriptionPlan());
        System.out.println("Expiry Date   : " + sub.getExpiryDate());
    }
}