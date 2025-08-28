package b_Class_and_Object;

public class String_Class {
    public static void main(String[] args) {

        String str1 = "Alamgir";
        String str2 = str1;
        String str3 = new String("Alamgir");

        // (==) check reference of an object
        boolean a = str1 == str2 ? true : false; // same object
        boolean b = str1 == str3 ? true : false; // difference object

        System.out.println(a); // true
        System.out.println(b); // false

        // .equals() compares contents of the strings
        boolean c = str1.equals(str2) ? true : false; // same content
        boolean d = str1.equals(str3) ? true : false; // same content

        System.out.println(c); // true
        System.out.println(d);// true

    }
}
