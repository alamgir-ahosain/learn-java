package h_Collection_and_Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class D_collections_class {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1));

        Collections.sort(numbers); // Sort list: [1, 2, 5, 8]
        Collections.reverse(numbers); // Reverse list: [8, 5, 2, 1]
        Collections.shuffle(numbers); // Shuffle randomly
        int max = Collections.max(numbers); // Get maximum value
        int min = Collections.min(numbers); // Get minimum value

        System.out.println(numbers);
        System.out.println("Max: " + max + ", Min: " + min);

    }
}
