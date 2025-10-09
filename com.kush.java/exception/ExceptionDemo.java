package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Array index is out of bounds!");
        } finally {
            System.out.println("Finally block after ArrayIndexOutOfBoundsException");
        }

        try {
            int a = 10, b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero!");
        } finally {
            System.out.println("Finally block after ArithmeticException");
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: String is null!");
        } finally {
            System.out.println("Finally block after NullPointerException");
        }

        try {
            int num = Integer.parseInt("abc");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format!");
        } finally {
            System.out.println("Finally block after NumberFormatException");
        }

        try {
            FileInputStream file = new FileInputStream("");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: File not found!");
        } finally {
            System.out.println("Finally block after FileNotFoundException");
        }

        try {
            throwCustomException();
        } catch (Exception e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block after custom exception");
        }
    }

    // Method that declares throws
    public static void throwCustomException() throws Exception {
        throw new Exception("This is a custom exception thrown using throw new");
    }
}

//Output:
//ArrayIndexOutOfBoundsException: Array index is out of bounds!
//Finally block after ArrayIndexOutOfBoundsException
//ArithmeticException: Cannot divide by zero!
//Finally block after ArithmeticException
//NullPointerException: String is null!
//Finally block after NullPointerException
//NumberFormatException: Invalid number format!
//Finally block after NumberFormatException
//FileNotFoundException: File not found!
//Finally block after FileNotFoundException
//Custom Exception: This is a custom exception thrown using throw new
//Finally block after custom exception