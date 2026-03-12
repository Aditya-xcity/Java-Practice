// Write a Java program to create a class called "Cat" with instance variables name and age.
// Implement a default constructor that initializes the name to "Unknown" and the age to 0.
// Print the values of the variables.

class Cat {
    String name;
    int age;

    Cat()
    {
        this.name = "Unknown";
        this.age = 0;
    }

    void printer()
    {
        System.out.println(name);
        System.out.println(age);
    }
}

class Default{
    public static void main(String[] args)
    {
        Cat c = new Cat();
        c.printer();
    }
}