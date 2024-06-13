import java.util.Scanner;

public class J1_Marks {

    public static void main(String[] args) {
        System.out.println("Enter Your Marks");
        Scanner SC = new Scanner(System.in);
        int marks = SC.nextInt();

        if (marks < 25 && marks >= 0) {
            System.out.println("Failed");

        } else if (marks >= 25 && marks <= 44) {
            System.out.println("pass");

        } else if (marks >= 45 && marks <= 49) {
            System.out.println("Sufficient Marks");

        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Good Marks");

        } else if (marks >= 60 && marks <= 70) {
            System.out.println("Very Good Marks");
        } else if (marks >= 71 && marks <= 100) {
            System.out.println("Encellent Marks");
        } else {
            System.out.println("Enter Valid Input");
        }
    }
}