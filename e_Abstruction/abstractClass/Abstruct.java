
// Abstract Parent class
abstract class Parent {
    private String name;

    Parent(String p) {
        this.name = p;
        System.out.println("Parent Constructor");
    }

    // Abstract method (doesn't have a body)
    abstract void showInfo();

    // Concrete method (has a body)
    void showParentName() {
        System.out.println("Parent Name: " + name);
    }

}

class Child extends Parent {

    private String name;

    Child(String c, String p) {
        super(p);
        this.name = c;
        System.out.println("Child Constructor");

    }

    // Implementation of abstract method
    @Override
    void showInfo() {
        System.out.println("Child Name :" + name);
    }
}

public class Abstruct {
    public static void main(String[] args) {
        Child c = new Child("Child", "Parent");
        c.showInfo(); // abstract method
        c.showParentName();// non abstruct method

        // Parent p = new Parent("Parent"); //not allowed
        Parent p = new Child("Ch", "pa"); // alowed
        p.showInfo();
        p.showParentName();
    }
}