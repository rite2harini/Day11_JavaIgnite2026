/*
Create a login system:

Input username and password
Rules:
Username cannot be empty → throw InvalidUsernameException
Password must be at least 6 characters → throw WeakPasswordException
*/
import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String username = scanner.nextLine();
            String password = scanner.nextLine();

            if (username.trim().isEmpty()) {
                throw new InvalidUsernameException("InvalidUsernameException");
            }
            if (password.length() < 6) {
                throw new WeakPasswordException("WeakPasswordException");
            }

            System.out.println("Login successful");

        } catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
