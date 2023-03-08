//3
import java.util.Arrays;
import java.util.Random;
public class SortArray {
    public static void main(String[] args) {
        int n= 3;
        int m=4;
        int rangeMin=0;
        int rangeMax=100;
        Random rng=new Random();
        double[][] array= new double[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                double ranNumber=rangeMin+(rangeMax-rangeMin)*rng.nextDouble();
                array[i][j]=ranNumber;
            }
        }
        System.out.println("Unsorted array : ");
        printArray(array);
        for (int j=0;j<m;j++ ){
            double[]column=new double[n];
            for (int i=0;i<n;i++){
                column[i]=array[i][j];
            }
            Arrays.sort(column);
            for (int i = 0; i <n ; i++) {
                array[i][j]=column[i];
            }
        }
        System.out.println("Sorted array : ");
        printArray(array);
    }
    public static void printArray(double[][]array){
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                //floating point value %f
                System.out.printf("%8.2f ", array[i][j] );
            }
            System.out.println();

        }
    }
}
