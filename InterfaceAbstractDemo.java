// Practice program: interface and abstract class examples

interface Movable
{
    void move();
}

abstract class Vehicle
{
    abstract void start();

    void stop()
    {
        System.out.println("Vehicle stopped");
    }
}

public class InterfaceAbstractDemo extends Vehicle implements Movable
{
    @Override
    void start()
    {
        System.out.println("Vehicle starting");
    }

    @Override
    public void move()
    {
        System.out.println("Vehicle is moving");
    }

    public static void main(String[] args)
    {
        InterfaceAbstractDemo demo = new InterfaceAbstractDemo();
        demo.start();
        demo.move();
        demo.stop();
    }
}
