package OopsPrinciples.Encapsulation;

public class Subscriber {

    private int subscriberId;
    private String name;
    private String email;
    private String subscriptionPlan;
    private String expiryDate;

    public int getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Invalid Email");
        }
    }

    public String getSubscriptionPlan() {
        return subscriptionPlan;
    }

    public void setSubscriptionPlan(String subscriptionPlan) {
        if (subscriptionPlan.equals("Basic") ||
            subscriptionPlan.equals("Standard") ||
            subscriptionPlan.equals("Premium")) {

            this.subscriptionPlan = subscriptionPlan;
        } else {
            System.out.println("Invalid Subscription Plan");
        }
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}