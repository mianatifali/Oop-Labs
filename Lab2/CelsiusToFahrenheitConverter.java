import java.util.Scanner;

public class Temperature
 {
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();       
        scanner.close();        
        double fahrenheit = (celsius * 9/5) + 32;      
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
}
