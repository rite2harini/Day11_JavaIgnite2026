public class LoginSystem {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter username: ");
	            String username = sc.nextLine();

	            System.out.print("Enter password: ");
	            String password = sc.nextLine();

	            if (username.isEmpty()) {
	                throw new InvalidUsernameException("Username cannot be empty");
	            }

	            if (password.length() < 6) {
	                throw new WeakPasswordException("Password must be at least 6 characters");
	            }

	            System.out.println("Login Successful");

	        } catch (InvalidUsernameException | WeakPasswordException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }
	    }
	}

