/*
Create a program that:

Takes marks of a student
Rules:
If marks < 0 OR marks > 100 → throw custom exception InvalidMarksException
Requirements:
Use throw inside method
Use throws in method signature
Output:
Valid Marks OR InvalidMarksException handled
*/
import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class MarksValidator {
    public static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("InvalidMarksException handled");
        }
        System.out.println("Valid Marks");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int marks = Integer.parseInt(scanner.nextLine());
            checkMarks(marks);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
