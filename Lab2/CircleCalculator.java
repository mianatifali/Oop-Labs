import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args)
	{       
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter the radius of the circle: ");        
        double radius = scanner.nextDouble();        
        scanner.close();       
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);        
        System.out.println("For a circle with radius " + radius + ":");
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
