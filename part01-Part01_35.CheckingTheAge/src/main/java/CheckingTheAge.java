
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        int num = scan.nextInt();
        if(num < 0 || num > 120){
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }

    }
}
