/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

import java.util.Scanner;

public class numberPatternProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.println("Enter a positive number:");
        n = sc.nextInt();

        if(n <= 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Even numbers from 1 to " + n + ":");
            for(int i = 1; i <= n; i++)
            {
                if(i % 2 == 0)
                {
                    System.out.println(i);
                    sum = sum + i;
                }
            }

            System.out.println("Sum of even numbers: " + sum);
        }
    }
}
