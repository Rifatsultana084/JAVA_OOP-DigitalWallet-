public class SendMoney extends Payment {
    private int receiverAccount;

    public SendMoney(double amount, int receiverAccount) {
        super(amount);
        this.receiverAccount = receiverAccount;
    }

    @Override
    public void processPayment() {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " sent successfully to account " + receiverAccount);
            System.out.println("Remaining Balance: " + getBalance());
        } else {
            System.out.println("Insufficient Balance for Sending Money!");
        }
    }


    public void setReceiverAccount(int receiverAccount) {
        this.receiverAccount = receiverAccount;
    }
}