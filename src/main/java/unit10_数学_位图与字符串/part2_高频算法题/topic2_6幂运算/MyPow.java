package unit10_数学_位图与字符串.part2_高频算法题.topic2_6幂运算;

public class MyPow {

    public static void main(String[] args) {
        System.out.println(myPow(5, 3));
        System.out.println(quickMul2(5, 3));
    }

    /**
     * 方法1 递归解法
     * @param x
     * @param n
     * @return
     */
    public static double myPow(double x, int n) {
        long nLong = n;
        return nLong >= 0 ? quickMul(x, nLong) : 1.0 / quickMul(x, -nLong);
    }

    public static double quickMul(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double y = quickMul(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }

    /**
     * 方法 2 迭代法
     *
     * @param x
     * @param n
     * @return
     */
    public static double quickMul2(double x, long n) {
        double ans = 1.0;
        while (n > 0) {
            if (n % 2 == 1) {
                ans *= x;
            }
            x *= x;
            n /= 2;
        }
        return ans;
    }

}
