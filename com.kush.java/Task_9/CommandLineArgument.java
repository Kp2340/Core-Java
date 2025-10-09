package Task_9;

public class CommandLineArgument {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide input as command line arguments.");
            return;
        }
        System.out.println("Argument:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
//Input: 123 1234 ABC abc
//Output:
//Argument:
//123
//1234
//ABC
//abc