package h_Collection_and_Generics;

class specificClass {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}

class GenericClass<T> {
    private T thing;

    public T getThing() {
        return thing;
    }

    public void setThing(T thing) {
        this.thing = thing;

    }

}

public class F_Generics_DimondOperation {
    public static void main(String[] args) {

        // Using specificClass (only works with String)
        specificClass s = new specificClass();
        s.setName("Alamgir");
        System.out.println(s.getName());

        // Using GenericClass with String
        GenericClass<String> g1 = new GenericClass<>();
        g1.setThing("Alamgir");
        System.out.println(g1.getThing());

        // Using GenericClass with Integer
        GenericClass<Integer> g2 = new GenericClass<>();
        g2.setThing(12);
        System.out.println(g2.getThing());

    }
}
