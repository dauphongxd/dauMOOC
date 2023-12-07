
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            } else if (num < 0){
                continue;
            } else {
                sum += num;
                count++;
            }
           
        }
        if(sum == 0){
            System.out.println("Cannot calculate average");
        } else {
            System.out.println((double) (sum / count));
        }

    }
}
