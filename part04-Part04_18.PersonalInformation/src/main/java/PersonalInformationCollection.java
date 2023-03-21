
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.println("Last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Identification number: ");
            String id = scanner.nextLine();

            PersonalInformation info = new PersonalInformation(name, lastName, id);
            infoCollection.add(info);
        }

        for (PersonalInformation personal : infoCollection) {
            System.out.println(personal.getFirstName() + " " + personal.getLastName());
        }
    }
}
