public class MerchentPayment extends Payment {

    public MerchentPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " paid to Merchant.");
            System.out.println("Remaining Balance: " + getBalance());
        } else {
            System.out.println("Insufficient Balance for Merchant Payment!");
        }
    }
}