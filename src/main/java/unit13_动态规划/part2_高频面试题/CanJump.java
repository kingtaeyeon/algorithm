package unit13_动态规划.part2_高频面试题;

public class CanJump {
    public static void main(String[] args) {

    }

    public static boolean canJump(int[] A) {
        if (A == null || A.length == 0) {
            return false;
        }
        int n = A.length;
        boolean[] f = new boolean[n];
        f[0] = true;
        for (int j = 1; j < n; j++) {
            f[j] = false;
            for (int i = 0; i < j; i++) {
                if (f[i] && (i + A[i] >= j)) {
                    f[j] = true;
                }
            }
        }
        return f[n - 1];
    }
}
