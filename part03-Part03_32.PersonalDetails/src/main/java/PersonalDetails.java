
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        String longest = "";

        while (true) {
            String value = scanner.nextLine();

            if (value.equals("")) {
                break;
            }

            String[] array = value.split(",");

            if (array[0].length() > longest.length()) {
                longest = array[0];
            }

            sum += Integer.valueOf(array[1]);
            count++;
        }
        double average = 1.0 * sum / count;
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + average);
    }
}
