import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;


    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if(input.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translate: ");
                String translate = scanner.nextLine();
                this.simpleDictionary.add(word, translate);
            } else if (input.equals("search")) {
                System.out.print("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                if(this.simpleDictionary.translate(toBeTranslated) == null){
                    System.out.println("Word " + toBeTranslated + " was not found");
                } else {
                    System.out.println("Translation: " + this.simpleDictionary.translate(toBeTranslated));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
