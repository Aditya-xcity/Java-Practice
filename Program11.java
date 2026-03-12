// Question: Demonstrate method overloading using arrayFunc()
// Name - ADITYA BHARDWAJ
// Section - D2
// Roll No - 07
// Course – B TECH
// Branch – CSE

import java.util.Arrays;

class Program11
{
    void arrayFunc(int[] arr, int target)
    {
        System.out.println("Pairs of elements whose sum is " + target + " are:");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] + arr[j] == target)
                {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Program11 obj = new Program11();

        int[] arr = {2, 4, 6, 8, 3, 5, 7};
        int target = 10;

        obj.arrayFunc(arr, target);
    }
}