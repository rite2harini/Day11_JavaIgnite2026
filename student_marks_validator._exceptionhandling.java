public class MarksValidation {
	static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Invalid Marks");
        } else {
            System.out.println("Valid Marks");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            checkMarks(marks);

        } catch (InvalidMarksException e) {
            System.out.println("InvalidMarksException handled");
        }
    }
}


