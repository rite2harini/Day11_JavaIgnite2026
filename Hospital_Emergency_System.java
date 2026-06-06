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
public class priority_to_patients 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        int age , emergency_level;
        System.out.print("Enter Patient Name : ");
        name = sc.nextLine();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        System.out.print("Enter Emergency level : ");
        emergency_level = sc.nextInt();
        try
        {
            if(age < 0 || age > 120)
            {
                throw new InvalidAgeException("Invalid Age !!!! ");
            }
            if(emergency_level < 1 || emergency_level >5)
            {
                throw new InvalidPriorityException("Invalid Emergency Level !!!!");

            }
            else
            {
                System.out.println("Priority Level Assigned");
            }
        }
        catch(InvalidAgeException e)
        {
            System.out.println("Invalid Age !!!!");
        }
        catch(InvalidPriorityException e)
        {
            System.out.println("Invalid Emergency Level !!!!");
        }
        



    }
    
}
