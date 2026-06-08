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
	private static final long serialVersionUID = 1L;
	public InvalidUsernameException(String msg)
	{
		super(msg);
	}
}
class WeakPasswordException extends Exception
{
	private static final long serialVersionUID = 1L;
	public WeakPasswordException(String msg)
	{
		super(msg);
	}
}
public class LoginSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String uName = null;
		try {
			System.out.println("Enter the username: ");
			uName = sc.nextLine();
			if (uName.isEmpty()) {
				throw new InvalidUsernameException("Inalid username!");
			}
			System.out.println("Username has been set!");
			System.out.print("Enter the password: ");
			String pass = sc.nextLine();
			if (pass.length()<6) {
				throw new WeakPasswordException("Weak Password, Try Again!");
			}
			System.out.println("Password has been set!");
		}
		catch(Exception e) {
				System.out.println(e.getMessage());
		}
		sc.close();
	}
}
