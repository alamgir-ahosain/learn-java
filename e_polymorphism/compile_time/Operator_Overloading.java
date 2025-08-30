package e_polymorphism.compile_time;

public class Operator_Overloading {
    public static void main(String[] args) {

        /*
         * "+" operator can be used to add two object.
         This is the only available support operator overloading in java,Though cann't
         make custom defiend operator overloading.
         */

        String str = "AB" + "CD";
        int num = 10 + 2;
        System.out.println(str + num);

    }
}
