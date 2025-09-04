package k_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class B_Stream {

    static void A() {
        List<Integer> nums = Arrays.asList(1, 2, 5, 7);
        nums.stream().filter(new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {

                return t % 2 == 0;
                // throw new UnsupportedOperationException("Unimplemented method 'test'");
            }

        })
         .forEach(new Consumer<Integer>() {

                    @Override
                    public void accept(Integer t) {
                        System.out.println(t);
                        // throw new UnsupportedOperationException("Unimplemented method 'accept'");
                    }

                });

    }

    static void B() {
        List<Integer> nums = Arrays.asList(1, 2, 5, 7);
        nums.stream().reduce(new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer t, Integer u) {

                return t + u;
                // throw new UnsupportedOperationException("Unimplemented method 'apply'");
            }

        });

    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 5, 7);

                         // 1: Filtering

        A();
        nums.stream().filter(n -> n % 2 == 0).forEach(num -> System.out.println(num)); // same as A()

        // Filter even number
        List<Integer> evenNumber = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumber);

        // Transform elements in a list
        List<Integer> changeNumber = nums.stream().map(n -> n + 10).collect(Collectors.toList());
        System.out.println(changeNumber);

        
                          // 1: Reducing

        B();
        int sum = nums.stream().reduce(0, (a, b) -> a + b); // same as B()
        System.out.println(sum);

        //Find Maximum
        int max = nums.stream().reduce(Integer.MIN_VALUE, (a, b) -> a >= b ? a : b);
        System.out.println(max);

        //Find Minimum
        int min = nums.stream().reduce(Integer.MAX_VALUE, (a, b) -> a <= b ? a : b);
        System.out.println(min);

    }
}
