
//step 1: define a custom exception class
class customException extends Exception {
    public customException(String msg) {
        super(msg);
    }
}

public class E_custom_exception {

    //step 2: method might throw customException
    static void divide(int a) throws customException{
      if(a==0){
        throw new customException("Custom message:Can't divide by Zero");
      }
      System.out.println(a);
    }

    public static void main(String[] args) {

        try {
            divide(0);
        } catch (customException e) {
            System.out.println(e);
        }
    }
}
