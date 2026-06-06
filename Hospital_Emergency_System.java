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
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}
class InvalidPriorityException extends Exception
{
	public InvalidPriorityException(String msg)
	{
		super(msg);
	}
}
public class Hospital_Emergency_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		int priority;
		String name;
		
		try {
			System.out.println("Enter the name of the patient:");
			name = sc.nextLine();
			System.out.println("Enter the age:");
			age = sc.nextInt();
			if(age<0 || age>120)
			{
				throw new InvalidAgeException("Invalid Age!\nTry again!");
			}
			System.out.println("Enter the priority level (1-5):");
			priority = sc.nextInt();
			if(priority<1 || priority>5)
			{
				throw new InvalidPriorityException("Invalid priority!\nTry again!");
			}
			
			System.out.println("Priority level assigned! Patient "+name+" has been registered!");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
