
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int oldest = 0;
        String oldestName = "";
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] split = input.split(",");
            age = Integer.valueOf(split[1]);
            if(age > oldest){
                oldest = age;
                oldestName = split[0];
            }
            
        }
        System.out.println("Name of the oldest: " + oldestName);

    }
}
