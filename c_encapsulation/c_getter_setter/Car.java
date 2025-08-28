package c_Encapsulation.c_getter_setter;

public class Car {
    private String color;
    private int fuelAmount;
    private double speed;

    public Car(String color, int fuelAmount, double speed) {
        this.color = color;
        this.fuelAmount = fuelAmount;
        this.speed = speed;
    }
    public Car(){}

    public String getColor() {return color;}
    public int getFuelAmount() {  return fuelAmount;}
    public void setFuelAmount(int i){this.fuelAmount=i;}

}
