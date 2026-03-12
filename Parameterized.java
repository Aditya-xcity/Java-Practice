// Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. Print the values of the variables.


import java.util.Scanner;

class Dog{
    String color;
    String name;



    Dog(String name,String color)
    {
        this.name = name;
        this.color = color;
    }

void printter()
    {
        System.out.println("name of the cat is:"+name);
        System.out.println("and its color is:"+color);
    }
}

class Parameterized{

public static void main(String[] args)
{
    String name;
    String color;

Scanner sc = new Scanner(System.in);
System.out.println("enter name of cat");
name = sc.nextLine();
System.out.println("enter color ");
color = sc.nextLine();

Dog d = new Dog(name,color);


d.printter();

}
}