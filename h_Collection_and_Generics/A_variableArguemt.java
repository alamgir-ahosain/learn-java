public class A_variableArguemt {

    static void addOverloading(int a, int b) {
        int sum = a + b;
        System.out.println(sum);

    }

    static void addOverloading(int a[]) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void add(int firstNum, int... a) {
        int sum = firstNum;
        for (int i : a) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        // with function overloading
        addOverloading(10, 20);
        addOverloading(new int[] { 4, 5, 1 });

        add(12, 5);
        add(12, new int[] { 4, 5, 1 });

    }
}
/*
           _________ Java Variable Argument_________
    1. Allow method to accept any number of Arguments.
    2. Declared using an ellipsis(...) 
        example: void add(int ...nums)
    3.Treated as array . 
        example: int ... nums is int [] nums  
    4.Placement: Must be last in the methods parameter.  
 */