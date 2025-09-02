public class B_multiple_catch {
    public static void main(String[] args) {
        try {
            int arr[] = new int[2];
            arr[3] = 3; // ArrayIndexOutOfBoundsException
            int num = 5 / 0; // ArithmeticException
        }

        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Always Executed");
        }

    }
}
