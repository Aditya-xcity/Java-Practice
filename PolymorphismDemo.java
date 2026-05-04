// Practice program: method overloading and overriding

class CalculatorDemo
{
    int add(int first, int second)
    {
        return first + second;
    }

    int add(int first, int second, int third)
    {
        return first + second + third;
    }
}

class ShapePrinterDemo
{
    void draw()
    {
        System.out.println("Drawing a generic shape");
    }
}

class CirclePrinterDemo extends ShapePrinterDemo
{
    @Override
    void draw()
    {
        System.out.println("Drawing a circle");
    }
}

public class PolymorphismDemo
{
    public static void main(String[] args)
    {
        CalculatorDemo calculator = new CalculatorDemo();
        System.out.println("Sum of two numbers: " + calculator.add(10, 20));
        System.out.println("Sum of three numbers: " + calculator.add(10, 20, 30));

        ShapePrinterDemo shape = new CirclePrinterDemo();
        shape.draw();
    }
}