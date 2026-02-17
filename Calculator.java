import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2 ;
        int difference =  num1 - num2;

        System.out.println("Sum "+ sum);
        System.out.println("Difference " + difference);




        System.out.println("Thats all... ");






        System.out.println("Enter first number:");
        int num11 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num22 = scanner.nextInt();
        int product = num11 * num22;
        int quotient = num11 / num22;
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);




        scanner.close();


    }
}
