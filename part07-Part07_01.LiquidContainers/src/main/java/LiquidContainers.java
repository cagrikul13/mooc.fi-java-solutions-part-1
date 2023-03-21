
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstCapacity = 100;
        int secondCapacity = 100;
        int firstCurrent = 0;
        int secondCurrent = 0;

        while (true) {
            System.out.println("First: " + firstCurrent + "/" + firstCapacity);
            System.out.println("Second: " + secondCurrent + "/" + secondCapacity);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] array = input.split(" ");
            String command = array[0];
            int amount = Integer.valueOf(array[1]);

            if (command.equals("add")) {
                if (amount + firstCurrent >= firstCapacity) {
                    firstCurrent = 100;
                } else if (firstCurrent + amount <= firstCapacity && amount > 0) {
                    firstCurrent += amount;
                }
            }

            if (command.equals("move")) {
                if (amount > 0) {
                    if (amount <= firstCurrent) {
                        firstCurrent -= amount;
                        secondCurrent += amount;
                    } else {
                        secondCurrent += firstCurrent;
                        firstCurrent = 0;
                    }
                    if (firstCurrent < 0 || secondCurrent < 0) {
                        firstCurrent = 0;
                        secondCurrent = 0;
                    }
                    if (secondCurrent > 100) {
                        secondCurrent = 100;
                    }
                }
            }

            if (command.equals("remove")) {
                secondCurrent -= amount;
                if (secondCurrent < 0) {
                    secondCurrent = 0;
                }
            }
        }
    }

}
