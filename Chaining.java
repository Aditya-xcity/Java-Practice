// Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. Implement a default constructor and a parameterized constructor that takes all three instance variables. Use constructor chaining to initialize the variables. Print the values of the variables.

public class Chaining {
    static class Student {
        int studentId;
        String studentName;
        String grade;
        
        // Default constructor
        Student() {
            this(0, "Unknown", "N/A");
        }
        
        // Parameterized constructor
        Student(int studentId, String studentName, String grade) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.grade = grade;
        }
        
        // Method to print student details
        void printDetails() {
            System.out.println("Student ID: " + studentId);
            System.out.println("Student Name: " + studentName);
            System.out.println("Grade: " + grade);
        }
    }
    
    public static void main(String[] args) {
        // Using default constructor (constructor chaining)
        Student student1 = new Student();
        System.out.println("Student 1 (Default Constructor):");
        student1.printDetails();
        
        System.out.println();
        
        // Using parameterized constructor
        Student student2 = new Student(101, "John Doe", "A");
        System.out.println("Student 2 (Parameterized Constructor):");
        student2.printDetails();
    }
}


