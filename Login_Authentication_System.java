/*
Create a login system:

Input username and password
Rules:
Username cannot be empty → throw InvalidUsernameException
Password must be at least 6 characters → throw WeakPasswordException
*/
import java.util.Scanner;

class InvalidUsernameException extends Exception {
    InvalidUsernameException(String msg) {
        super(msg);
    }
}

class WeakPasswordException extends Exception {
    WeakPasswordException(String msg) {
        super(msg);
    }
}

public class Login_Authentication_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (username.isEmpty()) {
                throw new InvalidUsernameException("Username cannot be empty");
            }

            if (password.length() < 6) {
                throw new WeakPasswordException("Password must be at least 6 characters");
            }

            System.out.println("Login Successful");

        } catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}