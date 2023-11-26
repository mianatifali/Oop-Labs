import java.util.Scanner;

public class MyCalculator
 {
    public static void main(String[] args) 
	{        
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();        
        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();        
        System.out.println("Choose an operation:");
        System.out.println("1: Addition (a + b)");
        System.out.println("2: Subtraction (a - b)");
        System.out.println("3: Multiplication (a * b)");
        System.out.println("4: Division (a / b)");
        System.out.println("5: Modulo or Remainder (a % b)");        
        System.out.print("Enter the operation (1-5): ");
        int operationChoice = scanner.nextInt();        
        scanner.close();       
        double result = 0;
        switch (operationChoice) {
            case 1:
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case 5:
                if (b != 0) {
                    result = a % b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot calculate modulo with zero as the divisor.");
                }
                break;
            default:
                System.out.println("Invalid operation choice. Please choose a number between 1 and 5.");
        }
    }
}
