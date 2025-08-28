package c_Encapsulation.c_getter_setter;

public class Test {
    public static void main(String[] args) {

        Car c1 = new Car("GREEN", 12, 12.12);
        System.out.printf("Color: %s ,fuelAmount :%s\n", c1.getColor(), c1.getFuelAmount());

          
        Car c2 = new Car("RED", 12, 12.12);
        c2.setFuelAmount(112);
        System.out.printf("Color: %s ,fuelAmount :%s", c2.getColor(), c2.getFuelAmount());

    }
}
