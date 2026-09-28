import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total count of numbers (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The count must be a positive integer greater than zero.");
            scanner.close();
            return;
        }

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = scanner.nextDouble();
            sum += num;
        }

        double result = sum / n;

        System.out.println("\n--- Results ---");
        System.out.println("Total Sum: " + sum);
        System.out.println("Sum divided by " + n + " (Average): " + result);

        scanner.close();
    }
}
