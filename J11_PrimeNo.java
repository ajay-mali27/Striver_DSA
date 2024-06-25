public class J11_PrimeNo {
    public static void main(String[] args) {
        int num = 98;
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count >= 1) {
            System.out.println("Not a Prime Number ");
        } else {
            System.out.println("Prime Number");
        }

    }

}
