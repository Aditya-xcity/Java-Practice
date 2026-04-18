/*
Name - ADITYA BHARDWAJ
Section - D2
Roll No - 07
Course – B TECH
Branch – CSE
*/

import java.util.Scanner;

class EmployeeInfo
{
    String name;
    int id;
    int salary;

    EmployeeInfo()
    {
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0;
    }

    EmployeeInfo(String name, int id, int salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void printDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class employeeConstructorProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        int id;
        int salary;

        System.out.println("Enter employee name:");
        name = sc.nextLine();
        System.out.println("Enter employee id:");
        id = sc.nextInt();
        System.out.println("Enter employee salary:");
        salary = sc.nextInt();

        EmployeeInfo e1 = new EmployeeInfo();
        EmployeeInfo e2 = new EmployeeInfo(name, id, salary);

        System.out.println("Default Constructor:");
        e1.printDetails();
        System.out.println("Parameterized Constructor:");
        e2.printDetails();
    }
}
