import java.util.Scanner
  
abstract class Operator {
    public abstract double calculate(double a, double b);
}

class AddOperator extends Operator {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}

class SubtractOperator extends Operator {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}

class MultiplyOperator extends Operator {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}

class DivideOperator extends Operator {
    @Override
    public double calculate(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char symbol = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        Operator operator = null;

        switch (symbol) {
            case '+':
                operator = new AddOperator();
                break;
            case '-':
                operator = new SubtractOperator();
                break;
            case '*':
                operator = new MultiplyOperator();
                break;
            case '/':
                operator = new DivideOperator();
                break;
            default:
                System.out.println("Invalid operator!");
                scanner.close();
                return;
        }

        try {
            double result = operator.calculate(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
