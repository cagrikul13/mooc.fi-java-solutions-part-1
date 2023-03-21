
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
        while (true) {
            String value = scanner.nextLine();
            if (value.equals("")) {
                break;
            }
            String[] array = value.split(",");
            int age = Integer.valueOf(array[1]);
            if (age > oldest) {
                oldest = age;
                oldestName = array[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
