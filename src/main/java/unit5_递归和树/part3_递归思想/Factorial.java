package unit5_递归和树.part3_递归思想;

/**
 * 阶乘计算
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        // 把 f(n) 的等价操作写进去
        return factorial(n - 1) * n;
    }
}
