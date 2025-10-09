package Task_6.Abstraction;

public abstract class Dell implements TouchScreenLaptop{
    @Override
    public void scroll() {
        System.out.println("Dell is scrolling");
    }
}
