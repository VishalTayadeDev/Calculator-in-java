import java.util.*;

public class Calculatar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        double a = sc.nextDouble();
        System.out.print("Enter the second number : ");
        double b = sc.nextDouble();
        System.out.print("Enter the operation (+,-,*,/,%):");
        char operation = sc.next().charAt(0);
        double result = 0.0;

        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println(" Invalid operation");
        }

        System.out.println(a + " " + operation + " " + b + " = " + result);

        sc.close();
    }

}