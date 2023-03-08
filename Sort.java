//2
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {23,14,5,56,-7,9,18,34,9,2};
        selectionSort(arr);
        System.out.print(Arrays.toString(arr));
        System.out.println();

    }

    public static int printminindex(int[] arr, int start, int end) {
        int minIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = printminindex(arr, i, arr.length - 1);
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }


    }