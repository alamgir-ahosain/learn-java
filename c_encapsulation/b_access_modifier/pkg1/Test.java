package c_Encapsulation.b_access_modifier.pkg1;

public class Test {
    public static void main(String[] args) {

        // _____________________Test Car_Public________________________

        Car_Public c1 = new Car_Public();
        Car_Public c2 = new Car_Public("RED", 12, 12.12);

        c1.color = "RED";
        // c.fuelAmount=12; //cann't access,cause fuelAmount is private
        c1.speed = 12; // can be access beacuse it's default

        System.out.println(c1.toString()); // Car_Public [color=RED, fuelAmount=0,speed=0.0]
        System.out.println(c2.toString()); // Car_Public [color=RED, fuelAmount=12,speed=12.12]


        // _____________________Test Car_Default________________________
        Car_Default cd=new Car_Default(); //can be access(same package)


    }
}
