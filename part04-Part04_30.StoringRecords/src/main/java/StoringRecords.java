
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNext()) {
                String[] array = scanner.nextLine().split(",");
                Person person = new Person(array[0], Integer.valueOf(array[1]));
                persons.add(person);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return persons;

    }
}
