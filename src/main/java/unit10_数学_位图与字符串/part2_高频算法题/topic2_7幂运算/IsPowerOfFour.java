package unit10_数学_位图与字符串.part2_高频算法题.topic2_7幂运算;

public class IsPowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }

    public static boolean isPowerOfFour(int n) {
        if (n <= 0)
            return false;
        while (n % 4 == 0)
            n /= 4;
        return n == 1;
    }
}
