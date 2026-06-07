/*
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
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidPriorityException extends Exception {
    public InvalidPriorityException(String message) {
        super(message);
    }
}

public class PatientPrioritySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            int emergencyLevel = Integer.parseInt(scanner.nextLine());

            if (age < 0 || age > 120) {
                throw new InvalidAgeException("InvalidAgeException");
            }
            if (emergencyLevel < 1 || emergencyLevel > 5) {
                throw new InvalidPriorityException("InvalidPriorityException");
            }

            System.out.println("Priority Level assigned");

        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPriorityException e) {
            System.out.println(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
