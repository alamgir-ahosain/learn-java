
public class A_try_catch {

    public static void main(String[] args) {

        try {
            int a[] = new int[2];
            a[3] = 3; // ArrayIndexOutOfBoundsException
            var num = 5 / 0; // ArithmeticException
        }
        // Object <- Throwable <- Exception <- RuntimeException <- ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException :" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException :" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception :" + e.getMessage());
        }
        finally {
            System.out.println("Always Executed");
        }

    }

}
