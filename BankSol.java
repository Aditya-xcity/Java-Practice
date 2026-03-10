// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the
// account balance falls below one hundred.

/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

class BankAccount
{
    protected int accountMoney;

    BankAccount(int accountMoney)
    {
        this.accountMoney = accountMoney;
    }

    void deposit(int amount)
    {
        accountMoney = accountMoney + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + accountMoney);
    }

    void withdraw(int amount)
    {
        if(amount > accountMoney)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            accountMoney = accountMoney - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + accountMoney);
        }
    }
}

class SavingsAccount extends BankAccount
{
    SavingsAccount(int accountMoney)
    {
        super(accountMoney);
    }

    @Override
    void withdraw(int amount)
    {
        if(accountMoney - amount < 100)
        {
            System.out.println("Withdrawal denied. Balance cannot go below 100.");
        }
        else
        {
            accountMoney = accountMoney - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + accountMoney);
        }
    }
}

public class BankSol
{
    public static void main(String[] args)
    {
        SavingsAccount s = new SavingsAccount(2000);

        s.deposit(500);
        s.withdraw(300);
        s.withdraw(2100);
        s.withdraw(1700);
    }
}
