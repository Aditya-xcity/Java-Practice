// 1. Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/



class Pig{

    void makeSound()
    {
        System.out.println("oink oink!");
    }
}

class Dog extends Pig
{
    @Override
    void makeSound()
    {
        System.out.println("Bhau Bhau!");
    }
}

public class animal{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.makeSound();
    }
}