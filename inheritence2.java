class Account{
    protected String HolderName;
    protected int accNo;
    protected double balance;
    
    public Account(String holderName, int accNo, double balance) {
       this. HolderName = holderName;
        this.accNo = accNo;
        this.balance = balance;
    }
   public void deposit (double amount){
    balance = balance + amount;
   }
   public void withdraw(double amount){
    balance= balance- amount;
   }
}
class SavingsAccount extends Account{
    protected double intrestRate;
    protected double minBalance;
    public SavingsAccount(String holderName, int accNo, double balance, double intrestRate, double minBalance) {
        super(holderName, accNo, balance);
        this.intrestRate = intrestRate;
        this.minBalance = 5000;
    }
    @Override
    public String toString() {
        return "SavingsAccount [HolderName=" + HolderName + ", accNo=" + accNo + ", balance=" + balance
                + ", intrestRate=" + intrestRate + ", minBalance=" + minBalance + "]";
    }
}
public class inheritence2{
    public static void main(String[] args){

    }
}