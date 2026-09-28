class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

class Fox extends Animal {
    public Fox(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + " says: Yip! Yip!");
    }
}

class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name);
    }

    public void hop() {
        System.out.println(name + " is hopping around.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Fox fox = new Fox("Tod");
        Rabbit rabbit = new Rabbit("Thumper");

        System.out.println("--- Dog ---");
        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println("\n--- Fox ---");
        fox.eat();
        fox.sleep();
        fox.makeSound();

        System.out.println("\n--- Rabbit ---");
        rabbit.eat();
        rabbit.sleep();
        rabbit.hop();
    }
}
