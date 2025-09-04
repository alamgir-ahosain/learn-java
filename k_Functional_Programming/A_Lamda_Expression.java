package k_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class A_Lamda_Expression {

    protected static int sum(int a, int b) {
        return a + b;
    }

     static void mainWay() {
        List<Integer> nums = Arrays.asList(1, 2, 5, 7);

        nums.stream().forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {
                System.out.println(t);
                throw new UnsupportedOperationException("Unimplemented method 'accept'");
            }

        });

    }

    public static void main(String[] args) {

        System.out.println(sum(10, 2));

        /*
          (int a,int b)->a+b;
          (int num)->num%2==0;
          (String name)->System.out.println(name);
          (String s1,String s2)->s1.length()-s2.length();
          ()->System.out.println("Runnable with lamda parameters");
         */

        List<Integer> nums = Arrays.asList(1, 2, 5, 7);

        // traditional loop
        for (int num : nums) {
            System.out.println(num);
        }

        // Using Functional Programming
        mainWay();
        nums.forEach(num -> System.out.println(num)); // same as mainWay()

        nums.sort((a, b) -> b.compareTo(a)); // Filter elements in a list:

    }
}
