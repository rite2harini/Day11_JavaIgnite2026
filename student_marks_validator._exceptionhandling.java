/*
Create a program that:

Takes marks of a student
Rules:
If marks < 0 OR marks > 100 → throw custom exception InvalidMarksException
Requirements:
Use throw inside method
Use throws in method signature
Output:
Valid Marks OR InvalidMarksException handled
*/
class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) { super(msg); }
}

public class MarksValidator {
    
    // Method with 'throws' declaration
    static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            // 'throw' inside method to raise exception
            throw new InvalidMarksException(
                "Invalid marks: " + marks + " (must be 0-100)");
        }
        System.out.println("✓ Valid Marks: " + marks);
    }
    
    public static void main(String[] args) {
        int[] testMarks = {85, -10, 45, 150, 0, 100, 67, -5};
        
        for (int marks : testMarks) {
            System.out.print("Testing marks: " + marks + " → ");
            try {
                validateMarks(marks); // Caller must handle or declare
            } catch (InvalidMarksException e) {
                System.out.println("✗ EXCEPTION: " + e.getMessage());
            }
        }
    }
}
