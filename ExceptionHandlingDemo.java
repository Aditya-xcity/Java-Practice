// Practice program: exception handling

public class ExceptionHandlingDemo
{
    public static void main(String[] args)
    {
        int[] values = {10, 20, 30};

        try
        {
            int result = values[0] / 0;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Cannot divide by zero: " + exception.getMessage());
        }

        try
        {
            System.out.println("Value: " + values[5]);
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Invalid array access: " + exception.getMessage());
        }
    }
}