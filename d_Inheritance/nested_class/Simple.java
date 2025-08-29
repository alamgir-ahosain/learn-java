package d_Inheritance.nested_class;

public class Simple {

    class InnerClass {
        public void display() {
            System.out.println("Non Static Nested Class or Inner Class.");
        }
    }

    static class StaticNestedClass {
        public void display() {
            System.out.println("Static Nested Class");
        }
    }

    public static void main(String[] args) {

        // Test Inner Class
        Simple out1 = new Simple();
        Simple.InnerClass in = out1.new InnerClass();
        in.display();

        // Test Static Nested Class
        Simple.StaticNestedClass sn = new Simple.StaticNestedClass();
        sn.display();

    }

}
