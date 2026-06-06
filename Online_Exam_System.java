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

// Custom Exception for Marks > 100
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

public class Online_Exam_System {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student ID: ");
            String studentId = sc.nextLine();

            try {
                if (studentId.isEmpty()) {
                    studentId = null;
                }

                System.out.print("Enter Marks (out of 100): ");
                double marks = sc.nextDouble();

                if (marks < 0) {
                    throw new NegativeMarksException("Negative marks are not allowed");
                }

                if (marks > 100) {
                    throw new InvalidMarksException( "Marks cannot exceed 100");
                }

                double percentage = marks; 

                System.out.println("Student ID: " + studentId);
                System.out.println("Percentage: " + percentage + "%");
            }
            catch (NegativeMarksException e) {
                System.out.println(e.getMessage());
            }
            catch (InvalidMarksException e) {
                System.out.println(e.getMessage());
            }
            catch (NullPointerException e) {
                System.out.println("Student ID cannot be empty");
            }

        }
        catch (Exception e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
