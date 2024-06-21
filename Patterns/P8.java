public class P8 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            // Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * 5 - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


// *********
//  ******* 
//   *****
//    ***
//     *