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
            System.out.println("Outer class x: "+ x);
            System.out.println("Outer class y: "+ OuterInnerClasses.this.y);
            System.out.println("Inner class y: "+ y);
        }
    }

    public static void main(String[] args) {
        OuterInnerClasses outer = new OuterInnerClasses(80);
        outer.f1();
        OuterInnerClasses.Inner inner = outer.new Inner(30);
        inner.f2();
        System.out.println("Inner class y: "+ inner.y);
    }
}
//Output:
//Outer Classes non static method
//Outer class x: 50
//Inner class y: 80
//Outer class y: 30
//Inner class y: 30