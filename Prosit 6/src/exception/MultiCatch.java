package exception;

public class MultiCatch {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println("No Of Arguments = " + a);
            int b = 42 / a;

            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: Array index is out of bounds.");
        }
    }
}
