
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i = 1; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(int i = size; i > 0; i--){
            printSpaces(i);
            printStars(size - i + 1);
        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int count = 0;
        for(int i = height; i > 0; i--){
            printSpaces(i);
            printStars(height - i + 1 + count);
            count++;
        }
        printSpaces(count - 1);
        System.out.println("***");
        printSpaces(count - 1);
        System.out.println("***");
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

//        printTriangle(5);
//        System.out.println("---");
//        christmasTree(4);
//        System.out.println("---");
        christmasTree(10);
    }
}