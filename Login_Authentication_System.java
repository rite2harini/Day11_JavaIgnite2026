/*
Create a login system:

Input username and password
Rules:
Username cannot be empty → throw InvalidUsernameException
Password must be at least 6 characters → throw WeakPasswordException
*/
import java.util.*;

class InvalidUsernameException extends Exception {
    InvalidUsernameException(String msg) { super(msg); }
}

class WeakPasswordException extends Exception {
    WeakPasswordException(String msg) { super(msg); }
}

class LoginSystem {
    private Map<String, String> users = new HashMap<>();
    
    void register(String username, String password) 
            throws InvalidUsernameException, WeakPasswordException {
        if (username == null || username.trim().isEmpty()) 
            throw new InvalidUsernameException("Username cannot be empty!");
        if (password == null || password.length() < 6) 
            throw new WeakPasswordException("Password must be at least 6 characters!");
        if (users.containsKey(username)) {
            System.out.println("⚠ Username already exists!");
            return;
        }
        users.put(username, password);
        System.out.println("✓ Registration successful: " + username);
    }
    
    void login(String username, String password) 
            throws InvalidUsernameException, WeakPasswordException {
        if (username == null || username.trim().isEmpty()) 
            throw new InvalidUsernameException("Username cannot be empty!");
        if (password == null || password.length() < 6) 
            throw new WeakPasswordException("Password must be at least 6 characters!");
        if (!users.containsKey(username)) {
            System.out.println("✗ User not found!");
            return;
        }
        System.out.println(users.get(username).equals(password) ? 
            "✓ Login successful! Welcome, " + username : "✗ Incorrect password!");
    }
    
    public static void main(String[] args) {
        LoginSystem system = new LoginSystem();
        
        // Test cases
        test(system, "register", "john_doe", "pass123");
        test(system, "register", "", "password");
        test(system, "register", "alice", "12345");
        test(system, "register", "alice", "alice123");
        
        test(system, "login", "john_doe", "pass123");
        test(system, "login", "", "anything");
        test(system, "login", "john_doe", "wrong1");
        test(system, "login", "unknown", "password");
    }
    
    static void test(LoginSystem system, String action, String user, String pass) {
        System.out.println("\n▶ " + action.toUpperCase() + ": " + user + " / " + pass);
        try {
            if (action.equals("register")) system.register(user, pass);
            else system.login(user, pass);
        } catch (InvalidUsernameException | WeakPasswordException e) {
            System.out.println("✗ ERROR: " + e.getMessage());
        }
    }
}
