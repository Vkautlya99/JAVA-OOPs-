import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int min = i ;

            for(int j = i + 1; j < arr.length ; j++){
                if(arr[j] < arr[min]){
                    int temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp ;
                }
            }
            
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}
