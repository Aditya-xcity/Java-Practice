// Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:

// One constructor takes title and author as parameters.
// The other constructor takes title, author, and price as parameters.
// Print the values of the variables for each constructor.

import java.util.Scanner;

class Book{
    String Title;
    String author;
    int price;

    Book()
    {
        this.Title ="No Title";
        this.author = "no author";
        this.price = 0;
    }


    Book(String Title,String author)
    {
        this.Title = Title;
        this.author = author;
     
    }


       Book(String Title,String author,int price)
    {
        this.Title = Title;
        this.author = author;
        this.price = price;
    }



    void printter()
    {
        System.out.println("Title: " + Title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}


class Overloading
{
    public static void main(String[] args)
    {
Scanner sc = new Scanner(System.in);

String Title,author;
int price;
System.out.println("Enter the title of the book:"); 
Title =sc.nextLine();
System.out.println("Enter the author of the book:");
author = sc.nextLine();
System.out.println("Enter the price of the book:");
price = sc.nextInt();


Book b1 = new Book();
Book b2 = new Book(Title,author);
Book b3 = new Book(Title,author,price);



System.out.println("Default Constructor:");
b1.printter();
System.out.println("Parameterized Constructor (Title, Author):");
b2.printter();
System.out.println("Parameterized Constructor (Title, Author, Price):");
b3.printter();



  }
}




