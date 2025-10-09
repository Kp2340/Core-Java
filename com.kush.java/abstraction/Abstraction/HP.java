package abstraction.Abstraction;

public abstract class HP implements TouchScreenLaptop{
    @Override
    public void scroll() {
        System.out.println("HP is scrolling");
    }
}
