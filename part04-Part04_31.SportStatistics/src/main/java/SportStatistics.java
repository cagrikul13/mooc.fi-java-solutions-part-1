
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Name: ");
        String team = scan.nextLine();

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> winners = new ArrayList<>();
        ArrayList<String> losers = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNext()) {
                list.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int count = 0;
        int win = 0;
        int lose = 0;

        for (String game : list) {
            String[] info = game.split(",");
            String away = info[0];
            String home = info[1];
            int awayScore = Integer.valueOf(info[2]);
            int homeScore = Integer.valueOf(info[3]);
            if (game.contains(team)) {
                count++;
            }
            if ((awayScore > homeScore)) {
                winners.add(away);
                losers.add(home);
            } else {
                winners.add(home);
                losers.add(away);
            }
        }

        for (String winner : winners) {
            if (winner.contains(team)) {
                win++;
            }
        }

        for (String loser : losers) {
            if (loser.contains(team)) {
                lose++;
            }
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);
    }

}
