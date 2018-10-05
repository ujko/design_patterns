package behavioral.strategy;

public class PayPallStrategy implements PaymentStrategy{

    private String emailId;
    private String password;

    public PayPallStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void paid(int amount) {
        System.out.println(amount + " paid using PayPal");
    }
}
