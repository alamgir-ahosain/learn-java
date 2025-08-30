package e_polymorphism.run_time;

interface Parent {
    void show(); // abstract method(by default public and abstract)
}

class Child1 implements Parent {
    @Override
    public void show() {
        System.out.println("Child1");
    }
}

class Child2 implements Parent {
    @Override
    public void show() {
        System.out.println("Child2");
    }
}

public class Method_Overriding {

    // The method that gets executed is determined at runtime.
    // If a Child1 object is passed, Child1.show() is called.
    // If a Child2 object is passed, Child2.show() is called.
    public static void checkRunTime(Parent p) {
        p.show();

    }

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        checkRunTime(c1);
        Child2 c2 = new Child2();
        checkRunTime(c2);

        Parent p = new Child1();
        p.show(); //JVM(Java Virtual Machine) calls Child1.show() at runtime
    }
}
