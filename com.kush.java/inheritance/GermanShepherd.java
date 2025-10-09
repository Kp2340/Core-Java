package inheritance;

// Example of Multi-Level Inheritance
public class GermanShepherd extends Dog {
    private String specialization;

    public GermanShepherd(String name, String color, String specialization) {
        super(name, color);  // Constructor chaining
        this.specialization = specialization;
        System.out.println("GermanShepherd constructor called");
    }

    public void guard() {
        System.out.println(name + " is guarding as a " + specialization + " dog");
    }
}