import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();  
        int a = 10; 
        int b = 2;  
        int x = 15; 
        int y = 5;  

        int minCost = Integer.MAX_VALUE;

        for (int big = 0; big <= (m + a - 1) / a; big++) {
            int unitsFromBig = big * a;
            int remaining = Math.max(0, m - unitsFromBig);

            int small = (remaining + b - 1) / b;
            int totalCost = big * x + small * y;

            minCost = Math.min(minCost, totalCost);
        }

        System.out.println(minCost);
    }
}
