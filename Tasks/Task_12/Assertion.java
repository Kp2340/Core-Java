package Task_12;

public class Assertion {
    public static void main(String[] args) {
        int withdrawalAmount = -500; // Example amount
        assert withdrawalAmount > 0 : "Withdrawal amount must be positive";
        System.out.println("Withdrawal amount is valid: " + withdrawalAmount);
    }
}
//Output:
//Exception in thread "main" java.lang.AssertionError: Withdrawal amount must be positive
//at Task_12.Assertion.main(Assertion.java:6)