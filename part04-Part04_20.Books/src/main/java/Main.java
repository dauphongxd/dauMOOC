import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Title: ");
            String title = sc.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(sc.nextLine());
            System.out.println("Publication Year: ");
            int publicationYear = Integer.valueOf(sc.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        System.out.println("What information will be printed? ");
        String input = sc.nextLine();
        for(Book book : books ){
            if(input.equals("everything")){
                System.out.println(book);
            } else {
                System.out.println(book.getTitle());
            }
        }

    }
}
