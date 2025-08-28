
package b_Class_and_Object.a_basic;

public class A_Car {
    String color;
    int fuelLevel;
    float speed;

    public void addFuel(int f) {
        this.fuelLevel += f;
    }

    public void start() {
        if (fuelLevel == 0) {
            System.out.println("out of fuel!");
        } else {
            System.out.println("Car is started..");

        }
    }

    public void drive() {
        fuelLevel--;
        System.out.println("Car is driving");
        System.out.println("Fule Level is Now: " + fuelLevel);

    }

}