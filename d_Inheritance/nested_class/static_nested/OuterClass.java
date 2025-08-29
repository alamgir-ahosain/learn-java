package d_Inheritance.nested_class.static_nested;

public class OuterClass {

    private static int out_id;
    public String out_name;

    public void display() {
        System.out.printf("Id:%d, name:%s\n", out_id, out_name);
    }

   
    public static class StaticNestedClass {
        // private String sn_name;
        // private int sn_id;

        public void accessOuter() {
            out_id = 12; // can be access beacuse it's static
            // out_name="Alamgir"; //can't be access beaucse it's non static
            System.out.println("Static Nested Class has accessed and modified the outer static variable 'out_id'.");

        }

    }
}