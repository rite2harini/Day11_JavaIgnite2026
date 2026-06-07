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
package day11_progs;
import java.util.Scanner;

class InvalidMarksException extends Exception{
    public InvalidMarksException(String msg){
        super(msg);
    }
}

class NegativeMarksException extends Exception{
    public NegativeMarksException(String msg){
        super(msg);
    }
}

public class Online_Exam_System {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student ID : ");
            String id = sc.nextLine();

            if(id == null || id.trim().isEmpty()) { // if null directly or after triming is empty
                throw new NullPointerException("Student ID is NULL !!");
            }

            try {
                System.out.print("Enter Marks : ");
                int marks = sc.nextInt();

                if(marks < 0) {
                    throw new NegativeMarksException("Negative marks not allowed !!");
                }

                if(marks > 100) {
                    throw new InvalidMarksException("Marks cannot exceed 100 !!");
                }

                double percentage = marks;

                System.out.println("Student ID : " + id);
                System.out.println("Percentage : " + percentage + "%");

            }
            catch(InvalidMarksException e) {
                System.out.println(e.getMessage());
            }
            catch(NegativeMarksException e) {
                System.out.println(e.getMessage());
            }

        }
        catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
