//5
public class MaxMinSort {
    public static void main(String[] args) {
        int[] arr = {23, 14, 5, 56, -7, 9, 18, 34, 9, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp= arr[i];
            arr[i]= arr[maxIndex];
            arr[maxIndex]=temp;
            if (minIndex==i){
                minIndex=minIndex;
            }
            temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[minIndex];
            arr[minIndex]= temp;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print  ( arr[i] +" , ");

        }
    }
}
