public class UtilityBill extends Payment {
    private long meterNumber;

    public UtilityBill(double amount, long meterNumber) {
        super(amount);
        this.meterNumber = meterNumber;
    }

    @Override
    public void processPayment() {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " paid for Utility Bill (Meter: " + meterNumber + ")");
            System.out.println("Remaining Balance: " + getBalance());
        } else {
            System.out.println("Insufficient Balance for Utility Bill Payment!");
        }
    }

    public void setMeterNumber(long meterNumber) {
        this.meterNumber = meterNumber;
    }
}