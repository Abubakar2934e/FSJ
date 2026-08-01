import java.util.Scanner;

class BankAccount {
    int accountNumber;
    double balance;

    void setDetails(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void display() {
        System.out.println("Final Balance: " + balance);
    }
}

public class methodove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        acc.setDetails(accNo, bal);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n1. Deposit  2. Withdraw");
            int choice = sc.nextInt();

            System.out.print("Enter amount: ");
            double amt = sc.nextDouble();

            if (choice == 1)
                acc.deposit(amt);
            else
                acc.withdraw(amt);
        }

        acc.display();
    }
}