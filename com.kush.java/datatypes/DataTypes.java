package datatypes;

public class DataTypes {
    public static void main(String[] args) {
        Byte a = 121;         // -128 to 127
        Short b = 22311;      // -32768 to 32767
        Integer c = 3132321;  // -2^31 to 2^31-1
        Long d = 42331423432L;// -2^63 to 2^63-1
        Character e = 'A';    // 0 to 65535
        Float f = 1.233f;     // +-3.40282347E+38F
        Double g = 11121.4212;// +-1.79769313E+308
        Boolean h = true;     // true, false

        //Implicit type casting
        //rank double > float > long > int > char > short > byte
        int i = a; // byte to int
        long j = b; // short to long
        float k = c; // int to float
        double l = d; // long to
        // Ascii value of character
        int m = e; // char to int
        double n = f; // float to double

        System.out.println("Implicit Type Casting:");
        System.out.println(a + "Byte to Int: " + i);
        System.out.println(b + "Short to Long: " + j);
        System.out.println(c + "Int to Float: " + k);
        System.out.println(d + "Long to Double: " + l);
        System.out.println(e + "Char to Int (Ascii value): " + m);
        System.out.println(f + "Float to Double: " + n);

        //Explicit type casting
        // int 127 = byte 127
        // int 128 = byte -128 (overflow)
        // int 129 = byte -127 (overflow)
        // int 130 = byte -126 (overflow)
        byte o = (byte) (130); // int to byte
        short p = (short) j; // long to short
        int q = (int) k; // float to int
        long r = (long) l; // double to long
        char s = (char) m; // int to char
        float t = (float) n; // double to float
        System.out.println("\nExplicit Type Casting:");
        System.out.println("Int 130 to Byte (overflow): " + o);
        System.out.println(j + "Long to Short (possible overflow): " + p);
        System.out.println(k + "Float to Int: " + q);
        System.out.println(l + "Double to Long: " + r);
        System.out.println(m + "Int to Char: " + s);
        System.out.println(n + "Double to Float (possible precision loss): " + t);
    }
}
//Output:
//Implicit Type Casting:
//        121Byte to Int: 121
//        22311Short to Long: 22311
//        3132321Int to Float: 3132321.0
//        42331423432Long to Double: 4.2331423432E10
//AChar to Int (Ascii value): 65
//        1.233Float to Double: 1.2330000400543213
//
//Explicit Type Casting:
//Int 130 to Byte (overflow): -126
//        22311Long to Short (possible overflow): 22311
//        3132321.0Float to Int: 3132321
//        4.2331423432E10Double to Long: 42331423432
//        65Int to Char: A
//1.2330000400543213Double to Float (possible precision loss): 1.233