
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner sc = new Scanner(System.in);
        UserInterface ui = new UserInterface(sc);
        ui.start();
    }
}
