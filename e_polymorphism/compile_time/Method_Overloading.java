package e_polymorphism.compile_time;

class Car{
    Car(){ System.out.println("Constructor");} 
    Car(String name){  System.out.println("Constructor"); } 
    Car(String name,int id){  System.out.println("Constructor"); }
}
public class Method_Overloading {

    public static int add(int a,int b){return a+b;}
    public static String add(String a ,String b){return a+b;}
    public static String add(String a,int b){return a+b;}
    
    public static void main(String[] args) {
        System.out.println(add(10,2));
        System.out.println(add("Alamgir ","Hosain"));
        System.out.println(add("Alamgir ",12));

        Car c1=new Car();
        Car c2=new Car("Alamgir");
        Car c3=new Car("Alamgir",12);

    }
}