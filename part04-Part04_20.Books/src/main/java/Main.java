
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.println("Pages: ");
            int page = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(title, page, year));
        }

        System.out.println("What information will be printed?");
        String print = scanner.nextLine();

        if (print.equals("everything")) {
            for (Book book : bookList) {
                System.out.println(book.getTitle() + ", " + book.getPage() + " pages, " + book.getYear());
            }
        } else if (print.equals("name")) {
            for (Book book : bookList) {
                System.out.println(book.getTitle());
            }
        }
    }
}
