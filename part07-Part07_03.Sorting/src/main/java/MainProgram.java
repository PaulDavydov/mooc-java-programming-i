
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
    }
    public static int smallest(int[] array) {
        int smallest = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[smallest] > array[i]) {
                smallest = i;
            }
        }
        return array[smallest];
    }
    public static int indexOfSmallest(int[] array) {
        int smallest = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[smallest] > array[i]) {
                smallest = i;
            }
        }
        return smallest;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = startIndex;;
        for(int i = startIndex; i < table.length; i++) {
            if (table[smallest] > table[i]) {
                smallest = i;
            }
        }
        return smallest;
    }
    public static void swap(int[]array, int index1, int index2) {
        int a = array[index1];
        int b = array[index2];
        array[index2] = array[index1];
        array[index1] = b;
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, (indexOfSmallestFrom(array, i)));
        }
    }
}
