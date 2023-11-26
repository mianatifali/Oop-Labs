import java.util.Scanner;

public class EvenOddCounter 
{
    public static void main(String[] args) 
	{        
        Scanner scanner = new Scanner(System.in);        
        int evenCount = 0;
        int oddCount = 0;
        int zeroCount = 0;      
        System.out.println("Enter 10 values:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Value " + i + ": ");
            int value = scanner.nextInt();           
            if (value % 2 == 0) {
                evenCount++;
            } else if (value != 0) {
                oddCount++;
            } else {
                zeroCount++;
            }
        }      
        scanner.close();       
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
        System.out.println("Zero count: " + zeroCount);
    }
}
