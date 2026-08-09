// an  abstract class is a class that is declared with the abstract keyword.
// it can have abstract methods (methods without a body) as well as concrete methods.
// you cannot create object of an abstract class,
// you can inherit abstract class

abstract class Account {
    protected String holderName;
    protected int accNO;
    protected double balance;
    protected static int counter = 0;

    // When a variable is declared with the static keyword, only one copy of the
    // variable is created in memory, and it is shared among all instances of the
    // class.
    public Account(String holderName, int accNO, double balance) {
        this.holderName = holderName;
        this.accNO = ++counter;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    @Override
    public String toString() {
        return "Account [holderName=" + holderName + ", accNO=" + accNO + ", balance=" + balance + "]";
    }
}

class SavingAccount extends Account {
    protected double interestRate;
    protected double minBalance;

    public SavingAccount(String holderName, int accNO, double balance, double interestRate, double minBalance) {
        super(holderName, accNO, balance);
        this.interestRate = interestRate;
        this.minBalance = minBalance;
    }

    @Override
    public void withdraw(double amount) {
        if ((balance - amount) >= minBalance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance..maintain minBalance of " + minBalance);
        }
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
    }
}

public class Abstractclass {
    public static void main(String[] args) {
        Account obj1 = new SavingAccount("musab", 2934, 500000000, 2.5, 5000);
        System.out.println(obj1.toString());

        obj1.deposit(50000);
        obj1.withdraw(10000);

        Account obj2 = new SavingAccount("nawaz", 29, 400000, 50, 1000);
        System.out.println(obj2.toString());

        obj2.deposit(50000);
        obj2.withdraw(10000);

    }
}
