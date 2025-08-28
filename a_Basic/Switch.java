

/*
    Handle multiple value
    break statement typically used to prevent fall-through between casses
    Type safety: Case ;abe; types matches with the switch expression type
 */
public class Switch {
    public static void main(String[] args) {

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("saturday");
                break;
            case 2:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
