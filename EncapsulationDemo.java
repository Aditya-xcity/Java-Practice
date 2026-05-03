// Practice program: encapsulation using private fields and getters/setters

class BankAccountDemo
{
    private final String accountHolder;
    private double balance;

    BankAccountDemo(String accountHolder, double balance)
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder()
    {
        return accountHolder;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
        }
    }

    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
        }
    }
}

public class EncapsulationDemo
{
    public static void main(String[] args)
    {
        BankAccountDemo account = new BankAccountDemo("Aditya", 5000);
        account.deposit(1500);
        account.withdraw(1200);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());
    }
}