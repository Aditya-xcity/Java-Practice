// Write a Java program to create a class called Classroom with instance variables className and students (an array of strings). Implement a parameterized constructor that initializes these variables. Print the values of the variables.

public class Classroom {
    String className;
    String[] students;
    
    // Parameterized constructor
    Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }
    
    // Method to print classroom details
    void printDetails() {
        System.out.println("Class Name: " + className);
        System.out.println("Number of Students: " + students.length);
        System.out.println("Students:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("  " + (i + 1) + ". " + students[i]);
        }
    }
    
    // Method to add a student
    void addStudent(String studentName) {
        String[] newStudents = new String[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[students.length] = studentName;
        students = newStudents;
        System.out.println("Student '" + studentName + "' added to the classroom.");
    }
    
    // Method to get total students
    int getTotalStudents() {
        return students.length;
    }
    
    public static void main(String[] args) {
        // Creating classroom with initial students
        String[] studentsA = {"Alice", "Bob", "Charlie", "David"};
        System.out.println("Classroom 1:");
        Classroom classroom1 = new Classroom("Class 10A", studentsA);
        classroom1.printDetails();
        
        System.out.println();
        
        // Creating another classroom
        String[] studentsB = {"Eve", "Frank", "Grace"};
        System.out.println("Classroom 2:");
        Classroom classroom2 = new Classroom("Class 10B", studentsB);
        classroom2.printDetails();
        
        System.out.println();
        
        // Adding a student to classroom1
        System.out.println("Adding student to Classroom 1:");
        classroom1.addStudent("Emma");
        System.out.println("Total Students in Classroom 1: " + classroom1.getTotalStudents());
        
        System.out.println();
        
        // Final details of classroom1
        System.out.println("Classroom 1 (Updated):");
        classroom1.printDetails();
    }
}
