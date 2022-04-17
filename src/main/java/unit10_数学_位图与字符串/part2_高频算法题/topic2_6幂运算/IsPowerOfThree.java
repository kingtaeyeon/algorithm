package unit10_数学_位图与字符串.part2_高频算法题.topic2_6幂运算;

public class IsPowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(8));
        System.out.println(isPowerOfThree2(9));
    }

    /**
     * 方法1：通过除法计算
     * @param n
     * @return
     */
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    /**
     * 方法2：直接通过最大幂
     * @param n
     * @return
     */
    public static boolean isPowerOfThree2(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
