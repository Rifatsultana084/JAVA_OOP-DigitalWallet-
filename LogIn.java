import java.util.Scanner;

public class LogIn {
    private String name;
    private int num;
    private int pass;

    Scanner sc = new Scanner(System.in);

    // --- Login / Signup method ---
    public void login() {
        System.out.println("Enter Name:");
        this.name = sc.nextLine();

        System.out.println("Enter Number:");
        this.num = sc.nextInt();

        System.out.println("Enter your PIN:");
        this.pass = sc.nextInt();

        System.out.println("Re-Enter your PIN:");
        int pin1 = sc.nextInt();

        if (this.pass == pin1) {
            System.out.println("Your Account is Created Successfully!");
        } else {
            System.out.println("Wrong Pin! Try Again");
        }
    }

    // --- Getters and Setters ---
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public int getPass() {
        return pass;
    }
    public void setPass(int pass) {
        this.pass = pass;
    }

    // --- Example usage ---
    public static void main(String[] args) {
        LogIn user = new LogIn();
        user.login();

        // Show stored data
        System.out.println("Stored User: " + user.getName() + ", Number: " + user.getNum());
    }
}
    
