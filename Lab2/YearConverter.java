import java.util.Scanner;

public class YearConverter 
{
    public static void main(String[] args) 
	{       
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter the number of years: ");        
        float years = scanner.nextFloat();       
        scanner.close();      
        float months = years * 12;
        float days = years * 365.25f;  
		System.out.println(years + " years is approximately equal to:");
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }
}
