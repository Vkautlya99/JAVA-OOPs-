import java.util.*;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");

        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        

        int start = 0 , end = arr.length - 1;

        while(start < end){
            arr[start] = arr[start] ^ arr[end];
            arr[end] = arr[start] ^ arr[end];
            arr[start] = arr[start] ^ arr[end];

            start += 1;
            end -= 1;

        }
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}
