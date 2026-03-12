// Write a Java program to create a class called Car with instance variables make, model, and year. Implement a parameterized constructor that initializes these variables and assigns default values if not provided. Print the values of the variables.

public class Car {
    String make;
    String model;
    int year;
    
    // Parameterized constructor with default values
    Car() {
        this("Unknown", "Unknown", 2020);
    }
    
    Car(String make, String model, int year) {
        this.make = (make != null && !make.isEmpty()) ? make : "Unknown";
        this.model = (model != null && !model.isEmpty()) ? model : "Unknown";
        this.year = (year > 0) ? year : 2020;
    }
    
    // Overloaded constructor for make and model only
    Car(String make, String model) {
        this(make, model, 2020);
    }
    
    // Method to print car details
    void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    
    public static void main(String[] args) {
        // Using default constructor
        System.out.println("Car 1 (Default Constructor):");
        Car car1 = new Car();
        car1.printDetails();
        
        System.out.println();
        
        // Using parameterized constructor with all values
        System.out.println("Car 2 (All Parameters Provided):");
        Car car2 = new Car("Toyota", "Camry", 2023);
        car2.printDetails();
        
        System.out.println();
        
        // Using parameterized constructor with make and model
        System.out.println("Car 3 (Make and Model Only):");
        Car car3 = new Car("Honda", "Civic");
        car3.printDetails();
        
        System.out.println();
        
        // Using parameterized constructor with invalid year (uses default)
        System.out.println("Car 4 (Invalid Year - Uses Default):");
        Car car4 = new Car("Ford", "Mustang", -2022);
        car4.printDetails();
    }
}
