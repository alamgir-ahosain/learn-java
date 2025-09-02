package h_Collection_and_Generics;

import java.util.*;

public class C_collection {

    static <obj> void print(Collection<obj> collection) {
        for (obj c : collection) {
            System.out.printf("%s ", c);
        }
        System.out.println();
    }

    static void ListFunc() {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10); // Add element at end
        numbers.add(0, 5); // Add element at index 0

        int firstNumber = numbers.get(0); // Get element at index 0

        numbers.set(0, 15); // Update element at index 0

        int removedNumber = numbers.remove(0); // Remove element at index 0

        int totalNumbers = numbers.size(); // Get number of elements
        boolean isEmpty = numbers.isEmpty(); // Check if list is empty
        boolean hasTen = numbers.contains(10); // Check if element exists

        print(numbers);

    }

    static void QueueFunc() {

        Queue<Integer> q = new LinkedList<>();
        q.add(1); // Insert element, throws exception if fails
        q.offer(2); // Insert element, returns false if fails

        int h = q.peek(); // View head, returns null if empty
        int th = q.poll(); // Remove and return head, null if empty
        int t = q.element(); // View head, exception if empty
        int r = q.remove(); // Remove and return head, exception if empty

        print(q);

    }

    static void SetFunc() {
        Set<Integer> s = new HashSet<>();

        s.add(10); // Add element
        s.add(10); // Duplicate ignored

        boolean contain_10 = s.contains(10); // Check if element exists
        boolean removedT_20 = s.remove(20); // Remove element
        int totalNumbers = s.size(); // Get number of elements
        boolean isEmpty = s.isEmpty(); // Check if set is empty
        System.out.println(s); // Print all elements

    }

    static void MapFunc() {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One"); // Insert key-value pair
        map.put(2, "Two"); // Insert another pair
        map.putIfAbsent(2, "New");// Insert only if key not present

        map.get(1); // Get value by key
        map.getOrDefault(3, "NA");// Get value or default if key missing

        map.containsKey(2); // Check if key exists
        map.containsValue("Two"); // Check if value exists

        map.remove(1); // Remove entry by key
        map.replace(2, "Second"); // Replace value for a key

        map.size(); // Get number of entries
        map.isEmpty(); // Check if map is empty

        map.keySet(); // Get all keys
        map.values(); // Get all values
        map.entrySet(); // Get all key-value pairs

    }

    public static void main(String[] args) {
        ListFunc();
        QueueFunc();
        SetFunc();
        MapFunc();
    }
}
