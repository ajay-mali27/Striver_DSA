public class J7_CountDigit {

    public static void main(String[] args) {

        int num = 1234;
        int copy = num;
        int count = 0;

        while (copy > 0) {
            copy = copy / 10;
            count++;
        }
        System.out.println("The number of digit is :" + count);
    }
}
