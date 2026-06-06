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

import javax.lang.model.type.NullType;
class InvalidMarksException extends Exception
{
    public InvalidMarksException(String msg)
    {
        super(msg);
    }
}
class NegativeMarksException extends Exception
{
    public NegativeMarksException(String msg)
    {
        super(msg);
    }
}
class NullPointerException extends Exception
{
    public NullPointerException(String msg)
    {
        super(msg);
    }
}
public class Online_Exam_System 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        double percentage;
        double total_marks=0;
        try
        {
            System.out.print("Enter Student ID : ");
            String student_id = sc.nextLine();
        
        
        
           try
           {
                System.out.println("Enter the marks of five subject  out of 100");
                for(int i=0 ; i < 5;i++)
                {
                     System.out.print(" Subject "+(i+1)+" :");
                        marks[i] = sc.nextInt();
                        if(marks[i] < 0)
                        {
                            throw new NegativeMarksException("Negative Marks are not allowed ");
                        }
                        else if(marks[i] > 100)
                        {
                        throw new InvalidMarksException("Invalid Marks");
            
                        }
                }       
            }
             catch(NegativeMarksException e)
            {
                System.out.println(e);
            }
            catch(InvalidMarksException e)
             {
                System.out.println(e);
             }
                
                      
                
                

           
        
             if(student_id.equals(" "))
                    {
                        throw new NullPointerException("Student ID is Null");
                    }
            for(int i=0;i<5;i++)
            {
                total_marks += marks[i];
            }
             percentage = (total_marks/500)*100;
             System.out.println("Percentage = "+percentage+"%");
    }
     catch(NullPointerException e)
                {
                    System.out.println("Student Id is NULL !!!");
                } 
}}
