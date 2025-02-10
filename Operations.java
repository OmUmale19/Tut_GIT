import java.util.Scanner;

public class Operations{

  static int add(int a,int b){
    return a+b;
  }
  static int subt(int a,int b){
    return a-b;
  }
  static int mul(int a,int b){
    return a*b;
  }
  static int div(int a,int b){
    return a/b;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter first number");
    int a = sc.nextInt();
    System.out.println("Enter second number");
    int b = sc.nextInt();

    while (true) {
      System.out.println("Enter the option: \n1. Add\n2. Sub\n3. Mul\n4. Div");
      int option = sc.nextInt();

      switch (option) {
        case 1:
            System.out.println("Addition is: "+add(a, b));
            break;
        case 2:
            System.out.println("Subtraction is: "+subt(a, b));
            break;
        case 3:
            System.out.println("Multiplication is: "+mul(a, b));
            break;
        case 4:
            System.out.println("Division is: "+div(a, b));
            break;
        default:
            System.out.println("Select valid option");
    }
    }
    
  }
}