import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size og the arrya: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int Second_largest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                Second_largest = largest ;
                largest = num ;
            }else if (num > Second_largest && num != largest){
                Second_largest = num;
            }


        }
        System.out.println(Second_largest);
        sc.close();
    
    }
    
}
