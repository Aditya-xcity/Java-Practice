// Write a Java program to create a class called Appliance with a method called turnOn().
// Create a subclass called WashingMachine that overrides the turnOn() method to print a washing machine start message.

public class ApplianceQuestion
{
    public static void main(String[] args)
    {
        // TODO: Create a WashingMachine object and call turnOn().
    }
}

class Appliance
{
    void turnOn()
    {
        // TODO: Write the general turn on message.
    }
}

class WashingMachine extends Appliance
{
    @Override
    void turnOn()
    {
        // TODO: Write the washing machine start message.
    }
}