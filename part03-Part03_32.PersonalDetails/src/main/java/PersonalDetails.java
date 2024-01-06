
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int name = 0;
        int longestName = 0;
        String finalName = "";
        double sum = 0;
        int count = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] split = input.split(",");
            name = split[0].length();
            if(name > longestName){
                longestName = name;
                finalName = split[0];
            }
            sum += Integer.valueOf(split[1]);
            count++;
      
        }
        
        System.out.println("Longest name: " + finalName);
        System.out.println("Average of the birth years: " + (sum/count));

    }
}
