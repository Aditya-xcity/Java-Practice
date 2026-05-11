import java.util.Scanner;

public class StringReversalProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    static String reverseString(String text) {
        StringBuilder builder = new StringBuilder(text);
        return builder.reverse().toString();
    }
}
