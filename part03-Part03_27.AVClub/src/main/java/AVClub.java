
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();

            if (sentence.equals("")) {
                break;
            }

            String[] result = sentence.split(" ");
            for (String value : result) {
                if (value.contains("av")) {
                    System.out.println(value);
                }
            }

        }
    }
}
