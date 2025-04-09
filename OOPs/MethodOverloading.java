import java.util.*;


public class MethodOverloading {

    public static void main(String[] args) {
        Calculation cal = new Calculation();

        System.out.println(cal.add(20,20));
        System.out.println(cal.add(20,30, 50));
        System.out.println(cal.add(20,20));

        
    }
}


class Calculation {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}
