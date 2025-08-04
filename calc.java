import java.util.Scanner;
public class calc{
    public static void main(String args[]){
            System.out.println("Enter first number: ");
            Scanner in = new Scanner(System.in);
    double num1 =in.nextDouble();
    System.out.println("Enter an operator (+, -, *, /): ");
    char operator = in.next().charAt(0);
        System.out.println("Enter second number: ");
    double num2 = in.nextDouble();
    double result;
    switch (operator) {
        case '+':
            result = num1 + num2;
            System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
            break;
        case '-':
            result = num1 - num2;
            System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
            break;
        case '*':
            result = num1 * num2;
            System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
            break;
        case '/':
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
            break;
        default:
            System.out.println("Invalid operator! Please use +, -, *, or /.");
    }
    in.close();
}


    }



output
Enter first number: 
13
Enter an operator (+, -, *, /): 
+
Enter second number: 
45
Result: 13.0 + 45.0 = 58.0
