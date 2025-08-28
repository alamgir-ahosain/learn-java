
package c_Encapsulation.b_access_modifier.pkg1;

public class Car_Public {

    public String color;
    private int fuelAmount;
    double speed;

    public Car_Public(String color, int fuelAmount, double speed) {
        this.color = color;
        this.fuelAmount = fuelAmount;
        this.speed = speed;
    }

    public Car_Public() {

    }

    @Override
    public String toString() {
        return "Car_Public [color=" + color + ", fuelAmount=" + fuelAmount + ", speed=" + speed + "]";
    }

    public static void main(String[] args) {

    }

}
