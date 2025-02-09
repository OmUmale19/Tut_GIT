// This is a new java file to update substraction code
import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Perform subtraction
        int result = num1 - num2;
        
        // Display result
        System.out.println("Result of subtraction: " + result);
        
        // Close scanner
        scanner.close();
    }
}
