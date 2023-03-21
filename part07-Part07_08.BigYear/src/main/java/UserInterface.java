
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cagri
 */
public class UserInterface {

    private Scanner scanner;
    private BirdMap birdMap;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birdMap = new BirdMap();
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Latin:");
                String latin = scanner.nextLine();
                Bird bird = new Bird(name, latin);
                birdMap.add(bird);
            } else if (command.equals("Observation")) {
                System.out.println("Bird?");
                String bird = scanner.nextLine();
                if (birdMap.hasKey(bird)) {
                    birdMap.addObservation(bird);
                } else {
                    System.out.println("Not a bird!");
                }
            } else if (command.equals("All")) {
                birdMap.list();
            } else if (command.equals("One")) {
                System.out.println("Bird?");
                String name = scanner.nextLine();
                birdMap.listOne(name);
            } else {
                System.out.println("Incorrect input.");
            }
        }
    }
}
