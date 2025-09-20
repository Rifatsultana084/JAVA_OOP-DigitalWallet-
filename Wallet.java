import java.util.Scanner;

public class Wallet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("Welcome to Digital Wallet System");

        while (isRunning) {
            System.out.println("\n1. Send Money");
            System.out.println("2. Add Money");
            System.out.println("3. Mobile Recharge");
            System.out.println("4. Utility Bill Payment");
            System.out.println("5. Merchant Payment");
            System.out.println("6. Show Balance");
            System.out.println("7. Exit");
            System.out.print("Enter choice between(1-8) ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount to send: ");
                    double amt = sc.nextDouble();
                    System.out.print("Enter receiver account number: ");
                    int acc = sc.nextInt();
                    SendMoney sm = new SendMoney(amt, acc);
                    sm.processPayment();
                }
                 case 2 -> {
                    System.out.print("Enter amount to Add in Account: ");
                    double amt = sc.nextDouble();
                    AddMoney am = new AddMoney(amt);
                    am.processPayment();
                }
                case 3 -> {
                    System.out.print("Enter recharge amount: ");
                    double amt = sc.nextDouble();
                    System.out.print("Enter phone number: ");
                    long phone = sc.nextLong();
                    MobileRecharge mr = new MobileRecharge(amt, phone);
                    mr.processPayment();
                }
                case 4 -> {
                    System.out.print("Enter bill amount: ");
                    double amt = sc.nextDouble();
                    System.out.print("Enter meter number: ");
                    long meter = sc.nextLong();
                    UtilityBill ub = new UtilityBill(amt, meter);
                    ub.processPayment();
                }
                case 5 -> {
                    System.out.print("Enter amount for merchant payment: ");
                    double amt = sc.nextDouble();
                    MerchentPayment mp = new MerchentPayment(amt);
                    mp.processPayment();
                }
                case 6 -> System.out.println("Current Balance: " + Payment.getBalance());
                case 7 -> {
                    System.out.println("Exiting Wallet. Goodbye!");
                    isRunning = false;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}