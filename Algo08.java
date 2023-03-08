//8
public class Algo08 {

    public static void main(String[] args) {
        int[] arr = {23,14,5,56,-7,-9,18,34,9,2};
        int moving = 0;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
                moving++;
            }
            arr[j + 1] = key;
            if (key == 21) {
                moving--;
            }
            if (key == 24) {
                moving++;
            }
        }
        System.out.println("Sorted : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Number of elements moving: " + moving);
    }

}

