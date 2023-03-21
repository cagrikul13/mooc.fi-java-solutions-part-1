
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String value = scanner.nextLine();

            if (value.equals("")) {
                break;
            }

            String[] array = value.split(" ");
            System.out.println(array[array.length - 1]);
        }

    }
}
