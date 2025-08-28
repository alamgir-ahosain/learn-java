
/*
    *when applied to an variable ,variable become an Constant.
    final variable must be inilize before the constructor completes.
    convention: declared in capital letter 
 */
package b_Class_and_Object.f_Final_Keyword;

public class car {
    final String COLOR; // declared but NOT initialized here
    int fuelLevel;
    float speed;

    car(String s) {
        this.COLOR = s; // it's allowed – assigned exactly once
    }

    public String toString() {
        return "Car{" +
                "color:'" + COLOR + '\'' +
                ",fuelLevel:" + fuelLevel +
                ",speed:" + speed +
                '}';
    }

    public static void main(String[] args) {
        car c = new car("GREEN");
        // c.COLOR="RED"; //The final field car, COLOR cannot be reassigned
        System.out.println(c.toString());

    }

}