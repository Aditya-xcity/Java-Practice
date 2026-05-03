// Practice program: basic array operations

class ArrayPracticeProgram
{
    void printEvenNumbers(int[] numbers)
    {
        System.out.println("Even numbers in the array:");
        for (int number : numbers)
        {
            if (number % 2 == 0)
            {
                System.out.println(number);
            }
        }
    }

    void findMaximum(int[] numbers)
    {
        int maximum = numbers[0];
        for (int number : numbers)
        {
            if (number > maximum)
            {
                maximum = number;
            }
        }
        System.out.println("Maximum value: " + maximum);
    }

    public static void main(String[] args)
    {
        ArrayPracticeProgram program = new ArrayPracticeProgram();
        int[] numbers = {12, 5, 8, 19, 3, 14, 7};

        program.printEvenNumbers(numbers);
        program.findMaximum(numbers);
    }
}