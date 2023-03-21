
import java.util.Scanner;

public class LiquidContainers2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container container1 = new Container();
        Container container2 = new Container();
        
        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] values = input.split(" ");
            String command = values[0];
            int amount = Integer.valueOf(values[1]);
            
            if (command.equals("add")) {
                container1.add(amount);
            }
            
            if (command.equals("remove")) {
                container2.remove(amount);
            }
            
            if (command.equals("move")) {
                if (container1.contains() - amount < 0) {
                    container2.add(container1.contains());
                } else {
                    container1.remove(amount);
                    container2.add(amount);
                }
            }
        }
    }
    
}
