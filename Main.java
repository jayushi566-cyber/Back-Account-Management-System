
class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    // Constructor
    BankAccount(int a, String n, double b) {
        accountNumber = a;
        accountHolderName = n;
        balance = b;
    }

    // Deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Money deposited: " + amount);
    }

    // Withdraw money
    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Money withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Check balance
    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    // Display account details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(101, "Rahul", 5000);
        BankAccount b2 = new BankAccount(102, "Priya", 8000);

        System.out.println("Account 1");

        b1.deposit(2000);
        b1.withdraw(1000);
        b1.checkBalance();
        b1.displayDetails();

        System.out.println();

        System.out.println("Account 2");

        b2.deposit(3000);
        b2.withdraw(12000);
        b2.checkBalance();
        b2.displayDetails();

    }
}
