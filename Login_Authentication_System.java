package JavaIgniteDay11;
import java.util.Scanner;
class InvalidUsernameException extends Exception {
    InvalidUsernameException(){
        super("Username cannot be empty");
    }
}
class WeakPasswordException extends Exception {
	WeakPasswordException(){
		super("Weak password");
	}
}
class SnartLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String user,password;
		try {
			System.out.println("Enter the username for login :");
			user = sc.nextLine();
			if(user.isEmpty())
				throw new InvalidUsernameException();

			System.out.println("Enter the password");
			password=sc.nextLine();
			if(password.length() < 6) {
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
