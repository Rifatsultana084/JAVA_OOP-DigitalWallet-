public class MobileRecharge extends Payment {
    private long phoneNumber;

    public MobileRecharge(double amount, long phoneNumber) {
        super(amount);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void processPayment() {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " recharged to phone " + phoneNumber);
            System.out.println("Remaining Balance: " + getBalance());
        } else {
            System.out.println("Insufficient Balance for Mobile Recharge!");
        }
    }

   

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}