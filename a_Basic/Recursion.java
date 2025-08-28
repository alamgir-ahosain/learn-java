

/*
    self calling  function.
    Base case: stop recurtion and prevent infinit loops.
    Recursive call: where the function makes a recursive call.
    stack overflow risk: execessive recursion can cause stack overflow errors.
 */
public class Recursion {

    public static long factorial(int num) {
        if (num == 1) { return 1; } 
        else { return num * factorial(num-1); }
    }

    public static void main(String[] args) {

        int num = 10;

        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        System.out.println(factorial(num));

    }
}
