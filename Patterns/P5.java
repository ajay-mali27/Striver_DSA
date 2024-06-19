public class P5 {

    int star(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {

        P5 ss = new P5();
        ss.star(4);
    }
}
