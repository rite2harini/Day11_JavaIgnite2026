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
import java.util.Scanner;

class InvalidMarksException extends Exception 
{
    public InvalidMarksException(String msg)
    {
        super(msg);
    }
}
public class student_marks_validator_exceptionhandling 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int mark;
        try
        {
            System.out.print("Enter mark : ");
            mark = sc.nextInt();
            if(mark < 0 || mark >100)
            {
                throw new InvalidMarksException("Invalid Mark !!!");
            }
            else
            {
                System.out.println("Valid mark  ");
            }
        }
        catch(InvalidMarksException e)
        {
            System.out.println("Invalid Mark !!!");
        }
    }
}
