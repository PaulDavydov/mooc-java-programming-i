
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i =0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        for (int i =1; i <=size;i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int trunk = height +2;
        for (int i =0; i < height;i++) {
            printSpaces((height-1) - i);
            printStars(i*2+1);
        }
        for (int i = height+1;i<=trunk;i++) {
            printSpaces((height-1)-1);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
