package b_multilevel;

class GrandParent {
    protected int gp_id;

    GrandParent(int id) {
        this.gp_id = id;
        System.out.println("Grand Parent Constructor");
    }

    void show() {  System.out.println("Grand Parent ID:" + gp_id);}
    final void finalMethod() {  System.out.println("Cannot be Override !"); }
}

class Parent extends GrandParent {
    protected int p_id;

    Parent(int pid, int gpd) {
        super(gpd); //call grand Parent constructor
        this.p_id = pid;
        System.out.println("Parent Constructor");
    }

    @Override // Can’t override final, static, or private methods.
    void show() {
        super.show(); // call Grand parent method
        System.out.println("Grand Parent ID:" + super.gp_id); // Access Grand parent variables
        System.out.println("Parent ID:" + p_id);
    }
    
}

class Child extends Parent {
    private int c_id;

    Child(int cid, int pid, int gpd) {
        super(pid, gpd); // call parent constructor
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


                // Child->Parent->GrandParent   
public class Multilevel {

    public static void main(String[] args) {

        Child c = new Child(12, 10, 8);
        c.show(); // override parent method
        c.finalMethod(); // inheritate method

    }
}
