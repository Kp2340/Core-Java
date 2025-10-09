package innerClasses;

public class OuterInnerClasses {
    private static int x = 50;
    private int y;

    OuterInnerClasses(int y) {
        this.y = y;
    }

    void f1() {
        System.out.println("Outer Classes non static method");
    }

    class Inner {
        private int y;

        Inner(int y) {
            this.y = y;
        }

        private void f2() {
            System.out.println(x);
            System.out.println(this.y);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        OuterInnerClasses outer = new OuterInnerClasses(80);
        outer.f1();
        OuterInnerClasses.Inner inner = outer.new Inner(30);
        inner.f2();
        System.out.println(inner.y);
    }
}
//Output:
//Outer Classes non static method
//50
//80
//
//30