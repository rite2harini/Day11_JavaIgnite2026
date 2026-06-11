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
	public class Login_Authentication_System {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			String username = null;
			String password;

			try 
			{
				System.out.println("Enter Username:");
				username = sc.nextLine();
				if(username.equals(null))
				if(username.isEmpty())
				{
					throw new InvalidUsernameException("invalid username!");
				}
				System.out.println("Username set!");

				System.out.println("Enter Password:");
				password = sc.nextLine();
				if(password.length()<6)
				{
					throw new WeakPasswordException("Password must contain 6 letters");
				}
				System.out.println("Password set!");
			}
			
			catch(Exception e)
			{
				System.out.println(e.getMessage());

			}
			sc.close();
		}

	}
	
