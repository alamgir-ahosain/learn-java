import java.lang.ref.Reference;

class Parent {
    void parentMethod() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Child Method");
    }
}

public class SimpleCasting {

    public static void main(String[] args) {

        // upcasting
        Parent p = new Child(); // Child object reference
        p.parentMethod();
        // p.childMethod(); // Not allowed: compile-time error

        // Downcasting
        if (p instanceof Child) { //safe check
            Child c = (Child) p;
            c.childMethod();
            c.parentMethod();
        }

        // --- Invalid Downcasting ---
        // Child c2 = (Child) new Parent(); // Compile-time error: cannot cast
    }
}