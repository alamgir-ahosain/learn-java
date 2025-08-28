package b_Class_and_Object.c_constructors;

public class C_Constructor_Chaining {

  static int minAge;
  String name;
  int age;

  public void isAllowed() {
    System.out.println(this.age > minAge);
  }

  public static void isAllowedStatic(int age) {
    System.out.println(age >= minAge);
  }


  //_____________Normal_______
  // C_Chain(){
  // System.out.println("No Parameterized..");
  // }
  // C_Chain(String n){
  // System.out.println("one Parameterized..");
  // this.name=n;
  // }
  // C_Chain(String n,int a){
  // System.out.println("many Parameterized..");
  // this.name=n;
  // this.age=a;
  // }


  //_______Constructor Chaining_________
  /*

   */


  C_Constructor_Chaining() { 
    System.out.println("No Parameterized..");
    this("alamgir"); // called C_Constructor_Chaining(String n)
  }

  C_Constructor_Chaining(String n) {
    System.out.println("one Parameterized..");
    this(n, 12); // called  C_Constructor_Chaining(String n,int a)
  }

  C_Constructor_Chaining(String n, int a) {
    System.out.println("many Parameterized..");
    this.name = n;
    this.age = a;
  }



  public void printDetails() {
    System.out.println(name + ", " + age);
  }

  public static void main(String[] args) {

         //_______________________Constructors
     /*
       special methods used to initialize objects.
       same name as the class
       no return type (not even void).
       automatically  called when object of a class is created.
     
       *constructor chaining: called another constructor using this(...)
       *If no constructor is defined, Java provides a default one that initializes all variables to default values.
      */

    // _____________-- Normal
    // C_Chain ch=new C_Chain(); ch.printDetails();
    // C_Chain ch2=new C_Chain("Alamgir");ch2.printDetails();
    // C_Chain ch3=new C_Chain("Alamgir",22);ch3.printDetails();

    // ______________________Constructor Chaining___________
    C_Constructor_Chaining ch = new C_Constructor_Chaining();ch.printDetails();
    C_Constructor_Chaining ch2 = new C_Constructor_Chaining();ch2.printDetails();
    C_Constructor_Chaining ch3 = new C_Constructor_Chaining("Alamgir", 22); ch3.printDetails();

  }
}
