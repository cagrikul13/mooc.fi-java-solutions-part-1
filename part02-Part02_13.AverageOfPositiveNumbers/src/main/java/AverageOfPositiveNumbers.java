
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int value = Integer.valueOf(scanner.nextLine());

            if (value > 0) {
                sum += value;
                count++;
            }

            if (value == 0) {
                break;
            }
        }

        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = 1.0 * sum / count;
            System.out.println(average);
        }
    }
}
