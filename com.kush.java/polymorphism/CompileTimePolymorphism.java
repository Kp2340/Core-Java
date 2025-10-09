package polymorphism;

import static statickeyword.staticImport.kp;

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        int intResult = new CompileTimePolymorphism().add(5, 10);
        double doubleResult = new CompileTimePolymorphism().add(5.5, 10.5);
        String stringResult = new CompileTimePolymorphism().add("Hello, ", "World!");
        kp(intResult);
        kp(doubleResult);
        kp(stringResult);
    }
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    String add(String a, String b) {
        return a + b;
    }
}
// Output:
// 15
// 16.0
// Hello, World!