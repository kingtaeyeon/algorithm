package unit5_递归和树.part3_递归思想;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int n) {
        // 1.先写递归结束条件
        if (n <= 2) {
            return 1;
        }
        // 2.接着写等价关系式
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
