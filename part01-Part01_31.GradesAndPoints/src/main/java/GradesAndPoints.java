
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        String grade = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int value = Integer.valueOf(scan.nextLine());
        if (value < 0) {
            grade = "impossible!";
        } else if (value < 50) {
            grade = "failed";
        } else if (value < 60) {
            grade = "1";
        } else if (value < 70) {
            grade = "2";
        } else if (value < 80) {
            grade = "3";
        } else if (value < 90) {
            grade = "4";
        } else if (value < 101) {
            grade = "5";
        } else {
            grade = "incredible!";
        }
        
        System.out.println("Grade: " + grade);
    }
}
