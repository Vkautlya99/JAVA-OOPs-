//Fibonacci series using recursion
// Time complexity: O(2^n)

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10 ;
        for(int i = 0 ; i < n ; i++){
            System.out.print(fib(i) + " ");
        }
        
    }
    public static int fib(int n ){
        if(n <= 1){
            return 1;
        }else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}


