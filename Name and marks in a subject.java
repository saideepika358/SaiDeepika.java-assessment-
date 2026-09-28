import java.util.Scanner;

class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name + ", Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name for Student 1: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter marks for Student 1: ");
        double marks1 = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter name for Student 2: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter marks for Student 2: ");
        double marks2 = scanner.nextDouble();

        Student student1 = new Student(name1, marks1);
        Student student2 = new Student(name2, marks2);

        System.out.println("\n--- Student Information ---");
        student1.displayDetails();
        student2.displayDetails();

        scanner.close();
    }
}
