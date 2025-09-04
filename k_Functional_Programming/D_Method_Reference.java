package k_Functional_Programming;

import java.util.Arrays;
import java.util.List;

/*
 
                         Method References in Java
                1. Syntax & Usage → Use :: (double colon). 
                Example: System.out::println ;refers to the println method of the System.out object.
                2. Functional Interfaces → Always used with functional interfaces (e.g., Consumer, Predicate).
                3. Benefit → Makes code cleaner, concise, and more readable.
                4. Limitation → Works only when method signature matches the functional interface’s abstract method.
       Syntax 
        1. Static Method References :   className::staticMethodName
        2. Instance Method :    instance::instanceMethodName
        3. Instance method particuler class : ClassName::methodName
        4. Constructor References : ClassName::new             

         Lamda Expression                Method Reference  
        str->str.TolowerCase()           String::toLowerCase
        str.toLowerCase()                String::toLowerCase
        (a,b)->a.compareTo(b)            Integer::compareTo / String.compareTo
        (a,b)->Person.compareByAge(a,b)  Person::compareByAge
 */
public class D_Method_Reference {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3);

        // use method reference
        nums.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
        nums.stream().filter(num -> num % 2 == 0).forEach(num -> System.out.println(num));

        int sum = nums.stream().reduce(0, (a, b) -> a + b);
        int sum2 = nums.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println(sum2);

    }
}
