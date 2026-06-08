/*
Create a system that assigns priority to patients.

Inputs:
Patient name
Age
Emergency level (1–5)
Rules:
Age < 0 or > 120 → InvalidAgeException
Emergency level not between 1–5 → InvalidPriorityException
Output:
Priority Level assigned OR Exception message
*/
import java.util.Scanner;
class InvalidAgeException extends Exception
{	
	private static final long serialVersionUID = 1L;
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}
class InvalidPriorityException extends Exception
{	
	private static final long serialVersionUID = 1L;
	public InvalidPriorityException(String msg)
	{
		super(msg);
	}
}
public class HospitalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter patient's name: ");
			String name = sc.nextLine();
			System.out.print("Enter patient's age: ");
			int age = sc.nextInt();
			System.out.print("Enter Emergency Level (1-5): ");
			int eLevel = sc.nextInt();
			if(age<0 || age>120)
			{
				throw new InvalidAgeException("Invalid Age!\nTry again!");
			}
			if (eLevel<1 || eLevel>5) {
				throw new InvalidPriorityException("Invalid Priority!");
			}
			System.out.println("Priority Level Assigned.");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
