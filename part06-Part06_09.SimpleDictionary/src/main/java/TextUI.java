
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
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation : ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
                continue;
            }

            if (command.equals("search")) {
                System.out.println("To be translated: ");
                String translated = scanner.nextLine();
                String translation = dictionary.translate(translated);
                if (translation == null) {
                    System.out.println("Word " + translated + " was not found");
                    continue;
                }
                System.out.println("Translated: " + translation);
            }

            System.out.println("Unknown command");
        }
    }

}
