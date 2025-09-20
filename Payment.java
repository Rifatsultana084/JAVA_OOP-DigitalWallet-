public abstract class Payment {
    private static double accountBalance ; // initial balance
    protected double amount; // transaction amount

    public Payment(double amount) {
        this.amount = amount;
    }

    // Shared balance methods
    public static double getBalance() {
        return accountBalance;
    }

    public static void setBalance(double balance) {
        Payment.accountBalance = balance;
    }

    // Each subclass must implement its own payment logic
    public abstract void processPayment();
}