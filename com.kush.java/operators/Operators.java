package operators;

import static statickeyword.staticImport.kp;

public class Operators {
    public static void main(String[] args) {
        unaryOperators();
        arithmeticOperators();
        relationalOperators();
        bitwiseOperators();
        shortCircuitOperators();
        assignmentOperators();
        ternaryOperator();
        bmiCalculator(80, 6.1);
    }

    public static void unaryOperators() {
        System.out.println("unaryOperators");
        int a = 10;
        String s=new String("`==` checks references, `equals()` checks content");
        kp(s);
        System.out.println("Initial value of a: " + a);
        System.out.println("Unary plus: " + +a); // Unary plus
        System.out.println("Unary minus: " + -a); // Unary minus
        System.out.println("Increment (prefix): " + ++a); // Increment (prefix)
        System.out.println("Decrement (prefix): " + --a); // Decrement (prefix)
        System.out.println("Increment (postfix): " + a++); // Increment (postfix)
        System.out.println("Value of a after postfix increment: " + a);
        System.out.println("Decrement (postfix): " + a--); // Decrement (postfix)
        System.out.println("Value of a after postfix decrement: " + a);
        boolean b = true;
        System.out.println("Initial value of b: " + b);
        System.out.println("Logical NOT: " + !b); // Logical NOT
    }
    public static void arithmeticOperators() {
        System.out.println("\narithmeticOperators");
        int a = 15;
        int b = 4;
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("Addition: " + (a + b)); // Addition
        System.out.println("Subtraction: " + (a - b)); // Subtraction
        System.out.println("Multiplication: " + (a * b)); // Multiplication
        System.out.println("Division: " + (a / b)); // Division
        System.out.println("Modulus: " + (a % b)); // Modulus
    }
    public static void relationalOperators() {
        System.out.println("\nrelationalOperators");
        int a = 10;
        int b = 20;
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("Equal to: " + (a == b)); // Equal to
        System.out.println("Not equal to: " + (a != b)); // Not equal to
        System.out.println("Greater than: " + (a > b)); // Greater than
        System.out.println("Less than: " + (a < b)); // Less than
        System.out.println("Greater than or equal to: " + (a >= b)); // Greater than or equal to
        System.out.println("Less than or equal to: " + (a <= b)); // Less than or equal to
    }
    public static void bitwiseOperators() {
        System.out.println("\nbitwiseOperators");
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("Bitwise AND: " + (a & b)); // Bitwise AND
        System.out.println("Bitwise OR: " + (a | b)); // Bitwise OR
        System.out.println("Bitwise XOR: " + (a ^ b)); // Bitwise XOR
        System.out.println("Bitwise NOT of a: " + (~a)); // Bitwise NOT
        System.out.println("Left shift a by 1: " + (a << 1)); // Left shift
        System.out.println("Right shift a by 1: " + (a >> 1)); // Right shift
    }
     public static void shortCircuitOperators() {
         System.out.println("\nshortCircuitOperators");
         int a = 10;
         int b = 20;
         System.out.println("a: " + a + ", b: " + b);
         System.out.println("Logical AND (&&): " + ((a < b) && (a > 5))); // Logical AND
         System.out.println("Logical OR (||): " + ((a < b) || (a < 5))); // Logical OR
     }
    public static void assignmentOperators() {
        System.out.println("\nassignmentOperators");
        int a = 10, b = 5; // Assign operators
        String ab="AB", cd="CD";
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("ab: " + ab + ", cd: " + cd);
        a+=b;
        System.out.println("a += b : " + a);// Addition
        ab+=cd;
        System.out.println("ab += cd : " + ab); // String concatenation
        a-=b;
        System.out.println("a -= b : " + a); // Subtraction
        a*=b;
        System.out.println("a * b : " + a); // Multiplication
        a/=b;
        System.out.println("a / b : " + a); // Division
        a%=b;
        System.out.println("a % b : " + a); // Modulus
    }
    public static void ternaryOperator() {
        System.out.println("\nternaryOperator");
        int a = 10, b = 20;
        int max = (a > b) ? a : b; // Ternary operator
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("Maximum value: " + max);
    }
    public static void bmiCalculator(double weightInKg, double heightInFeet) {
        System.out.println("\nbmiCalculator");
        // Convert heightInMeter from feet to meters
        double heightInMeter = heightInFeet * 0.3048;

        double bmi = weightInKg / (heightInMeter * heightInMeter);

        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Category: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obesity");
        }
    }
}
//Output:
//C:\Users\kushp\.jdks\ms-17.0.15\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.2.2\lib\idea_rt.jar=63968" -Dfile.encoding=UTF-8 -classpath J:\IdeaProjects\Core-Java\out\production\Core-Java Task_3.Operators
//unaryOperators
//Initial value of a: 10
//Unary plus: 10
//Unary minus: -10
//Increment (prefix): 11
//Decrement (prefix): 10
//Increment (postfix): 10
//Value of a after postfix increment: 11
//Decrement (postfix): 11
//Value of a after postfix decrement: 10
//Initial value of b: true
//Logical NOT: false
//
//arithmeticOperators
//a: 15, b: 4
//Addition: 19
//Subtraction: 11
//Multiplication: 60
//Division: 3
//Modulus: 3
//
//relationalOperators
//a: 10, b: 20
//Equal to: false
//Not equal to: true
//Greater than: false
//Less than: true
//Greater than or equal to: false
//Less than or equal to: true
//
//bitwiseOperators
//a: 5, b: 3
//Bitwise AND: 1
//Bitwise OR: 7
//Bitwise XOR: 6
//Bitwise NOT of a: -6
//Left shift a by 1: 10
//Right shift a by 1: 2
//
//shortCircuitOperators
//a: 10, b: 20
//Logical AND (&&): true
//Logical OR (||): true
//
//assignmentOperators
//a: 10, b: 5
//ab: AB, cd: CD
//a += b : 15
//ab += cd : ABCD
//a -= b : 10
//a * b : 50
//a / b : 10
//a % b : 0
//
//ternaryOperator
//a: 10, b: 20
//Maximum value: 20
//
//bmiCalculator
//Your BMI is: 23.141973483923078
//Category: Normal