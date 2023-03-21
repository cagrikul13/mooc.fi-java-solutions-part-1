
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String value = scanner.nextLine();
            if (value.equals("")) {
                break;
            }
            String[] array = value.split(",");
            int age = Integer.valueOf(array[1]);
            if (Integer.valueOf(array[1]) > oldest) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
