//4
import java.util.Arrays;

public class algo02 {
    public static void main(String[] args) {
        int[] a={5,4,1,3,2};
        int[]b={23,14,5,56,-7,9,18,34,9,2};
       innsertionSort(a);
        System.out.print("A = ");
        System.out.println(Arrays.toString(a));

        innsertionSort(b);
        System.out.print("B = ");
        System.out.println(Arrays.toString(b));


    }
    public static void innsertionSort(int [] array){
        for (int i=1;i<array.length;i++){
            int elen=array[i];
            int j=i-1;
            while (j>=0&& array[j]>elen){
              array[j+1]=array[j];
                j++;
            }
            array[j+1]=elen;

        }

    }
}
