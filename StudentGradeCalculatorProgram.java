import java.util.Scanner;

public class StudentGradeCalculatorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks in 5 subjects: ");
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            int marks = scanner.nextInt();
            total += marks;
        }

        double average = total / 5.0;
        char grade = calculateGrade(average);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    static char calculateGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else if (average >= 40) {
            return 'D';
        }
        return 'F';
    }
}
