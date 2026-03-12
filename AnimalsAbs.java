// 1. Write a Java program to create an abstract class Animal with an abstract method called sound(). 
// Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method 
// to make a specific sound for each animal.

/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

abstract class Animal{
    public abstract void sound();
}

class Lion extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Rawr!");
    }
}

class Tiger extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Roar!");
    }
}

class AnimalsAbs
{
    public static void main(String[] args)
    {
        Tiger t = new Tiger();
        t.sound();

        Lion l = new Lion();
        l.sound();
    }
}