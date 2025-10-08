package Task_13;

public class AbstractionAssignment {
    public static void main(String[] args) {
        DellNotebook notebook = new DellNotebook();
        notebook.scroll();
        notebook.click();

        HPNotebook notebook2 = new HPNotebook();
        notebook2.scroll();
        notebook2.click();
    }
}
//Output:
//Dell is scrolling
//Dell is clicking
//HP is scrolling
//HP is clicking