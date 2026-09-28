class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void displayInfo(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Sum of 2 ints: " + math.add(5, 10));

        System.out.println("Sum of 3 ints: " + math.add(5, 10, 15));
      
        System.out.println("Sum of 2 doubles: " + math.add(2.5, 3.5));
      
        math.displayInfo("Alice", 25);

        math.displayInfo(30, "Bob");
    }
}
