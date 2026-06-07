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
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class InvalidPriorityException extends Exception {
    InvalidPriorityException(String msg) {
        super(msg);
    }
}

public class HospitalEmergencySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Emergency Level (1-5): ");
            int level = sc.nextInt();

            if (age < 0 || age > 120) {
                throw new InvalidAgeException("Invalid Age");
            }

            if (level < 1 || level > 5) {
                throw new InvalidPriorityException("Invalid Priority Level");
            }

            System.out.println("Patient Name: " + name);
            System.out.println("Priority Level Assigned: " + level);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPriorityException e) {
            System.out.println(e.getMessage());
        }
    }
}