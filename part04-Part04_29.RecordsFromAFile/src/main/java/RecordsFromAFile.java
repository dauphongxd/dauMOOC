
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                String data = reader.nextLine();

                String part[] = data.split(",");
                String name = part[0];
                int age = Integer.valueOf(part[1]);

                if(age <= 1 && age != 0){
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}
