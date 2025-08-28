package b_Class_and_Object.b_this_and_static;

public class B_Driver {

  static int minAge;
  String name;
  int age;

  public void isAllowed() {
    System.out.println(this.age > minAge);
  }

  public static void isAllowedStatic(int age) {
    System.out.println(age >= minAge);
  }

  public static void main(String[] args) {

    /*
      Declartion: A_car=Class name | obj=Reference Variable
      Instantiation: new=New Keyword
      Initialization: A_car()=Constructor call
     
     
      Class-> A_Car : Bluprint
      object-> obj : Real Value
     */


    // ___________________this_________________________

    // A_Car obj2=new A_Car(); 
    // obj2.start().drive(); // start() returns A_Car allowing .drive() to be chained.
    // A_Car obj3=obj2.start(); obj3.drive();



    // _______________static________________________
    /*
     * static variable:
        belongs to the class ,not individual instances.
        shared among all instance of the class.
     * static method:
          can be called without creating an object of the class
          can only directed access static variables and other static method
          static method belongs to class and non-static method belongs to the object.

     * static method and blocks cannot direcly access acess non static variable.
     */

    B_Driver drv = new B_Driver();

    // drv.minAge=18; //The static field B_Driver.minAge should be accessed in a static way
    minAge = 18; // static way

    drv.age = 19;
    drv.isAllowed();

    // drv.isAllowedStatic(); //The static field B_Driver.isAllowedStatic() should be accessed in a static way
    isAllowedStatic(13); // static way

  }
}
