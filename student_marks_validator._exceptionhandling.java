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
package java_internship_day11;
import java.util.Scanner;

class InvalidMarksException extends Exception
{
    InvalidMarksException()
    {
        super("Marks must be between 0 and 100");
    }
}
public class Student_marks_validator {
	void checkmarks(int marks) throws InvalidMarksException {
        if(marks < 0 || marks > 100) {
            throw new InvalidMarksException();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks;
		try {
			System.out.println("Enter the marks ");
			marks = sc.nextInt();
			Student_marks_validator obj = new Student_marks_validator();
			obj.checkmarks(marks);
			System.out.println("Correct mark !");
		}
		catch(InvalidMarksException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}

