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

public class arrayListFrequencyProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int search;
        int count = 0;

        System.out.println("Enter number of elements:");
        n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter element " + (i + 1) + ":");
            int value = sc.nextInt();
            numbers.add(value);
        }

        System.out.println("Enter number to search:");
        search = sc.nextInt();

        for(int i = 0; i < numbers.size(); i++)
        {
            if(numbers.get(i) == search)
            {
                count++;
            }
        }

        Collections.sort(numbers);

        System.out.println("Sorted elements:");
        for(int i = 0; i < numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        }

        System.out.println("Frequency of " + search + ": " + count);
    }
}