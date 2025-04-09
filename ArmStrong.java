import java.util.*;

public class ArmStrong {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num = sc.nextInt();

       String str_num = String.valueOf(num);
       int n = str_num.length();
       int sum = 0;

       for(int i = 0 ; i < n; i++){
        int digit = Character.getNumericValue(str_num.charAt(i));
        sum += Math.pow(digit, n);

       }
       if(num == sum){

           System.out.println("Armstrong number");
       }else{
        System.out.println("No Armstrong");
       }

    }
}
