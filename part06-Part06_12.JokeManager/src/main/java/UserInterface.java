
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokeManager;

    public UserInterface(JokeManager jokeManager, Scanner scanner ){
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }

    public void start(){
        commands();
    }

    public void commands(){
        while (true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String input = scanner.nextLine();
            if(input.equals("1")){
                System.out.println("Write the joke to be added: ");
                String addJoke = scanner.nextLine();
                this.jokeManager.addJoke(addJoke);
            } else if (input.equals("2")) {
                System.out.println(this.jokeManager.drawJoke());
            } else if (input.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();
            } else {
                break;
            }
        }
    }
}
