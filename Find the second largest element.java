import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array size must be at least 2.");
            scanner.close();
            return;
        }

        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double largest = Double.NEGATIVE_INFINITY;
        double secondLargest = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < n; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        if (secondLargest == Double.NEGATIVE_INFINITY) {
            System.out.println("There is no distinct second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

        scanner.close();
    }
}
