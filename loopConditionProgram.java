/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

import java.util.Scanner;

public class loopConditionProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int evenCount = 0;
        int oddCount = 0;
        int sumEven = 0;
        int sumOdd = 0;

        System.out.println("Enter the last number:");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                evenCount++;
                sumEven = sumEven + i;
            }
            else
            {
                oddCount++;
                sumOdd = sumOdd + i;
            }
        }

        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Total odd numbers: " + oddCount);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}