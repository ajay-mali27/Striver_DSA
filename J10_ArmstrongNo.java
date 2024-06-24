public class J10_ArmstrongNo {
    public static void main(String[] args) {
        int OrignalNumber = 371;
        int numbers = OrignalNumber;

        int sum = 0;
        int lastdigit;

        while (numbers > 0) {
            lastdigit = numbers % 10;
            sum = sum + (lastdigit * lastdigit * lastdigit);
            numbers = numbers / 10;
        }

        if (sum == OrignalNumber) {
            System.out.println(OrignalNumber + ": Palindrome Number");
        }

        else {
            System.out.println(OrignalNumber + ": Not a Palindrome Number");
        }
    }
}
