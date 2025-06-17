import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        long[] memo = new long[100];
        memo[0] = 0;
        memo[1] = 1;

        System.out.println(fibMemo(30, memo));
        System.out.println(Arrays.toString(memo));
    }

    public static long fibMemo(int n, long[] memo) {
        if (n == 0 || n == 1) return memo[n];

        if (memo[n] != 0) return memo[n];

        memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        return memo[n];
    }
}
