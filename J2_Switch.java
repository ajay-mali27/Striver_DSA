public class J2_Switch {

    int s1(int a1) {

        switch (a1) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            default:
                System.out.println("Something Went Wrong");
                break;

            case 5:
                System.out.println("Case 5");
                // break;
        }

        return 0;
    }

    public static void main(String[] args) {
        J2_Switch ss = new J2_Switch();
        ss.s1(98);
    }
}
