package d_Inheritance.nested_class.inner;

public class Test {
    public static void main(String[] args) {



        // Test Inner Class(non static inner class)
        OuterClass out = new OuterClass();
        OuterClass.InnerClass in1 = out.new InnerClass();
        in1.accessOuter();
        out.display();

        //Test Local Inner Class
        out.createAndDisplayLocalClass();
        
        //Test anonymous inner class
        out.testAnonymous();
        

    }
}
