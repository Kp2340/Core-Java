package Task_5;

// Example of Hierarchical Inheritance (Another child of Animal)
public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color);
        System.out.println("Cat constructor called");
    }

    public void meow() {
        System.out.println(name + " is meowing");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
}