/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

import java.util.Arrays;
import java.util.Scanner;

public class arrayProcessingProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter number of elements:");
        n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        Arrays.sort(arr);

        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Sum of elements: " + sum);
        System.out.println("Smallest element: " + arr[0]);
        System.out.println("Largest element: " + arr[n - 1]);
    }
}