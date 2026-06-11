import java.util.Scanner;

// Custom Exception for Invalid Age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Priority
class InvalidPriorityException extends Exception {
    public InvalidPriorityException(String message) {
        super(message);
    }
}

public class PatientPrioritySystem {

    public static void assignPriority(String name, int age, int emergencyLevel)
            throws InvalidAgeException, InvalidPriorityException {

        // Validate Age
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid Age! Age must be between 0 and 120.");
        }

        // Validate Emergency Level
        if (emergencyLevel < 1 || emergencyLevel > 5) {
            throw new InvalidPriorityException(
                    "Invalid Priority! Emergency level must be between 1 and 5.");
        }

        System.out.println("Patient Name: " + name);
        System.out.println("Priority Level Assigned: " + emergencyLevel);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Emergency Level (1-5): ");
            int emergencyLevel = sc.nextInt();

            assignPriority(name, age, emergencyLevel);

        } catch (InvalidAgeException | InvalidPriorityException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}/*
Create a system that assigns priority to patients.

Inputs:
Patient name
Age
Emergency level (1–5)
Rules:
Age < 0 or > 120 → InvalidAgeException
Emergency level not between 1–5 → InvalidPriorityException
Output:
Priority Level assigned OR Exception message
*/
