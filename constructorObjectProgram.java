/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

import java.util.Scanner;

class StudentInfo
{
    String name;
    int roll;
    int marks;

    StudentInfo()
    {
        this.name = "Unknown";
        this.roll = 0;
        this.marks = 0;
    }

    StudentInfo(String name, int roll, int marks)
    {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void printDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + marks);
    }
}

public class constructorObjectProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        int roll;
        int marks;

        System.out.println("Enter student name:");
        name = sc.nextLine();
        System.out.println("Enter roll number:");
        roll = sc.nextInt();
        System.out.println("Enter marks:");
        marks = sc.nextInt();

        StudentInfo s1 = new StudentInfo();
        StudentInfo s2 = new StudentInfo(name, roll, marks);

        System.out.println("Default Constructor:");
        s1.printDetails();
        System.out.println("Parameterized Constructor:");
        s2.printDetails();
    }
}