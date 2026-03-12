// Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.


class Shape
{
    int getArea(int x,int y)
    {
return x*y;
    }
}


class Rectangle extends Shape


{
    @Override
    int getArea(int x,int y)
    {
    
        return x*y;
    }
}

class ShapesSol{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        int p = r.getArea(4,4);
        System.out.println(p);
        
    }
}