import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        int n = 5; // number of rows
        int m = 3; // number of columns

        // create a 2D array of n x m elements
        int[][] arr = new int[n][m];

        // fill the array with random numbers
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = rand.nextInt(100); // generates a random integer between 0 and 99
            }
        }

        // print the unsorted array
        System.out.println("Unsorted array:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        // sort each column of the array using insertion sort
        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                int key = arr[i][j];
                int k = i - 1;
                while (k >= 0 && arr[k][j] > key) {
                    arr[k + 1][j] = arr[k][j];
                    k--;
                }
                arr[k + 1][j] = key;
            }
        }

        // print the sorted array
        System.out.println("Sorted array:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
