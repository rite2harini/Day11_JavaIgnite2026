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
package java_internship_day11;
import java.util.Scanner;

class InvalidAgeException extends Exception {
	InvalidAgeException(){
		super("Invalid age input");
	}
}
class InvalidPriorityException extends Exception {
	InvalidPriorityException(){
		super("Invalid priorty input");
	}
}
public class Hospital_Emergency_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int age,e_level;
		try {
			System.out.println("Enter name :");
			name = sc.nextLine();
			System.out.println("Enter age :");
			age = sc.nextInt();
			if(age < 0 || age > 120)
				throw new InvalidAgeException();
			System.out.println("Enter emergency level :");
			e_level = sc.nextInt();
			
			if(e_level > 5 || e_level < 0)
				throw new InvalidPriorityException();
			System.out.println("Name : "+name);
			System.out.println("Age : "+age);
			System.out.println("Emergency level : "+e_level);
		}
		catch(InvalidPriorityException e){
			System.out.println(e.getMessage());
		}
		catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
