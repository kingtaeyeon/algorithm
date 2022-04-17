package unit10_数学_位图与字符串.part2_高频算法题.topic2_5位加减乘除;

public class GetSum {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2));
    }

    public static int getSum(int a, int b) {
        while (b != 0) {
            int sign = (a & b) << 1;
            a = a ^ b;
            b = sign;
        }
        return a;
    }
}
