package Task_2;

public class StaticNonStatic {
    public static void main(String[] args) {
        System.out.println("Initial static variable value: " + staticVariable);
        staticMethod(); // Call static method
        StaticNonStatic.staticMethod(); // Call again to see the increment
        StaticNonStatic obj1 = new StaticNonStatic();
        StaticNonStatic obj2 = new StaticNonStatic();

        obj1.nonStaticMethod(); // Call non-static method on obj1
        obj2.nonStaticMethod(); // Call non-static method on obj2
        obj1.nonStaticMethod(); // Call again on obj1 to see the increment
    }
    static int staticVariable; // Static variable
    int instanceVariable; // Non-static (instance) variable It can not be

    StaticNonStatic(){
        System.out.println(this);
        System.out.println(this.instanceVariable);
        System.out.println(staticVariable); // this keyword can not be used with static variable
    }
    // Static block
    static {
        staticVariable++; // Static blocks can access static variables
        //instanceVariable++; // This would cause a compile-time error
        System.out.println("Static Block is being executed Static variable value: " + staticVariable + " Non-static variable can not be accessed here" );
    }

    // Non-static block
    {
        instanceVariable++; // Non-static blocks can access instance variables
        staticVariable++; // Non-static blocks can also access static variables
        System.out.println("Non-Static Block is being executed Static variable value: " + staticVariable + " Non-static variable value: " + instanceVariable);
    }
    // Static method
    static void staticMethod() {
        staticVariable++;
        System.out.println("Static Method is being executed Static variable value: " + staticVariable + " Non-static variable can not be accessed here" );
        // instanceVariable++; // This would cause a compile-time error
    }

    // Non-static method
    void nonStaticMethod() {
        instanceVariable++;
        staticVariable++; // Non-static methods can access static variables
        System.out.println("Non-Static Method is being executed Static variable value: " + staticVariable + " Non-static variable value: " + instanceVariable);
    }
}

// Output:
//Static Block is being executed Static variable value: 1 Non-static variable can not be accessed here
//Initial static variable value: 1
//Static Method is being executed Static variable value: 2 Non-static variable can not be accessed here
//Static Method is being executed Static variable value: 3 Non-static variable can not be accessed here
//Non-Static Block is being executed Static variable value: 4 Non-static variable value: 1
//Task_2.CoreJava1StaticNonStatic@7699a589
//1
//4
//Non-Static Block is being executed Static variable value: 5 Non-static variable value: 1
//Task_2.CoreJava1StaticNonStatic@58372a00
//1
//5
//Non-Static Method is being executed Static variable value: 6 Non-static variable value: 2
//Non-Static Method is being executed Static variable value: 7 Non-static variable value: 2
//Non-Static Method is being executed Static variable value: 8 Non-static variable value: 3