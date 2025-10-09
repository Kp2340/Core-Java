package Task_5;

// Example of Single Inheritance
public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color);  // Parent constructor by using super keyword must be called first
        System.out.println("Dog constructor called");
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
}