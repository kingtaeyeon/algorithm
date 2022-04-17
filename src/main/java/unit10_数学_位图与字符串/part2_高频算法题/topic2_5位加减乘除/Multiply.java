package unit10_数学_位图与字符串.part2_高频算法题.topic2_5位加减乘除;

public class Multiply {
    public static void main(String[] args) {
        System.out.println(multiply(2, 10));
    }

    public static int multiply(int A, int B) {
        int min = Math.min(A, B);
        int max = Math.max(A, B);
        int ans = 0;
        for (int i = 0; min != 0; i++) {
            if ((min & 1) == 1) {
                ans += max << i;
            }
            min >>= 1;
        }
        return ans;
    }
}
