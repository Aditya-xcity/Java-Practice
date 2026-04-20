/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

import java.util.Scanner;

public class fibonacciSeriesProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int first = 0;
        int second = 1;
        int next = 0;
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter number of terms:");
        n = sc.nextInt();

        if(n <= 0)
        {
            System.out.println("Invalid number of terms");
        }
        else
        {
            System.out.println("Fibonacci series:");

            for(int i = 1; i <= n; i++)
            {
                if(i == 1)
                {
                    next = first;
                }
                else if(i == 2)
                {
                    next = second;
                }
                else
                {
                    next = first + second;
                    first = second;
                    second = next;
                }

                System.out.println(next);

                if(next % 2 == 0)
                {
                    evenCount++;
                }
                else
                {
                    oddCount++;
                }
            }

            System.out.println("Total even terms: " + evenCount);
            System.out.println("Total odd terms: " + oddCount);
        }
    }
}