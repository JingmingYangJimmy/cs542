//Wenpei Shao  and Jingming Yang
//wshao33          jyang668

/*
 * This class test the overflow exception in four arithmetic notation
 * 
 */
public class NumericErrors {

    /*
     * Takes two integers x and y, returns their sum(x+y). Throws an
     * ArithmeticException in case of overflow.
     */
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

    /*
     * Take two integers x and y, return their difference(x-y). Throws an
     * ArithmeticException in case of overflow.
     */
    public static int subtract(int x, int y) throws ArithmeticException {
        // Use add function to check for overflow
        return add(x, -y);
    }

    /*
     * Take two integers x and y, return their multiplication(x*y). Throws an
     * ArithmeticException in case of overflow.
     */
    public static int multiply(int x, int y) throws ArithmeticException {// it is harder than sum or difference since
                                                                         // the result
        // will be more difficult to calculate and also need to consider sign
        if (y > 0 && x > Integer.MAX_VALUE / y) {
            throw new ArithmeticException("Positive overflow detected in multiplication");
        }
        if (y < 0 && x < Integer.MIN_VALUE / y) {
            throw new ArithmeticException("Negative overflow detected in multiplication");
        }
        return x * y;
    }

    /*
     * Take two integers x and y, return their quotient (x/y). Throws an
     * ArithmeticException in case of overflow.
     */
    public static int divide(int x, int y) throws ArithmeticException { // overflow detection is necessary
        // Integer.MIN_VALUE is -2147483648 and Integer.MAX_VALUE is 2147483647 so when
        // min_value divide by -1
        // it will cause an overflow
        if (y == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if (x == Integer.MIN_VALUE && y == -1) {
            throw new ArithmeticException("Overflow detected in division");
        }
        return x / y;
    }

    /*
     * Having tests here. This is the main method
     */
    public static void main(String[] args) {
        // Test cases can be added here
    }
}
