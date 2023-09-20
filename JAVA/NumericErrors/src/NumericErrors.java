public class NumericErrors {

    public static int add(int x, int y) throws ArithmeticException {
        // Check for positive overflow
        if (x > 0 && y > 0 && x > Integer.MAX_VALUE - y) {
            throw new ArithmeticException("Positive overflow detected in addition");
        }
        // Check for negative overflow
        if (x < 0 && y < 0 && x < Integer.MIN_VALUE - y) {
            throw new ArithmeticException("Negative overflow detected in addition");
        }
        return x + y;
    }

    public static int subtract(int x, int y) throws ArithmeticException {
        // Use add function to check for overflow
        return add(x, -y);
    }

    public static int multiply(int x, int y) throws ArithmeticException {
        if (y > 0 && x > Integer.MAX_VALUE / y) {
            throw new ArithmeticException("Positive overflow detected in multiplication");
        }
        if (y < 0 && x < Integer.MIN_VALUE / y) {
            throw new ArithmeticException("Negative overflow detected in multiplication");
        }
        return x * y;
    }

    public static int divide(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if (x == Integer.MIN_VALUE && y == -1) {
            throw new ArithmeticException("Overflow detected in division");
        }
        return x / y;
    }

    public static void main(String[] args) {
        // Test cases can be added here
    }
}
