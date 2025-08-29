package d_Inheritance.nested_class.static_nested;

public class Test {
    public static void main(String[] args) {

        OuterClass out = new OuterClass();

        // Test Static Nested  Class
        OuterClass.StaticNestedClass sn = new OuterClass.StaticNestedClass();
        out.out_name = "Alamgir";
        sn.accessOuter();
        out.display();

    }
}
