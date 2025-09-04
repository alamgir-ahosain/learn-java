package k_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class F_Optional_example {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 5, 3);

        // Max
        Optional<Integer> maxNumber = nums.stream().max(Integer::compareTo);
        maxNumber.ifPresent(System.out::println);

        // Min
        Optional<Integer> minNumber = nums.stream().min(Integer::compareTo);
        minNumber.ifPresent(System.out::println);

        // collect to List
        List<String> names = Arrays.asList("Alamgir", "Hosain");
        List<String> collectionNames = names.stream().collect(Collectors.toList());
        System.out.println(collectionNames);

        // Distinct
        List<String> distinctName = names.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctName);

        // Convert to Uppercase
        List<String> upperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);

    }
}
