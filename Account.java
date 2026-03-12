// Write a Java program to create a class called Account with instance variables accountNumber and balance. Implement a parameterized constructor that initializes these variables with validation:
// accountNumber should be non-null and non-empty.
// balance should be non-negative.
// Print an error message if the validation fails.

public class Account {
    String accountNumber;
    double balance;
    
    // Parameterized constructor with validation
    Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Error: Account number cannot be null or empty.");
            this.accountNumber = null;
            this.balance = 0;
        } else if (balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
            this.accountNumber = null;
            this.balance = 0;
        } else {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }
    
    // Method to print account details
    void printDetails() {
        if (accountNumber != null) {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        } else {
            System.out.println("Account not created due to validation errors.");
        }
    }
    
    public static void main(String[] args) {
        // Valid account
        System.out.println("Account 1 (Valid):");
        Account account1 = new Account("ACC123456", 5000.50);
        account1.printDetails();
        
        System.out.println();
        
        // Invalid account - empty account number
        System.out.println("Account 2 (Invalid - Empty Account Number):");
        Account account2 = new Account("", 3000);
        account2.printDetails();
        
        System.out.println();
        
        // Invalid account - negative balance
        System.out.println("Account 3 (Invalid - Negative Balance):");
        Account account3 = new Account("ACC789012", -1500);
        account3.printDetails();
        
        System.out.println();
        
        // Valid account
        System.out.println("Account 4 (Valid):");
        Account account4 = new Account("ACC345678", 10000);
        account4.printDetails();
    }
}
