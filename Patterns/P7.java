public class P7 {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            // For Printing Space;
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            // For Printing Stars

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // For Printing Space;
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

//  Pyramid
// *    
// ***   
// *****
// *******
// *********
// ***********