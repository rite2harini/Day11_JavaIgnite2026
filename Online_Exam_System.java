/*
Create a program that:

Takes student answers score
Calculates percentage
Rules:
Marks cannot exceed 100 → InvalidMarksException
Negative marks not allowed → NegativeMarksException
If student ID is null → NullPointerException handling
Twist:
Use nested try-catch blocks
*/
import java.util.*;

class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) { super(msg); }
}

class NegativeMarksException extends Exception {
    NegativeMarksException(String msg) { super(msg); }
}

public class StudentScoreSystem {
    
    static class Student {
        String id, name;
        int totalMarks, obtainedMarks;
        
        Student(String id, String name, int totalMarks, int obtainedMarks) {
            this.id = id;
            this.name = name;
            this.totalMarks = totalMarks;
            this.obtainedMarks = obtainedMarks;
        }
    }
    
    static double calculatePercentage(Student s) 
            throws InvalidMarksException, NegativeMarksException, NullPointerException {
        // Outer try - handles NullPointer and marks validation
        try {
            System.out.println("Checking student ID...");
            if (s.id == null) throw new NullPointerException("Student ID is null!");
            
            // Inner try - handles marks-specific exceptions
            try {
                System.out.println("Validating marks for " + s.name + "...");
                if (s.obtainedMarks < 0) 
                    throw new NegativeMarksException("Negative marks: " + s.obtainedMarks);
                if (s.obtainedMarks > s.totalMarks || s.totalMarks > 100) 
                    throw new InvalidMarksException(
                        "Marks exceeded! Obtained: " + s.obtainedMarks + 
                        ", Total: " + s.totalMarks);
                
                double percentage = (s.obtainedMarks * 100.0) / s.totalMarks;
                System.out.println("✓ Marks validated successfully");
                return percentage;
                
            } catch (NegativeMarksException e) {
                System.out.println("→ Caught in inner block: " + e.getMessage());
                throw e; // Re-throw to outer
            } catch (InvalidMarksException e) {
                System.out.println("→ Caught in inner block: " + e.getMessage());
                throw e; // Re-throw to outer
            }
        } catch (NullPointerException e) {
            System.out.println("→ Caught in outer block: " + e.getMessage());
            throw e;
        }
    }
    
    static void processStudent(Student s) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Processing: " + 
            (s.id != null ? s.id + " - " + s.name : "UNKNOWN"));
        try {
            double percentage = calculatePercentage(s);
            String grade = percentage >= 60 ? "Pass" : "Fail";
            System.out.printf("Result: %.2f%% - %s%n", percentage, grade);
        } catch (NullPointerException e) {
            System.out.println("✗ FINAL ERROR: Cannot process - " + e.getMessage());
        } catch (NegativeMarksException | InvalidMarksException e) {
            System.out.println("✗ FINAL ERROR: Invalid marks - " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        // Test cases
        processStudent(new Student("S101", "John", 100, 85));     // Valid
        processStudent(new Student(null, "Alice", 100, 90));      // Null ID
        processStudent(new Student("S103", "Bob", 100, -10));     // Negative
        processStudent(new Student("S104", "Charlie", 100, 120)); // Exceeded
        processStudent(new Student("S105", "Diana", 50, 45));     // Valid small
        processStudent(new Student("S106", "Eve", 100, 0));       // Zero marks
    }
}
