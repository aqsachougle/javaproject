import java.util.Scanner;

public class ATM {

    float balance = 0.0f; // Initialize balance to 0.0
    int pin = 1234;

    public void checkPin() {
        System.out.println("Enter your Pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == pin) {
            menu();
        } else {
            System.out.println("Enter a valid pin");
            checkPin(); // Call checkPin again to retry
        }
    }

    public void menu() {
        System.out.println("Enter your choice ");
        System.out.println("1.Check Bank Balance ");
        System.out.println("2.Withdraw Cash ");
        System.out.println("3.Deposit money ");
        System.out.println("4.Exit ");

        Scanner scn = new Scanner(System.in);
        int opt = scn.nextInt();
        if (opt == 1) {
            checkBal();
        } else if (opt == 2) {
            withdraw();
        } else if (opt == 3) {
            deposit();
        } else if (opt == 4) {
            System.out.println("Exiting...");
            System.exit(0); // Exit the program
        } else {
            System.out.println("Enter a valid choice");
            menu(); // Call menu again to retry
        }
    }

    public void checkBal() {
        System.out.println("Your current account Balance is " + balance);
        menu();
    }

    public void withdraw() {
        System.out.println("Enter amount");
        Scanner scan = new Scanner(System.in);
        int amt = scan.nextInt();
        if (amt < balance) {
            System.out.println("Here is your cash");
            balance = balance - amt;
            menu();
        } else {
            System.out.println("Insufficient Balance");
            menu();
        }
    }

    public void deposit() { // Add return type void
        System.out.println("Enter the amount ");
        Scanner sac = new Scanner(System.in);
        int amountD = sac.nextInt();
        balance = balance + amountD;
        System.out.println("Amount Deposited Successfully! ");
        menu();
    }

    public static void main(String args[]) {
        ATM obj = new ATM(); // Create an instance of ATM
        obj.checkPin(); // Call checkPin to start the program
    }
}