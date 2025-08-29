
package d_Inheritance.nested_class.inner;

interface Car {
    void say();
}

public class OuterClass {

    private static int out_id;
    public String out_name;

    public void display() {
        System.out.printf("Id:%d, name:%s\n", out_id, out_name);
    }

    // non static inner class
    class InnerClass {
        public void accessOuter() {
            out_id = 102;
            out_name = "Alamgir from Inner Class";
            System.out.println("An inner class can access all members of the outer class");

        }
    }

    // Local inner class
    // define within a method. access and visiable within the block.
    public void createAndDisplayLocalClass() {
        class LocalInnerClass {
            public void display() {
                System.out.println("From Local Inner Class.");
            }
        }

        LocalInnerClass local = new LocalInnerClass();
        local.display();
    }

    // anonymous inner class
    Car c = new Car() {
        @Override
        public void say() {
            System.out.println("anynomous clas");
        }
    };

    /*
     c.say()
     cannot execute a statement (like c.say();) directly inside the class body. execute with the constructor ,method ...
     */
    public void testAnonymous() {
        c.say(); 
    }

}
