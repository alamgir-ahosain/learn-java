import java.util.HashSet;

public class Test {
    public static void main(String[] args) {

        Car c1 = new Car("Green", 10);
        Car c2 = new Car("Green", 11);

        if (c1.hashCode() != c2.hashCode()) {
            System.out.println("All Fields are not equal");
        } else {
            // System.out.println(c1 == c2 ? true : false);
            // System.out.println(c1.equals(c2)); // false,if not override
            System.out.println(c1.equals(c2)); // override the equal

        }

        // Hash Collisions
        String s1 = "FB";
        String s2 = "Ea";
        System.out.println(s1.hashCode()); // 2236
        System.out.println(s2.hashCode()); // 2236 (same hash!)
        System.out.println(s1.equals(s2)); // false

        
        HashSet<Car> set = new HashSet<>();
        Car car1 = new Car("Red", 10);
        Car car2 = new Car("Red", 10);

        set.add(car1);
        set.add(car2); // might add duplicate if hashCode() is not overridden
        System.out.println(set.size()); // could be 2 instead of 1

    }
}
