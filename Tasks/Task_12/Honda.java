package Task_12;

public class Honda implements Car{
    @Override
    public void go() {
        System.out.println("Honda is going");
    }

    @Override
    public void stop() {
        System.out.println("Honda is stopping");
    }
}
