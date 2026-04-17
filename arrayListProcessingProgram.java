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

public class arrayListProcessingProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.println("Enter number of elements:");
        n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter element " + (i + 1) + ":");
            int value = sc.nextInt();
            numbers.add(value);
            sum = sum + value;
        }

        Collections.sort(numbers);

        System.out.println("Sorted elements:");
        for(int i = 0; i < numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        }

        if(numbers.size() > 0)
        {
            System.out.println("Sum of elements: " + sum);
            System.out.println("Smallest element: " + numbers.get(0));
            System.out.println("Largest element: " + numbers.get(numbers.size() - 1));
        }
        else
        {
            System.out.println("No elements to process");
        }
    }
}
