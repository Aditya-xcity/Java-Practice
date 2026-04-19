/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

import java.util.Scanner;

class BookInfo
{
    String bookName;
    String authorName;
    int price;

    BookInfo()
    {
        this.bookName = "Unknown";
        this.authorName = "Unknown";
        this.price = 0;
    }

    BookInfo(String bookName, String authorName, int price)
    {
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    void printDetails()
    {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: " + price);
    }
}

public class bookConstructorProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String bookName;
        String authorName;
        int price;

        System.out.println("Enter book name:");
        bookName = sc.nextLine();
        System.out.println("Enter author name:");
        authorName = sc.nextLine();
        System.out.println("Enter price:");
        price = sc.nextInt();

        BookInfo b1 = new BookInfo();
        BookInfo b2 = new BookInfo(bookName, authorName, price);

        System.out.println("Default Constructor:");
        b1.printDetails();
        System.out.println("Parameterized Constructor:");
        b2.printDetails();
    }
}