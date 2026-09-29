public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            int result = numbers[1] / 0;
            System.out.println("Result: " + result);
            System.out.println("Element: " + numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed regardless of exceptions.");
        }
    }
}
