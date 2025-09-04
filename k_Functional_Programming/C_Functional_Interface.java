package k_Functional_Programming;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
    1. Single Abstract Method (SAM) : Only one abstract method, but can have many default or static methods.
    2. Lambda Compatibility : Provide the target type for lambdas and method references.
    3. @FunctionalInterface Annotation : Optional, but ensures the interface is truly functional.
Examples → Predicate, Consumer, BinaryOperator, Runnable, Callable, Comparator, or custom interfaces with 
 
*/
public class C_Functional_Interface {

    public static void main(String[] args) {

        Predicate<Integer> isPositive = num -> num > 0;
        System.out.println(isPositive.test(12)); // true
        System.out.println(isPositive.test(-12)); // false

        Consumer<String> print = msg -> System.out.println(msg);
        print.accept("Alamgir");

        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 2));

    }
}