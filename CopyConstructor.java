// Write a Java program to create a class called Rectangle with instance variables length and width. Implement a parameterized constructor and a copy constructor that initializes a new object using the values of an existing object. Print the values of the variables.

public class CopyConstructor {
    static class Rectangle {
        double length;
        double width;
        
        // Parameterized constructor
        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        
        // Copy constructor
        Rectangle(Rectangle rect) {
            this.length = rect.length;
            this.width = rect.width;
        }
        
        // Method to print rectangle details
        void printDetails() {
            System.out.println("Length: " + length);
            System.out.println("Width: " + width);
        }
        
        // Method to calculate area
        double calculateArea() {
            return length * width;
        }
    }
    
    public static void main(String[] args) {
        // Using parameterized constructor
        Rectangle rect1 = new Rectangle(10.5, 5.0);
        System.out.println("Rectangle 1 (Parameterized Constructor):");
        rect1.printDetails();
        System.out.println("Area: " + rect1.calculateArea());
        
        System.out.println();
        
        // Using copy constructor
        Rectangle rect2 = new Rectangle(rect1);
        System.out.println("Rectangle 2 (Copy Constructor):");
        rect2.printDetails();
        System.out.println("Area: " + rect2.calculateArea());
        
        System.out.println();
        
        // Modifying rect2 to show it's an independent object
        rect2.length = 20.0;
        rect2.width = 8.0;
        System.out.println("Rectangle 2 (After Modification):");
        rect2.printDetails();
        System.out.println("Area: " + rect2.calculateArea());
        
        System.out.println();
        
        System.out.println("Rectangle 1 (Unchanged):");
        rect1.printDetails();
        System.out.println("Area: " + rect1.calculateArea());
    }
}
