import java.util.Scanner;
class InvalidMarksException extends Exception {
 public InvalidMarksException(String message) {
     super(message);
 }
}

public class MarksValidation {
	static void checkMarks(int marks) throws InvalidMarksException {

        // Using throw
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException(
                    "Marks should be between 0 and 100.");
        }

        System.out.println("Valid Marks: " + marks);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        try {
            checkMarks(marks);
        } catch (InvalidMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }

}
