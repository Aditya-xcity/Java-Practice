/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

import java.util.Scanner;

public class rangeDivisibleProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int start;
        int end;
        int count = 0;
        int sum = 0;

        System.out.println("Enter the starting number:");
        start = sc.nextInt();
        System.out.println("Enter the ending number:");
        end = sc.nextInt();

        if(start > end)
        {
            System.out.println("Invalid range");
        }
        else
        {
            System.out.println("Numbers divisible by 3 and 5 from " + start + " to " + end + ":");
            for(int i = start; i <= end; i++)
            {
                if(i % 3 == 0 && i % 5 == 0)
                {
                    System.out.println(i);
                    count++;
                    sum = sum + i;
                }
            }

            System.out.println("Total numbers: " + count);
            System.out.println("Sum of numbers: " + sum);
        }
    }
}