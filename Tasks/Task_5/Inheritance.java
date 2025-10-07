package Task_5;

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("===== Single Inheritance Demo =====");
        Dog dog = new Dog("Buddy", "Brown");
        dog.eat();
        dog.bark();

        System.out.println("\n===== Multi-Level Inheritance Demo =====");
        GermanShepherd gs = new GermanShepherd("Max", "Black and Tan", "Police");
        gs.eat();
        gs.bark();
        gs.guard();

        System.out.println("\n===== Hierarchical Inheritance Demo =====");
        Cat cat = new Cat("Whiskers", "White");
        cat.eat();
        cat.meow();

        System.out.println("\n===== Method Overriding Demo =====");
        dog.makeSound();  // Overridden method
        cat.makeSound();  // Overridden method

        System.out.println("\n===== Constructor Chaining Demo =====");
        // Constructor chaining is demonstrated in GermanShepherd class creation
    }
}