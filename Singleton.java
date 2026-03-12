// Write a Java program to create a class called Singleton that ensures only one instance of the class can be created. Implement a private constructor and a public static method to get the single instance of the class. Print a message indicating the creation of the instance.

public class Singleton {
    // Static instance of the Singleton class
    private static Singleton instance;
    
    // Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created.");
    }
    
    // Public static method to get the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    // Method to display a message
    void displayMessage() {
        System.out.println("This is the Singleton instance.");
    }
    
    public static void main(String[] args) {
        System.out.println("Creating first instance:");
        Singleton singleton1 = Singleton.getInstance();
        singleton1.displayMessage();
        
        System.out.println();
        
        System.out.println("Creating second instance:");
        Singleton singleton2 = Singleton.getInstance();
        singleton2.displayMessage();
        
        System.out.println();
        
        // Check if both references point to the same instance
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
        
        System.out.println();
        
        System.out.println("Creating third instance:");
        Singleton singleton3 = Singleton.getInstance();
        singleton3.displayMessage();
        
        System.out.println();
        
        System.out.println("Verifying singleton pattern:");
        System.out.println("singleton1 == singleton2: " + (singleton1 == singleton2));
        System.out.println("singleton2 == singleton3: " + (singleton2 == singleton3));
        System.out.println("singleton1 == singleton3: " + (singleton1 == singleton3));
    }
}
