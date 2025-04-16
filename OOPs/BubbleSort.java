import java.util.*;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr [] = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(arr));
        // Bubble sort algorithm
        for(int i = 0; i < arr.length -1 ; i++){
            for(int j = i + 1; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
