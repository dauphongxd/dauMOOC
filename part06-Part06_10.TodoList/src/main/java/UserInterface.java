import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("add")){
                System.out.print("To add: ");
                String add = scanner.nextLine();
                this.todoList.add(add);
            } else if (command.equals("list")) {
                this.todoList.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one to remove? ");
                int number = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(number);
            } else if (command.equals("stop")) {
                break;
            }
        }
    }
}
