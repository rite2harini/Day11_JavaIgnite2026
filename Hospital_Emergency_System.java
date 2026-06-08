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
import java.util.*;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}

class InvalidPriorityException extends Exception {
    InvalidPriorityException(String msg) { super(msg); }
}

class Patient {
    String name;
    int age, emergencyLevel;
    
    Patient(String name, int age, int emergencyLevel) 
            throws InvalidAgeException, InvalidPriorityException {
        if (age < 0 || age > 120) 
            throw new InvalidAgeException("Invalid age: " + age + " (must be 0-120)");
        if (emergencyLevel < 1 || emergencyLevel > 5) 
            throw new InvalidPriorityException("Invalid emergency level: " + 
                emergencyLevel + " (must be 1-5)");
        this.name = name;
        this.age = age;
        this.emergencyLevel = emergencyLevel;
    }
    
    String getPriority() {
        int score = (age > 60 ? 1 : 0) + (6 - emergencyLevel); // Higher = more urgent
        return switch(score) {
            case 0, 1 -> "Low";
            case 2, 3 -> "Medium";
            case 4, 5 -> "High";
            default -> "Critical";
        };
    }
    
    public String toString() {
        return String.format("Patient: %s | Age: %d | Emergency: %d | Priority: %s",
                name, age, emergencyLevel, getPriority());
    }
}

public class PatientPrioritySystem {
    public static void main(String[] args) {
        testCase("John", 45, 3);
        testCase("Alice", 75, 1);
        testCase("Bob", 25, 5);
        testCase("Invalid", -5, 2);
        testCase("Charlie", 30, 0);
        testCase("Diana", 150, 4);
    }
    
    static void testCase(String name, int age, int level) {
        try {
            Patient p = new Patient(name, age, level);
            System.out.println(p);
        } catch (InvalidAgeException | InvalidPriorityException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
