public class C_stackTrace {

    static void method1() {
        method2(null);
    }

    static void method2(String name) {
        try {
            int result = 10 / 0; // Causes ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        finally{
            System.out.println("Always Executed");
        }
    }

    public static void main(String[] args) {
        method1();
    }
}

/* 
A stack trace is a report showing where an exception occurred.
    1. It includes:
        Exception type
        Error message
        Call stack (method calls that led to the error)
    2. The call stack follows LIFO (Last-In, First-Out) order.
*/

/*
 * Exception in thread "main" java.lang.ArithmeticException: / by z
    * stack.method2(c_stack.java:8)
    * stack.method1(c_stack.java:4)
    * stack.main(c_stack.java:12)
 */