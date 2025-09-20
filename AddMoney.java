public class AddMoney  extends Payment {
    private long meterNumber;

    public AddMoney(double amount) {
        super(amount);
        
    }

    @Override
    public void processPayment() {
       System.out.println("Enter The Amount Add in Account :");
       setBalance(getBalance() + amount);
       System.out.println("Your Current Balance is :"+getBalance());
    }

   
} 