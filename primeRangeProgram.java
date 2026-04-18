/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

import java.util.Scanner;

public class primeRangeProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;

        System.out.println("Enter the last number:");
        n = sc.nextInt();

        if(n < 2)
        {
            System.out.println("No prime numbers in range");
        }
        else
        {
            System.out.println("Prime numbers from 1 to " + n + ":");
            for(int i = 2; i <= n; i++)
            {
                int isPrime = 1;
                for(int j = 2; j <= i / 2; j++)
                {
                    if(i % j == 0)
                    {
                        isPrime = 0;
                        break;
                    }
                }

                if(isPrime == 1)
                {
                    System.out.println(i);
                    count++;
                }
            }

            System.out.println("Total prime numbers: " + count);
        }
    }
}
