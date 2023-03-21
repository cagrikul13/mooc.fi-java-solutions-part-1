
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> list = new ArrayList<>();

        try (Scanner scannerFile = new Scanner(Paths.get(file))) {
            while (scannerFile.hasNextLine()) {
                list.add(Integer.valueOf(scannerFile.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        int count = 0;
        for (int number : list) {
            if (number >= lowerBound && number <= upperBound) {
                count++;
            }
        }

        System.out.println("Numbers: " + count);
    }

}
