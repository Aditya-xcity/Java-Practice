// Write a Java program to create a class called StudentBase with a method called study().
// Create a subclass called EngineeringStudent that overrides the study() method and adds a new method called buildProject().

public class StudentQuestion
{
    public static void main(String[] args)
    {
        // TODO: Create an EngineeringStudent object and call study() and buildProject().
    }
}

class StudentBase
{
    void study()
    {
        // TODO: Write the general study message.
    }
}

class EngineeringStudent extends StudentBase
{
    @Override
    void study()
    {
        // TODO: Write the engineering study message.
    }

    void buildProject()
    {
        // TODO: Write the project building message.
    }
}