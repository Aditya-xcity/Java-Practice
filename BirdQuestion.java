// Write a Java program to create a class called BirdBase with a method called fly().
// Create a subclass called EagleBird that overrides the fly() method to print how an eagle flies.

public class BirdQuestion
{
    public static void main(String[] args)
    {
        // TODO: Create an EagleBird object and call fly().
    }
}

class BirdBase
{
    void fly()
    {
        // TODO: Write the general flying message.
    }
}

class EagleBird extends BirdBase
{
    @Override
    void fly()
    {
        // TODO: Write the eagle flying message.
    }
}