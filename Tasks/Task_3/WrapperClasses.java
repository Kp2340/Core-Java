package Task_3;

public class WrapperClasses {
    public static void main(String[] args) {
        primitiveAndObject();
        primitiveAndString();
        ObjectAndString();
        ConstructorsOfWrapperClasses();
    }
    public static void primitiveAndObject() {
        // Creating Integer wrapper class object
        Integer intObj = Integer.valueOf(10);
        int i = intObj.intValue(); // Unboxing
        System.out.println("Integer value: " + intObj);
        System.out.println("int value: " + i);

        // Creating Double wrapper class object
        Double doubleObj = Double.valueOf(20.5);
        double d = doubleObj.doubleValue(); // Unboxing
        System.out.println("Double value: " + doubleObj);
        System.out.println("double value: " + d);

        // Creating Character wrapper class object
        Character charObj = Character.valueOf('A');
        char c = charObj.charValue(); // Unboxing
        System.out.println("Character value: " + charObj);
        System.out.println("char value: " + c);

        // Creating Boolean wrapper class object
        Boolean boolObj = Boolean.valueOf(true);
        boolean b = boolObj.booleanValue(); // Unboxing
        System.out.println("Boolean value: " + boolObj);
        System.out.println("boolean value: " + b);
    }
    public static void primitiveAndString() {
        // Converting primitive to String
        int i = 10;
        String intStr = Integer.toString(i);
        System.out.println("String from int: " + intStr);

        double d = 20.5;
        String doubleStr = Double.toString(d);
        System.out.println("String from double: " + doubleStr);

        char c = 'A';
        String charStr = Character.toString(c);
        System.out.println("String from char: " + charStr);

        boolean b = true;
        String boolStr = Boolean.toString(b);
        System.out.println("String from boolean: " + boolStr);

        // Converting String to primitive
        String strInt = "30";
        int parsedInt = Integer.parseInt(strInt);
        System.out.println("Parsed int: " + parsedInt);

        String strDouble = "40.5";
        double parsedDouble = Double.parseDouble(strDouble);
        System.out.println("Parsed double: " + parsedDouble);

        String strBool = "false";
        boolean parsedBool = Boolean.parseBoolean(strBool);
        System.out.println("Parsed boolean: " + parsedBool);
    }
    public static void ObjectAndString() {
        // Converting Object to String
        Integer intObj = Integer.valueOf(50);
        String intStr = intObj.toString();
        System.out.println("String from Integer object: " + intStr);

        Double doubleObj = Double.valueOf(60.5);
        String doubleStr = doubleObj.toString();
        System.out.println("String from Double object: " + doubleStr);

        Character charObj = Character.valueOf('B');
        String charStr = charObj.toString();
        System.out.println("String from Character object: " + charStr);

        Boolean boolObj = Boolean.valueOf(false);
        String boolStr = boolObj.toString();
        System.out.println("String from Boolean object: " + boolStr);

        // Converting String to Object
        String strInt = "70";
        Integer parsedIntObj = Integer.valueOf(strInt);
        System.out.println("Integer object from String: " + parsedIntObj);

        String strDouble = "80.5";
        Double parsedDoubleObj = Double.valueOf(strDouble);
        System.out.println("Double object from String: " + parsedDoubleObj);

        String strChar = "C";
        Character parsedCharObj = Character.valueOf(strChar.charAt(0));
        System.out.println("Character object from String: " + parsedCharObj);

        String strBool = "true";
        Boolean parsedBoolObj = Boolean.valueOf(strBool);
        System.out.println("Boolean object from String: " + parsedBoolObj);
    }
    public static void ConstructorsOfWrapperClasses() {
        // Using constructors to create wrapper class objects
        Integer intObj = new Integer(90);
        System.out.println("Integer object using constructor: " + intObj);

        Double doubleObj = new Double(100.5);
        System.out.println("Double object using constructor: " + doubleObj);

        Character charObj = new Character('D');
        System.out.println("Character object using constructor: " + charObj);

        Boolean boolObj = new Boolean(true);
        System.out.println("Boolean object using constructor: " + boolObj);
    }
}
//Output:
//Integer value: 10
//int value: 10
//Double value: 20.5
//double value: 20.5
//Character value: A
//char value: A
//Boolean value: true
//boolean value: true
//String from int: 10
//String from double: 20.5
//String from char: A
//String from boolean: true


//Parsed int: 30
//Parsed double: 40.5
//Parsed boolean: false
//String from Integer object: 50
//String from Double object: 60.5
//String from Character object: B
//String from Boolean object: false
//Integer object from String: 70
//Double object from String: 80.5
//Character object from String: C
//Boolean object from String: true


//Integer object using constructor: 90
//Double object using constructor: 100.5
//Character object using constructor: D
//Boolean object using constructor: true