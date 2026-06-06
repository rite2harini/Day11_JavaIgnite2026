public class PatientPriority {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter patient name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter age: ");
	            int age = sc.nextInt();

	            System.out.print("Enter emergency level (1-5): ");
	            int level = sc.nextInt();

	            if (age < 0 || age > 120) {
	                throw new InvalidAgeException("Invalid Age");
	            }

	            if (level < 1 || level > 5) {
	                throw new InvalidPriorityException("Invalid Priority Level");
	            }

	            System.out.println("Patient Name: " + name);
	            System.out.println("Priority Level Assigned: " + level);

	        } catch (InvalidAgeException | InvalidPriorityException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }
	    }
	}

