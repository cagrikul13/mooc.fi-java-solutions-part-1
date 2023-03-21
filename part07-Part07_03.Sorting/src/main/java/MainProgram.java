
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int value : array) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        int smallest = smallest(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = Integer.MAX_VALUE;
        int index = 0;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
}
