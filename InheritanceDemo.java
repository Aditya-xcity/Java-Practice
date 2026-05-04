// Practice program: single inheritance

class AnimalDemo
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}

class DogDemo extends AnimalDemo
{
    void bark()
    {
        System.out.println("Dog is barking");
    }
}

public class InheritanceDemo
{
    public static void main(String[] args)
    {
        DogDemo dog = new DogDemo();
        dog.eat();
        dog.bark();
    }
}