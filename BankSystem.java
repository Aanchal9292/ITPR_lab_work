package Project1;
import java.util.Scanner;

class Account {
    String accNo;
    String name;
    double balance;

    public Account(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
    }

    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void displayInfo(String type) {
        System.out.println("--------------- Account Info --------------------");
        System.out.println("Name: " + name);
        System.out.println("A/C No: " + accNo);
        System.out.println("Type of Account: " + type);
        System.out.println("Available Balance: Rs." + balance);
        System.out.println("--------------------------------------------------");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mainChoice = 1; // ✅ Initialize variable to avoid "might not be initialized" error

        do {
            System.out.println("------------------------------------------------------------------");
            System.out.println("------------ Select Account ------------");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("------------------------------------------------------------------");
            System.out.print("Select any one: ");
            int accType = sc.nextInt();

            if (accType == 1) {
                // Savings Account
                System.out.println("------------- Savings Account ----------------");
                System.out.print("Enter A/C No.: ");
                String acno = sc.next();
                System.out.print("Enter Customer Name: ");
                sc.nextLine(); // consume newline character
                String name = sc.nextLine();
                System.out.print("Enter Initial balance (in Rs)(must be >= 1000): ");
                double balance = sc.nextDouble();

                if (balance < 1000) {
                    System.out.println("Minimum balance for Savings Account is Rs.1000!");
                    continue;
                }

                Account savings = new Account(acno, name, balance);
                int operation;

                do {
                    System.out.println("-------- Operation ------");
                    System.out.println("1. Withdrawal");
                    System.out.println("2. Deposit");
                    System.out.println("3. A/C info");
                    System.out.println("4. Balance info");
                    System.out.print("Select any one: ");
                    operation = sc.nextInt();

                    if (operation == 1) {
                        System.out.print("Enter amount to withdraw: ");
                        double amt = sc.nextDouble();
                        savings.withdraw(amt);
                    } else if (operation == 2) {
                        System.out.print("Enter amount to deposit: ");
                        double amt = sc.nextDouble();
                        savings.deposit(amt);
                    } else if (operation == 3) {
                        savings.displayInfo("Savings Account");
                    } else if (operation == 4) {
                        System.out.println("Available Balance: Rs." + savings.balance);
                    } else {
                        System.out.println("Invalid choice!");
                    }

                    System.out.print("Press 0 to exit or any other number to continue in Savings Account: ");
                    operation = sc.nextInt();
                } while (operation != 0);

            } else if (accType == 2) {
                // Current Account
                System.out.println("------------- Current Account ----------------");
                System.out.print("Enter A/C No.: ");
                String acno = sc.next();
                System.out.print("Enter Customer Name: ");
                sc.nextLine(); // consume newline character
                String name = sc.nextLine();
                System.out.print("Enter Initial balance (in Rs)(must be >= 5000): ");
                double balance = sc.nextDouble();

                if (balance < 5000) {
                    System.out.println("Minimum balance for Current Account is Rs.5000!");
                    continue;
                }

                Account current = new Account(acno, name, balance);
                int operation;

                do {
                    System.out.println("-------- Operation ------");
                    System.out.println("1. Withdrawal");
                    System.out.println("2. Deposit");
                    System.out.println("3. A/C info");
                    System.out.println("4. Balance info");
                    System.out.print("Select any one: ");
                    operation = sc.nextInt();

                    if (operation == 1) {
                        System.out.print("Enter amount to withdraw: ");
                        double amt = sc.nextDouble();
                        current.withdraw(amt);
                    } else if (operation == 2) {
                        System.out.print("Enter amount to deposit: ");
                        double amt = sc.nextDouble();
                        current.deposit(amt);
                    } else if (operation == 3) {
                        current.displayInfo("Current Account");
                    } else if (operation == 4) {
                        System.out.println("Available Balance: Rs." + current.balance);
                    } else {
                        System.out.println("Invalid choice!");
                    }

                    System.out.print("Press 0 to exit or any other number to continue in Current Account: ");
                    operation = sc.nextInt();
                } while (operation != 0);
            } else {
                System.out.println("Invalid Account Type!");
            }

            System.out.print("Press 0 to exit from account or any other number to continue account operation: ");
            mainChoice = sc.nextInt();
        } while (mainChoice != 0);

        System.out.println("Thank you for using the Banking System!");
        sc.close();
    }
}
