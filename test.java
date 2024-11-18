public class SafeIntegerOperations {
    public static void main(String[] args) {
        try {
            int x1 = 1234567;
            int x2 = 1234567;

            int result = Math.multiplyExact(x1, x2);,
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Integer Overflow");
        }
    }
}
