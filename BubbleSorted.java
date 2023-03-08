//10
import java.util.Arrays;
import java.util.Random;
public class BubbleSorted {
    public static void main(String[] args) {
         int n = 5;
        int m = 3;
         int[][] arr = new int[n][m];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = rand.nextInt(100);
            }
        }

         System.out.println("Unsorted :");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();

         bubbleSortColumn(arr, 0);

         System.out.println("Sorted with column 0:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();

         bubbleSortAllColumns(arr);

         System.out.println("Sorted with all columns:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

     public static void bubbleSortColumn(int[][] arr, int col) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j][col] > arr[j+1][col]) {
                     int temp = arr[j][col];
                    arr[j][col] = arr[j+1][col];
                    arr[j+1][col] = temp;
                }
            }
        }
    }

     public static void bubbleSortAllColumns(int[][] arr) {
        int m = arr[0].length;
        for (int col = 0; col < m; col++) {
            bubbleSortColumn(arr, col);
        }
    }
}
