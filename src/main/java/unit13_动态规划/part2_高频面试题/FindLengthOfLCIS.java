package unit13_动态规划.part2_高频面试题;

public class FindLengthOfLCIS {
    public static void main(String[] args) {

    }

    public int findLengthOfLCIS(int[] A) {
        int n = A.length;
        if (n == 0) {
            return 0;
        }
        int result = 1;

        int[] dp = new int[n];
        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            if (A[i] > A[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            } else if (A[i] <= A[i - 1]) {
                dp[i] = 1;  // 也可以不做处理
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
