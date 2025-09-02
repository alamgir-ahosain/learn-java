package h_Collection_and_Generics;

public class B_wrapperClass {
    public static void main(String[] args) {
        // Integer val=new Integer("12");
        Integer val = 55;
        System.out.println(val);
        System.out.println(val.hashCode());
        System.out.println(val.floatValue());

    }
}

/*
     _________ Wrapper class_________

object
    1.Boolean
    2.Character
    3.number:Byte ,Short,Integer,Long,Float,Double           

    1. Purpose: Let primitive types (int, char, boolean, etc.) be used as objects.
    2. Autoboxing/Unboxing: Automatically converts between primitives and their wrapper objects.
    3. Immutability: Once created, wrapper objects cannot be changed.
    4. Utility Methods: Provide helpful methods like valueOf() and parseXxx() (e.g., parseInt).
    5. Collections: Needed to store primitives in collections like ArrayList or HashMap.
    5. Null Values: Can assign null to wrapper objects, unlike primitives.

 */