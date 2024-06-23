public class J9_Palindrome {
    public static void main(String[] args) {
        int num = 100001;
        int temp = num;
        int rev = 0;

        while (temp > 0) {
            rev = (rev * 10) + temp % 10;
            temp = temp / 10;
        }

        // System.out.println(rev);

        if (rev == num) {
            System.out.println("Palindrome Number :" + rev);

        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}
