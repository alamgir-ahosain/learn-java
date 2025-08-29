import java.util.Objects;

public class Car {

    private String color;
    private int fuelAmount;

    @Override
    public int hashCode() {
        // return super.hashCode();
        return Objects.hash(color,fuelAmount);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car)) {
            return false;
        }
        Car c = (Car) obj;
        return c.color.equals(color) && c.fuelAmount == fuelAmount;
        // → "Green".equals("Green") → true
    }

    public Car(String color, int fuelAmount) {
        this.color = color;
        this.fuelAmount = fuelAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

}
