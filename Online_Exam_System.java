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
    InvalidMarksException(String msg) {
        super(msg);
    }
}

class NegativeMarksException extends Exception {
    NegativeMarksException(String msg) {
        super(msg);
    }
}

public class Online_Exam_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student ID: ");
            String studentId = sc.nextLine();

            try {
                if (studentId == null || studentId.isEmpty()) {
                    throw new NullPointerException("Student ID is null");
                }

                System.out.print("Enter Marks: ");
                double marks = sc.nextDouble();

                if (marks < 0) {
                    throw new NegativeMarksException("Negative marks not allowed");
                }

                if (marks > 100) {
                    throw new InvalidMarksException("Marks cannot exceed 100");
                }

                double percentage = marks;

                System.out.println("Student ID: " + studentId);
                System.out.println("Percentage: " + percentage + "%");

            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            } catch (NegativeMarksException e) {
                System.out.println(e.getMessage());
            } catch (InvalidMarksException e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}