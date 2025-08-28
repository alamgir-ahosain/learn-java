package c_Encapsulation.b_access_modifier.pkg2;

import c_Encapsulation.b_access_modifier.pkg1.Car_Public;

public class Test_Default_and_Public {

    public static void main(String[] args) {
        System.out.println("Test class : For Testing access modifier on pkg1...");


        // ______Test Car_Public
        Car_Public c1 = new Car_Public();
        c1.color = "RED and GREEN";
        // c.fuelAmount=12; //can't access cause  it's private
       //c1.speed = 12; // can't be access cause it's default(another package)
        System.out.println(c1.toString());


        //______Test Car_Default
        // Car_Default c2=new Car_Default(); can't be access Car_Default, cause it's default(another package)



    }
}
