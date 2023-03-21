
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                list.add(fileScanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (String data : list) {
            String[] array = data.split(",");
            String name = array[0];
            int age = Integer.valueOf(array[1]);
            if (age != 1) {
                System.out.println(name + ", age: " + age + " years");
            } else {
                System.out.println(name + ", age: " + age + " year");
            }

        }
    }
}
