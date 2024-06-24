import java.util.Scanner;

public class Calculator {
    public static void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = add(num1, num2);

        System.out.println("The result of addition is: " + result);
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        input();
    }
}
