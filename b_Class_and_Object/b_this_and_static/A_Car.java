
package b_Class_and_Object.b_this_and_static;


public class A_Car {
    static String color;
    int fuelLevel;
    float speed;

    public void addFuel(int f) {
        this.fuelLevel += f;
    }

    public A_Car start() {
        if (fuelLevel == 0) {
            System.out.println("out of fuel!");
        } else {
            System.out.println("Car is started..");

        }
        return this; // Refer to the current class instance variable
    }

    public void drive() {
        fuelLevel--;
        System.out.println("Car is driving");
        System.out.println("Fule Level is Now: " + fuelLevel);

    }

}