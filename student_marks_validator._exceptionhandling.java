import java.util.Scanner;

class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class student_marks_validator_exceptionhandling {

    static void validateMarks(int marks) {
        try {
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("InvalidMarksException handled");
            }

            System.out.println("Valid Marks");

        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        validateMarks(marks);

        sc.close();
    }
}
