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
package java_internship_day11;
import java.util.Scanner;
class InvalidMarksException extends Exception {
	InvalidMarksException() {
		super("Invalid marks. Marks should be less or equal to 100");
	}
}
class NegativeMarksException extends Exception {
	NegativeMarksException() {
		super("Invalid marks. Marks cant be negative");
	}
}
public class Online_Exam_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] marks;
		int n,i;
		System.out.println("Enter the number of subjects :");
		n=sc.nextInt();
		marks=new int [n];
		int sum =0;
		try {
			System.out.println("Enter the marks :");
			for(i=0;i<n;i++) {
				marks[i] = sc.nextInt();
				if(marks[i] > 100)
					throw new InvalidMarksException();
				else if(marks[i] < 0)
					throw new NegativeMarksException();
				sum=sum+marks[i];
			}
			System.out.println("DETAILS OF MARKS");
			for(i=0;i<n;i++)	
				System.out.println(marks[i]);
			System.out.println("Percentage : "+((sum)/n));
		}
		catch(NegativeMarksException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidMarksException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}

}
