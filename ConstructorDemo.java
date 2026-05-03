// Practice program: default and parameterized constructors

class StudentDemo
{
    String name;
    int rollNumber;

    StudentDemo()
    {
        name = "Unknown";
        rollNumber = 0;
    }

    StudentDemo(String studentName, int studentRollNumber)
    {
        name = studentName;
        rollNumber = studentRollNumber;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class ConstructorDemo
{
    public static void main(String[] args)
    {
        StudentDemo firstStudent = new StudentDemo();
        StudentDemo secondStudent = new StudentDemo("Aditya", 7);

        System.out.println("Default Constructor:");
        firstStudent.display();

        System.out.println("Parameterized Constructor:");
        secondStudent.display();
    }
}