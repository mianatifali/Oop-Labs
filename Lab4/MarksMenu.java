import java.util.Scanner;

public class MarksMenu 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("Please enter an option:");
            System.out.println("1. Check student's marks");
            System.out.println("0. Exit");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    checkStudentMarks();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid option (1 or 0).");
            }
        } while (option != 0);
    }
    public static void checkStudentMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's marks:");
        int marks = scanner.nextInt();
        if (marks >= 90) {
            System.out.println("This is Good");
        } else if (marks >= 60) {
            System.out.println("This is also Good");
        } else {
            System.out.println("This is Good as well");
            System.out.println("Because marks don't matter but our effort does.");
        }
    }
}
