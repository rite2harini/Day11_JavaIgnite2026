/*
Create a login system:

Input username and password
Rules:
Username cannot be empty → throw InvalidUsernameException
Password must be at least 6 characters → throw WeakPasswordException
*/
import java.util.Scanner;
class InvalidUsernameException extends Exception
{
    public InvalidUsernameException(String msg)
    {
        super(msg);
    }
}
class WeakPasswordException extends Exception
{
    public WeakPasswordException(String msg)
    {
        super(msg);
    }
}
public class login_system 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String password,username;
        try
        {
            System.out.print("Enter Username :");
            username = sc.nextLine();
            if(username=="")
            {
                throw new InvalidUsernameException("Username cannot be empty!!!\nTry again");
                
            
            }
              
                    
            System.out.print("Enter Password : ");
            password = sc.nextLine();
            if(password.length() < 6)
            {
                throw new WeakPasswordException("Password must be at least 6 characters\nTry again");
                 
            }
            System.out.println("Login Sucessful");
            
        }
        catch(InvalidUsernameException e)
        {
            System.out.println("Username cannot be empty!!!");
        }
        catch(WeakPasswordException e)
        {
            System.out.println("Password must be at least 6 characters ");
        }
    }
}
