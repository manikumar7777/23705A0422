import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] memo = new long[100];
        memo[0] = 0;
        memo[1] = 1;

        System.out.println(fibTab(20, memo));
        System.out.println(Arrays.toString(memo));
    }

    public static long fibTab(int n, long[] memo) {
        if (memo.length <= n) {
            System.out.println("Insufficient memo size: " + memo.length);
            return -1; 
        }

        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }
}
