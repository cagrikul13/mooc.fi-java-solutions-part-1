
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
    private Point point;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.point = new Point();
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());

            if (value == -1) {
                break;
            }

            point.addPoints(value);
        }
        System.out.println("Point average (all): " + point.allAverage());
        System.out.println("Point average (passing): " + point.passingAverage());
        System.out.println("Pass percentage: " + point.passPercentage());
        System.out.println(point.gradeDistribution());
    }
}
