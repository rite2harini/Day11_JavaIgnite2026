import java.util.Scanner;

// Custom Exception for Invalid Marks
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

// Custom Exception for Negative Marks
class NegativeMarksException extends Exception {
    public NegativeMarksException(String message) {
        super(message);
    }
}

public class StudentResultSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student ID: ");
            String studentId = sc.nextLine();

            // Nested try-catch block
            try {

                // NullPointerException Handling
                if (studentId == null || studentId.trim().isEmpty()) {
                    throw new NullPointerException("Student ID is null or empty.");
                }

                System.out.print("Enter Marks (0-100): ");
                int marks = sc.nextInt();

                // Negative Marks Check
                if (marks < 0) {
                    throw new NegativeMarksException(
                            "Negative marks are not allowed.");
                }

                // Invalid Marks Check
                if (marks > 100) {
                    throw new InvalidMarksException(
                            "Marks cannot exceed 100.");
                }

                // Calculate Percentage
                double percentage = marks;

                System.out.println("Student ID: " + studentId);
                System.out.println("Percentage: " + percentage + "%");

            } catch (NullPointerException e) {
                System.out.println("NullPointerException: " + e.getMessage());

            } catch (NegativeMarksException e) {
                System.out.println("NegativeMarksException: " + e.getMessage());

            } catch (InvalidMarksException e) {
                System.out.println("InvalidMarksException: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}/*
Create a program that:

Takes student answers score
Calculates percentage
Rules:
Marks cannot exceed 100 → InvalidMarksException
Negative marks not allowed → NegativeMarksException
If student ID is null → NullPointerException handling
Twist:
Use nested try-catch blocks
*/
