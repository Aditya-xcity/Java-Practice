/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayListUniqueProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.println("Enter number of elements:");
        n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> uniqueNumbers = new ArrayList<Integer>();

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter element " + (i + 1) + ":");
            int value = sc.nextInt();
            numbers.add(value);
            sum = sum + value;

            if(!uniqueNumbers.contains(value))
            {
                uniqueNumbers.add(value);
            }
        }

        Collections.sort(numbers);
        Collections.sort(uniqueNumbers);

        System.out.println("Sorted elements:");
        for(int i = 0; i < numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        }

        if(numbers.size() > 0)
        {
            System.out.println("Sum of elements: " + sum);
            System.out.println("Unique sorted elements:");
            for(int i = 0; i < uniqueNumbers.size(); i++)
            {
                System.out.println(uniqueNumbers.get(i));
            }
            System.out.println("Total unique elements: " + uniqueNumbers.size());
        }
        else
        {
            System.out.println("No elements to process");
        }
    }
}
