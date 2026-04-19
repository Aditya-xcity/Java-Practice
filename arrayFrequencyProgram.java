/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

import java.util.Scanner;

public class arrayFrequencyProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter number of elements:");
        n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        System.out.println("Element frequencies:");
        for(int i = 0; i < n; i++)
        {
            int isDuplicate = 0;

            for(int j = 0; j < i; j++)
            {
                if(arr[i] == arr[j])
                {
                    isDuplicate = 1;
                    break;
                }
            }

            if(isDuplicate == 0)
            {
                int count = 0;

                for(int j = 0; j < n; j++)
                {
                    if(arr[i] == arr[j])
                    {
                        count++;
                    }
                }

                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }
}