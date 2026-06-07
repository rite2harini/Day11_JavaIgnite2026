/*
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
import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

class NegativeMarksException extends Exception {
    public NegativeMarksException(String message) {
        super(message);
    }
}

public class StudentScoreSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String studentId = scanner.nextLine();
            
            if (studentId.equals("null")) {
                studentId = null;
            }
            
            int lengthCheck = studentId.length();

            try {
                double marks = Double.parseDouble(scanner.nextLine());

                if (marks < 0) {
                    throw new NegativeMarksException("NegativeMarksException");
                }
                if (marks > 100) {
                    throw new InvalidMarksException("InvalidMarksException");
                }

                double percentage = (marks / 100.0) * 100;
                System.out.println("Percentage: " + percentage + "%");

            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            } catch (NegativeMarksException e) {
                System.out.println(e.getMessage());
            } catch (InvalidMarksException e) {
                System.out.println(e.getMessage());
            }

        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
