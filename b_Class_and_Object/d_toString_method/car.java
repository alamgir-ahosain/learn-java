
/*
    string representation of an object
    it's inherited from the object class.
    by default ,return className+@+hashCode
    override the class
    automatically called in string concatanation.
 */
package b_Class_and_Object.d_toString_method;

public class car {
    String color = "GREEN";
    int fuelLevel;
    float speed;

    public String toString() {
        return "Car{" +
                "color:'" + color + '\'' +
                ",fuelLevel:" + fuelLevel +
                ",speed:" + speed +
                '}';
    }

    public static void main(String[] args) {
        car c = new car();
        // System.out.println(c.toString()); // default if not implement toString()
        // b_Class_and_Object.d_toString_method.car@7ad04(object+@+hash code)

        System.out.println(c); // by default call toString()
        System.out.println(c.toString());

    }

}