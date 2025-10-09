package Task_5;

public class Animal {
    protected String name;
    protected String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println("Animal constructor called");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}