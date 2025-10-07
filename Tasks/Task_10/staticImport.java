package Task_10;

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Math.*;

public class staticImport {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        kp(sqrt(n1));
        kp(pow(n1, 2));
    }

    public static void kp(Object str) {
        out.println(str);
    }
}
//Input:
//16

//Output:
//4.0
//256.0