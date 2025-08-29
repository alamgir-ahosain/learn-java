package a_single;
class Parent {
    protected int p_id;

    Parent(int id) {
        this.p_id = id;
        System.out.println("Parent Constructor");
    }

    void show() {System.out.println("Parent ID:" + p_id);}
    final void finalMethod() {  System.out.println("Cannot be Override !");}
}

class Child extends Parent {
    private int c_id;

    Child(int cid, int pid) {
        super(pid); // call parent constructor
        this.c_id = cid;
        System.out.println("Child Constructor");
    }

    @Override // Can’t override final, static, or private methods.
    void show() {
        super.show(); // call parent method
        System.out.println("Parent ID:" + super.p_id); // Access parent variables
        System.out.println("Child ID:" + c_id);
    }

}

public class Single {

    public static void main(String[] args) {

        Parent p = new Parent(10);
        p.show();
        p.finalMethod();

        Child c = new Child(12, 10);
        c.show(); // override parent method
        c.finalMethod(); // inheritate method

    }
}
