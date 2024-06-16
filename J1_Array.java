public class J1_Array {
    // Array is use to solve problems on matrix and Graph Problem
    public static void main(String[] args) {

        // Initialing and assigning 1D Array;

        int arr[] = new int[2];
        arr[0] = 2;
        arr[1] = 6;

        // System.out.println(arr[0]);

        // We can Assign values in Array without Specifying the size
        int Students[] = { 30, 50, 32, 55, 45 };
        // System.out.println(Students[2]);

        // <<<<------------ 2D Array ----------->>>

        int school[][] = new int[2][3]; // [j][i]
        school[0][0] = 0;
        school[0][1] = 1;
        school[0][2] = 2;
        // school[0][3] = 59;

        System.out.println(school[0][2]);

    }
}
