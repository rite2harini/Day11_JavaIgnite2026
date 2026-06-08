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

public class StudentResult {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter Student ID: ");
	            String studentId = sc.nextLine();
	            try {
	                System.out.print("Enter Marks (out of 100): ");
	                int marks = sc.nextInt();

	                if (marks < 0) {
	                    throw new NegativeMarksException(
	                            "Negative marks are not allowed!");
	                }

	                if (marks > 100) {
	                    throw new InvalidMarksException(
	                            "Marks cannot exceed 100!");
	                }

	                if (studentId == null || studentId.trim().isEmpty()) {
	                    throw new NullPointerException(
	                            "Student ID cannot be null or empty!");
	                }

	                double percentage = marks;

	                System.out.println("\nStudent ID: " + studentId);
	                System.out.println("Percentage: " + percentage + "%");

	            } catch (NegativeMarksException e) {
	                System.out.println("Exception: " + e.getMessage());
	            } catch (InvalidMarksException e) {
	                System.out.println("Exception: " + e.getMessage());
	            }

	        } catch (NullPointerException e) {
	            System.out.println("NullPointerException: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Invalid Input!");
	        }

	        sc.close();
	    }

}
