import java.util.*;

public class Operations{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
        // Taking input from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2; // Adding the numbers

        int subt = num1 - num2; // Subtracting the numbers

        System.out.println("The sum is: " + sum); // Display the result
        System.out.println("The Difference is: " + subt); // Display the result;

        scanner.close(); // Close the scanner
  }
}
