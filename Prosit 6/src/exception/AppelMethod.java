package exception;

public class AppelMethod {

    public void method1() {
        try {
            this.method2();
        } catch (StackOverflowError e) {
            System.out.println("Caught a StackOverflowError. Recursive method calls exceeded the stack limit.");
        }
    }

    public void method2() {
        try {
            this.method1();
        } catch (StackOverflowError e) {
            System.out.println("Caught a StackOverflowError. Recursive method calls exceeded the stack limit.");
        }
    }

    public static void main(String[] args) {
        AppelMethod appel = new AppelMethod();
        appel.method1();
    }
}
