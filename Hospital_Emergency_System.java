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
	public static void assignPriority(String name, int age, int emergencyLevel)
            throws InvalidAgeException, InvalidPriorityException {

        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid Age! Age must be between 0 and 120.");
        }

        if (emergencyLevel < 1 || emergencyLevel > 5) {
            throw new InvalidPriorityException(
                    "Invalid Priority! Emergency level must be between 1 and 5.");
        }

        String priority;

        if (emergencyLevel == 5) {
            priority = "Critical Priority";
        } else if (emergencyLevel == 4) {
            priority = "High Priority";
        } else if (emergencyLevel == 3) {
            priority = "Medium Priority";
        } else if (emergencyLevel == 2) {
            priority = "Low Priority";
        } else {
            priority = "Normal Priority";
        }

        System.out.println("Patient Name : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Priority     : " + priority);
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
        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }

        sc.close();
    }
}
