package c_hirarchical;
class Parent {
    protected int p_id;

    Parent(int id) {
        this.p_id = id;
        System.out.println("Parent Constructor");
    }
    void show() {System.out.println("Parent ID:" + p_id);}
    final void finalMethod() {  System.out.println("Cannot be Override !");}
}

class Child1 extends Parent {
    private int c1_id;

    Child1(int cid, int pid) {
        super(pid); // call parent constructor
        this.c1_id = cid;
        System.out.println("Child1 Constructor");
    }

    @Override // Can’t override final, static, or private methods.
    void show() {
        super.show(); // call parent method
        System.out.println("Parent ID:" + super.p_id); // Access parent variables
        System.out.println("Child1 ID:" + c1_id);
    }

}

class Child2 extends Parent {
    private int c2_id;

    Child2(int cid, int pid) {
        super(pid); // call parent constructor
        this.c2_id = cid;
        System.out.println("Child2 Constructor");
    }

    @Override // Can’t override final, static, or private methods.
    void show() {
        super.show(); // call parent method
        System.out.println("Parent ID:" + super.p_id); // Access parent variables
        System.out.println("Child2 ID:" + c2_id);
    }

}

public class Hirarchical {

    public static void main(String[] args) {

      
        Child1 c1 = new Child1(12, 10);
        c1.show(); // override parent method
        c1.finalMethod(); // inheritate method


        Child2 c2 = new Child2(12, 10);
        c2.show(); // override parent method
        c2.finalMethod(); // inheritate method

    }
}
