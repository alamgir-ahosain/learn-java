public class TernaryOperator {
    public static void main(String[] args) {

        // condition ? expression1 : expression2;
        int a = 10;
        int b = 12;
        int max = a > b ? a : b;
        System.out.println(max);

        //equivalent to
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println(max);

    }
}