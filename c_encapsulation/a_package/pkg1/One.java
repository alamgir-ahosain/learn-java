

package c_Encapsulation.a_package.pkg1;
import c_Encapsulation.a_package.pkg2.Two;

public class One {
    public static void main(String[] args) {


        /*
        Two t=new Two("Alamgir"); if constructor not declared as public 
             constructor can be accessed only from within the same package.
            It cannot be accessed from other packages, even if the class itself is public.
         */
        Two t=new Two("Alamgir"); //work only  if constructor Two(..) is public
    
    }
}
