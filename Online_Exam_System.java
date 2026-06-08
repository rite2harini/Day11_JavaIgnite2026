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
class InvalidMarksException extends Exception 
{
	private static final long serialVersionUID = 1L;
	public InvalidMarksException(String message)
    {
        super(message);
    }
}
class NegativeMarksException extends Exception
{
	private static final long serialVersionUID = 1L;
	public NegativeMarksException(String message)
    {
        super(message);
    }
}
public class OnlineExamSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter Student ID: ");
			String studentID = sc.nextLine();
			try {
				if (studentID.isEmpty()) {
					studentID = null;
				}
				System.out.print("Enter marks out of 100: ");
				double marks = sc.nextDouble();
				if (marks < 0) {
					throw new NegativeMarksException("Negative marks not allowed!");
				}
				if (marks > 100) {
					 throw new InvalidMarksException( "Marks can't exceed 100");
				}
				double percent = marks;
				 System.out.println("Student ID: " + studentID);
	             System.out.println("Percentage: " + percent + "%");
			}
			catch (NegativeMarksException e) {
				System.out.println(e.getMessage());
			}
			catch (InvalidMarksException e) {
				System.out.println(e.getMessage());
			}
			catch (NullPointerException e) {
					System.out.println("Student ID can't be empty!");
			}
		}
		catch (Exception e){
			System.out.println("Invalid Input!");
		}
		sc.close();
	}

}
