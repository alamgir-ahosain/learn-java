package b_Class_and_Object.a_basic;

public class B_Driver {
  public static void main(String[] args) {

    /*
     * Declartion: A_car=Class name | obj=Reference Variable
     * Instantiation: new=New Keyword
     * Initialization: A_car()=Constructor call
     * 
     * 
     * Class-> A_Car : Bluprint
     * object-> obj : Real Value
     */
    A_Car obj = new A_Car();

    obj.addFuel(10);
    obj.start();
    obj.drive();

  }
}
