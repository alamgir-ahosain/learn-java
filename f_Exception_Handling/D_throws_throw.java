public class D_throws_throw {

    /*
        Throws -> Declares that a method might throw an exception.
        Throw -> Used to manually throw an exception and and triggered from any keyword or block of code.
     */
    static void divide(int a, int b) throws ArithmeticException { //this method might through an exception
        if (b == 0) {
            // Manually throwing the exception
            throw new ArithmeticException("Cannot divide by Zero");
        }
        int result = a / b;
        System.out.println(result);

    }

    public static void main(String[] args) {

        try {
            divide(10, 0); // ArithmeticException
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
