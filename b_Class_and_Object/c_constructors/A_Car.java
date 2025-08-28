
package b_Class_and_Object.c_constructors;

public class A_Car {
    String color;
    int fuelLevel;
    float speed;

    A_Car() {
        System.out.println("No argument type Constructor");
        this("black",13,(float) 1.1);  //called A_Car(c,f,s)
    }
    

    A_Car(String c, int f, float s) {
        System.out.println("Parameterized Constructor");
        this.color = c;
        this.fuelLevel = f;
        this.speed = s;
    }

    A_Car(A_Car a) {
        System.out.println("Copy Constructor");
        this.color = a.color;
        this.fuelLevel = a.fuelLevel;
        this.speed = a.speed;
    }

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

    public void printDetails() {
        System.out.println(color + " ," + fuelLevel + " ," + speed);
    }

}