//  Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().


class Employee{
   void work()
    {
        System.out.println("i work here");
    }

    void getSalary()
    {
        System.out.println("yay i got payment!");
    }
}



class HRManager extends Employee
{
    @Override
     void work()
    {
        System.out.println("i work here in HRManager");
    }

    void addEmployee()
    {
        System.out.println("new employee added");
    }
}


class WorkSoln
{
    public static void main(String[] args)
    {
        HRManager h = new HRManager();
        h.work();
        h.addEmployee();
    }
}


