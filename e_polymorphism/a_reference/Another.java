interface Parent {
    void show();
}

class Child1 implements Parent {
    @Override
    public void show() {
        System.out.println("Chil1");
    }
}

class Child2 implements Parent {
    @Override
    public void show() {
        System.out.println("Child2");
    }
}

public class Another {
    public static void testCasting(Parent p) {

        if (p instanceof Child1) {
            System.out.println("Safe Check for Child1");
            p.show();
        } else {
            Child2 c = (Child2) p;
            c.show();
            System.out.println("not Child1");
        }
    }

    public static void main(String[] args) {
        
        Child1 c1 = new Child1();
        testCasting(c1);
        
        Child2 c2 = new Child2();
        testCasting(c2);

    }
}
