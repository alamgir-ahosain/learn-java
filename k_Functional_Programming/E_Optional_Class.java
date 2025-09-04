package k_Functional_Programming;

import java.util.Optional;

/*
 
                Optional Class
Purpose: To avoid NullPointerException and represent a value that may or may not be present.
Package: java.util.Optional

Key Methods:
    1. Creating Optional Objects
      1. Optional.empty()  : create an empty Optional
      2. Optional.of()    : create Optional with non-null value
      3. Optional.ofNullable() : ofNullable(value) → create Optional with nullable value

    2.Checking Value Presence
      1. isPresent()  :check if value exists
      2. ifPresent() : run action if value exists

    3.Default Values 
     1. orElse()  : return value or default if empty
     2. orElseGet() :Returns the value if present Otherwise, calls a Supplier function to provide a value.

    4.Value Transformation: map()
    5.Throwing Exception: orElseThrow(), throw exception if empty.
 */
public class E_Optional_Class {
    public static void main(String[] args) {

        // Creating Optional Object
        Optional<String> name = Optional.empty();
        Optional<String> name2 = Optional.of("Alamgir");
        Optional<String> name3 = Optional.ofNullable(null);

        // Checking presence of Value
        if (name2.isPresent()) {
            System.out.println("value is Present");
        }

        // Using orElase to provies a fallback
        String name4 = name.orElse("Default Value");

        // Using ifPresent to perform an action if value is present
        name2.ifPresent(System.out::println);

    }
}
