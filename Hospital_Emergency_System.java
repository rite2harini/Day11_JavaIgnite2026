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
package day11_progs;
import java.util.Scanner;
import java.util.InputMismatchException;

class InvalidageException extends Exception{
	public InvalidageException(String msg) {
	super(msg);
	}
}

class InvalidPriorityException extends Exception{
	public InvalidPriorityException(String msg) {
	super(msg);
	}
}

public class Hospital_Emergency_System {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Enter patient Name : ");
		String name =sc.nextLine();
		System.out.print("Enter Age : ");
		int age =sc.nextInt();
		
		if(age<0) {
			throw new InvalidageException("Age can't be -ve");
		}
		else if(age>120) {
			throw new InvalidageException("Age can't be >120");
		}
		System.out.print("Enter Emergency Level(1~5) → ");
		int level = sc.nextInt();
		if(level<=0 || level>5)
			throw new InvalidPriorityException("Invalid Priority level");
		
		System.out.print("Priority Level Assigned \n");
		
		}
		catch (InvalidPriorityException e) {
		    System.out.println("Error: " + e.getMessage());
		}
		catch (InvalidageException e) {
		    System.out.println("Error: " + e.getMessage());
		}
		catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
		sc.close();
	}
}
