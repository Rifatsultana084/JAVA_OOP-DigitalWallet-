public class SendMoney extends Payment {   //subclass of Payment class
    private int receiverAccount;//private access instance variable

    public SendMoney(double amount, int receiverAccount) {//send money Constructor
        super(amount);// super class of parent class a inheritance
        this.receiverAccount = receiverAccount;
    }

    @Override
    public void processPayment() { //Abstract method implementation
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
