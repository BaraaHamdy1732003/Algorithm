//7
import java.util.Arrays;
import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        double[][] a = new double[n][m];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = rnd.nextDouble(10);
            }
        }

        printMatrix(a);
        System.out.println();

        for (int j = 0; j < m; j++) {
            innsertionSort(a, j);
        }

        printMatrix(a);
    }

    public static void innsertionSort(double[][] array, int column) {
        for (int i = 1; i < array.length; i++) {
            double elem = array[i][column];
            int j = i - 1;
            while (j >= 0 && array[j][column] > elem) {
                array[j + 1][column] = array[j][column];
                j--;
            }
            array[j + 1][column] = elem;

        }

    }

     public static void printMatrix(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println();
    }
}