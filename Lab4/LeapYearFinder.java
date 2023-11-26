import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) 
	{      
        Scanner scanner = new Scanner(System.in);      
        System.out.print("Enter the starting year (must be greater than 1000): ");
        int yearStart = scanner.nextInt();       
        if (yearStart <= 1000) {
            System.out.println("Invalid input. Starting year must be greater than 1000.");
            return; 
        }        
        System.out.print("Enter the ending year: ");
        int yearEnd = scanner.nextInt();       
        scanner.close();        
        if (yearEnd <= yearStart) {
            System.out.println("Invalid input. Ending year must be greater than the starting year.");
            return; 
        }      
        System.out.println("Leap years between " + yearStart + " and " + yearEnd + ":");

        for (int year = yearStart; year <= yearEnd; year++) {
            if (isLeapYear(year)) {
                System.out.println(year);
            }
        }
    }
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
