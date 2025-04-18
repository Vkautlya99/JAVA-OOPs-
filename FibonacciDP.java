public class FibonacciDP {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < n ; i++){
            int c = a + b;
            a = b ;
            b = c;
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("Fibonacci series using dynamic programming");

    }
}
