class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student[Name=" + name + ", Age=" + age + "]";
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book[Title='" + title + "', Author='" + author + "']";
    }
}

public class Main {
    public static void main(String[] args) {
        Object[] objects = new Object[2];
        objects[0] = new Student("Alice", 20);
        objects[1] = new Book("1984", "George Orwell");

        for (Object obj : objects) {
            System.out.println(obj);
        }
    }
}
