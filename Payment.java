public abstract class Payment {
    private static double accountBalance ; // Static variable account balance
    protected double amount; // instance variable transaction amount

    public Payment(double amount) {//Constructor
        this.amount = amount;
    }

    // Balance ar Getter Method
    public static double getBalance() {
        return accountBalance;
    }
//Balance Setter method
    public static void setBalance(double balance) {
        Payment.accountBalance = balance;
    }

    // Abstract Method-Each subclass must implement its own payment logic
    public abstract void processPayment();
}
