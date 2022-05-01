package unit13_动态规划.part2_高频面试题;

public class CoinChange {
    public static void main(String[] args) {
        int []A={2,5,7};
        System.out.println(coinChange(A,27));
    }

    public  static int coinChange(int[] A, int M) {
        int n = A.length;
        int[] f = new int[M + 1];
        f[0] = 0;
        for (int i = 1; i <= M; ++i) {
            f[i] = Integer.MAX_VALUE;
            for (int j = 0; j < n; ++j) {
                if(i >= A[j]){
                    if (f[i - A[j]] != Integer.MAX_VALUE && f[i - A[j]] + 1 <f[i]) {
                        f[i] = f[i - A[j]] + 1;
                    }
                }

            }
        }

        if (f[M] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return f[M];
        }
    }
}
