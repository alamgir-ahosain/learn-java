package e_Abstruction.interfaces;

// Parent Interface1
interface Parent1 {
    void showParent1(); // abstract method(by default public and abstract)
}

// Parent Interface2
interface Parent2 {
    void showParent2();

    // default method
    default void defaultMethod() {
        System.out.println("default Method from Parent2");
    }

    // static method
    static void staticMethod() {
        System.out.println("Static Method from parent2");
    }
}

// Child class implements both interfaces: Multiple Inheritance
class Child implements Parent1, Parent2 {

    @Override
    public void showParent1() {
        System.out.println("Child implements showParent1() from parent1 ");
    }

    @Override
    public void showParent2() {
        System.out.println("Child implements showParent2() from parent1 ");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Child implements defaultMethod() from parent1 ");
    }

    // cannot be overriden
    public void staticMethod() {
        System.out.println("Child implements staticMethod() from parent2 ");
    }

}

public class Interface {
    public static void main(String[] args) {
        Child c = new Child();
        c.showParent1();
        c.defaultMethod();
        c.staticMethod();

        Parent2.staticMethod(); // calling static method from interface

    }
}
