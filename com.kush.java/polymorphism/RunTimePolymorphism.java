package polymorphism;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal a; // Declare a variable of type Animal
        a = new Dog("Buddy", "Brown"); // Assign a Dog object to the Animal variable
        a.makeSound(); // Call the sound method, which will execute Dog's version

        a = new Cat("Whiskers", "White"); // Assign a Cat object to the same Animal variable
        a.makeSound(); // Call the sound method, which will execute Cat's version
    }
}
// Output:
//Animal constructor called
//Dog constructor called
//Buddy says: Woof! Woof!
//Animal constructor called
//Cat constructor called
//Whiskers says: Meow! Meow!