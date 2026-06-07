/*
Create a login system:

Input username and password
Rules:
Username cannot be empty → throw InvalidUsernameException
Password must be at least 6 characters → throw WeakPasswordException
*/
package day11_progs;
import java.util.Scanner;
class InvalidUsernameException extends Exception{
	public InvalidUsernameException(String msg) {
		super(msg);
	}
}
class WeakPasswordException extends Exception{
	public WeakPasswordException(String msg) {
		super(msg);
	}
}
public class Login_Authentication_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter User Name : ");
			String name =sc.nextLine();
			if(name.equals(" ")|| name.equals("")) {
				throw new InvalidUsernameException("Invalid Input!!");
			}
			System.out.print("Create password : ");
			String pwd =sc.nextLine();
			if(pwd.length()<6) {
				throw new WeakPasswordException("Password is weak try again !!");
			}
			System.out.print("System Created Successfully\n");
		}
		catch(WeakPasswordException e) {
			System.out.print(e.getMessage());
		}
		catch(InvalidUsernameException e) {
			System.out.print(e.getMessage());
		}
		sc.close();
	}

}
