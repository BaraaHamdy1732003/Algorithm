//9
import java.util.Arrays;
import java.util.Random;

public class BigtoSmall {
    public static void main(String[] args) {

        int[] arr = generateRandomArray(10);

        System.out.println("a " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("b " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean change;
        //left
        for (int i = 0; i < n/2-1; i++) {
            change = false;
            for (int j = 0; j < n/2-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    change = true;
                }
            }
            if (!change) break;
        }
        //right
        for (int i = n/2; i < n-1; i++) {
            change = false;
            for (int j = n/2; j < n-i-1+n/2; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    change = true;
                }
            }
            if (!change) break;
        }
    }

    public static int[] generateRandomArray(int length) {
        Random rand = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(10);
        }
        return arr;
    }
}