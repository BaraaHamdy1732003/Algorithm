//6
import java.util.Arrays;

public class algo03 {
    public static void main(String[] args) {
        int[] a={5,4,1,3,2};
        int[]b={23,14,5,56,-7,9,18,34,9,2};
        bubbleSort(a);
        System.out.print("A = ");
        System.out.println(Arrays.toString(a));
        bubbleSort(b);
        System.out.print("B = ");
        System.out.println(Arrays.toString(b));
    }
    public static void bubbleSort(int[] array) {
        boolean f = true;
        int i=0;
        while(f){
            f= false;
            for (i = 0; i < array.length-i ; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        swap(array, j,j + 1);
                        f=true;
                    }
                }
                i++;
            }
        }
    }
    public static void swap(int []a,int i,int j){
        int tnp=a[i];
        a[i]=a[j];
        a[j]=tnp;
    }
}
