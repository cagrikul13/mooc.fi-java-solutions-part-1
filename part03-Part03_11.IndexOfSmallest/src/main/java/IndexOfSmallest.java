
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int smallest = Integer.MAX_VALUE;
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());

            if (value == 9999) {
                break;
            }

            if (value < smallest) {
                smallest = value;
            }

            list.add(value);
        }
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
    }
}
