public class P6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) { // formula n-i+1 n=total rows
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}