/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

import java.util.Scanner;

class ProductInfo
{
    String productName;
    int quantity;
    int price;

    ProductInfo()
    {
        this.productName = "Unknown";
        this.quantity = 0;
        this.price = 0;
    }

    ProductInfo(String productName, int quantity, int price)
    {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    void printDetails()
    {
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total Amount: " + (quantity * price));
    }
}

public class productObjectProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String productName;
        int quantity;
        int price;

        System.out.println("Enter product name:");
        productName = sc.nextLine();
        System.out.println("Enter quantity:");
        quantity = sc.nextInt();
        System.out.println("Enter price per item:");
        price = sc.nextInt();

        ProductInfo p1 = new ProductInfo();
        ProductInfo p2 = new ProductInfo(productName, quantity, price);

        System.out.println("Default Constructor:");
        p1.printDetails();
        System.out.println("Parameterized Constructor:");
        p2.printDetails();
    }
}
