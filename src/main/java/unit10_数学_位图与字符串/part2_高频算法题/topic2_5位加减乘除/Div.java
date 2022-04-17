package unit10_数学_位图与字符串.part2_高频算法题.topic2_5位加减乘除;

public class Div {
    public static void main(String[] args) {
        System.out.println(divide(10, 3));
    }

    public static int divide(int a, int b) {
        long x = a, y = b;
        boolean isNeg = false;
        //判断正负后
        if ((x > 0 && y < 0) || (x < 0 && y > 0)) {
            isNeg = true;
        }
        if (x < 0) x = -x;
        if (y < 0) y = -y;
        long l = 0, r = x;
        while (l < r) {
            long mid = (l + r + 1) >> 1;
            if (mul(mid, y) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        long ans = isNeg ? -l : l;
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return Integer.MAX_VALUE;
        return (int) ans;
    }

    public static long mul(long a, long k) {
        long ans = 0;
        while (k > 0) {
            if ((k & 1) == 1) ans += a;
            k >>= 1;
            a += a;
        }
        return ans;
    }
}
