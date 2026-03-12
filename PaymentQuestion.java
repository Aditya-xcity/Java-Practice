// Write a Java program to create a class called Payment with a method called makePayment().
// Create a subclass called CreditCardPayment that overrides the makePayment() method to print a credit card payment message.

public class PaymentQuestion
{
    public static void main(String[] args)
    {
        // TODO: Create a CreditCardPayment object and call makePayment().
    }
}

class Payment
{
    void makePayment()
    {
        // TODO: Write the general payment message.
    }
}

class CreditCardPayment extends Payment
{
    @Override
    void makePayment()
    {
        // TODO: Write the credit card payment message.
    }
}