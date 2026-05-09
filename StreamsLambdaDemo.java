// Practice program: Java streams and lambdas

import java.util.*;

public class StreamsLambdaDemo
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sumEven = nums.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers: " + sumEven);

        nums.stream().map(n -> n * n).limit(5).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
