
public class J12_PrintDivisors {

    public static void main(String[] args) {
        int num = 36;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                System.out.println("The Divisiors Are :" + i);
            }

        }
    }
}