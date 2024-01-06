
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String id = sc.nextLine();
            if(id.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = sc.nextLine();
            if(name.isEmpty()){
                break;
            }
            Archive archive = new Archive(id, name);
            if(!(archives.contains(archive))){
                archives.add(archive);
            }
        }

        System.out.println("==Items==");
        for(Archive archive : archives){
            System.out.println(archive.getId() + ": " + archive.getName());
        }
    }
}
