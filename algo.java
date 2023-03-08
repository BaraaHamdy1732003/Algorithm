//1
import java.util.Arrays;

public class algo {
    public static void main(String[] args) {
        int[] a={5,4,1,3,2};
        int[]b={23,14,5,56,-7,9,18,34,9,2};
        selectionSort(a);
        System.out.print("A = ");
        System.out.println(Arrays.toString(a));

        selectionSort(b);
        System.out.print("B = ");
        System.out.println(Arrays.toString(b));


    }
    public static void selectionSort(int []array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }

            }
            int tmp = array[i];
            array[i] = array[index];
            array[index] = tmp;
        }
    }

}
