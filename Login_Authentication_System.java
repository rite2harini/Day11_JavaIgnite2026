/*
Create a login system:

Input username and password
Rules:
Username cannot be empty → throw InvalidUsernameException
Password must be at least 6 characters → throw WeakPasswordException
*/
package java_internship_day11;
import java.util.Scanner;
class InvalidUsernameException extends Exception {
    InvalidUsernameException(){
        super("Username cannot be empty");
    }
}
class WeakPasswordException extends Exception {
	WeakPasswordException(){
		super("Password is weak ");
	}
}
class SnartLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String username,pass;
		try {
			System.out.println("Enter the username for login :");
			username = sc.nextLine();
			if(username.isEmpty())
				throw new InvalidUsernameException();

			System.out.println("Enter the password");
			pass=sc.nextLine();
			if(pass.length() < 6) {
				throw new WeakPasswordException();
			}
			
			
		}
		catch(WeakPasswordException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidUsernameException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
