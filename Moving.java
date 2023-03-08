//3
import java.util.Arrays;

public class Moving {

public static void main(String[] args) {
        int[]a = {-23, 36, 54, 65, 23, 4,6,7,8 };
        int cont = selectionSort(a);
        selectionSort( a);
        System.out.print(Arrays.toString( a));
        System.out.println();
        System.out.println(cont);

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


public static int selectionSort(int[] arr) {
        int cont= 0 ;
        for (int i = 0; i < arr.length - 1; i++) {
        int minIndex = printminindex(arr, i, arr.length - 1);
        if(i != minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
        cont++;
        }
        }
        return cont;
        }
        }
