// Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:
// One constructor takes int parameters.
// Another constructor takes double parameters.
// Print the values of the variables for each constructor.

public class Point {
    double x;
    double y;
    
    // Constructor with int parameters
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Constructor with double parameters
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Method to print point details
    void printDetails() {
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
    
    // Method to calculate distance from origin
    double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
    
    public static void main(String[] args) {
        // Using int constructor
        System.out.println("Point 1 (Int Constructor):");
        Point point1 = new Point(3, 4);
        point1.printDetails();
        System.out.println("Distance from origin: " + point1.distanceFromOrigin());
        
        System.out.println();
        
        // Using double constructor
        System.out.println("Point 2 (Double Constructor):");
        Point point2 = new Point(3.5, 4.5);
        point2.printDetails();
        System.out.println("Distance from origin: " + point2.distanceFromOrigin());
        
        System.out.println();
        
        // Using int constructor with different values
        System.out.println("Point 3 (Int Constructor):");
        Point point3 = new Point(5, 12);
        point3.printDetails();
        System.out.println("Distance from origin: " + point3.distanceFromOrigin());
        
        System.out.println();
        
        // Using double constructor with negative values
        System.out.println("Point 4 (Double Constructor - Negative Values):");
        Point point4 = new Point(-2.5, -3.5);
        point4.printDetails();
        System.out.println("Distance from origin: " + point4.distanceFromOrigin());
    }
}
