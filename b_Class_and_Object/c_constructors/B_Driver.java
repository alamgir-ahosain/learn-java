package b_Class_and_Object.c_constructors;

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



  
     //_______________________Constructors
     /*
       special methods used to initialize objects.
       same name as the class
       no return type (not even void).
       automatically  called when object of a class is created.
     
       *constructor chaining: called another constructor using this(...)

       *If no constructor is defined, Java provides a default one that initializes all variables to default values.
      */


     A_Car obj=new A_Car(); // No argument type constructor->constructor chaining
     obj.printDetails();

     A_Car obj2=new A_Car("RED",12,(float) 4.5);  //Parameterized constructor
     obj2.printDetails();

     A_Car obj3=new A_Car(obj2); //copy constructor
     obj3.printDetails();
     

    




  }
}
