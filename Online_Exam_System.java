public class StudentScore {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            try {
                System.out.print("Enter student ID: ");
                String studentId = sc.nextLine();

                if (studentId.isEmpty()) {
                    throw new NullPointerException("Student ID is null");
                }

                System.out.print("Enter marks: ");
                int marks = sc.nextInt();

                if (marks > 100) {
                    throw new InvalidMarksException("Marks cannot exceed 100");
                }

                if (marks < 0) {
                    throw new NegativeMarksException("Negative marks not allowed");
                }

                double percentage = marks;
                System.out.println("Percentage: " + percentage + "%");

            } catch (NullPointerException e) {
                System.out.println("Exception: " + e.getMessage());
            }

        } catch (InvalidMarksException | NegativeMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

}

