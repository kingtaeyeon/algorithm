package unit10_数学_位图与字符串.part1_基础知识;

public class TrailingZeroes {
    public static void main(String[] args) {

        System.out.println(trailingZeroes(20));
    }

    public static int trailingZeroes(int n) {
        int cnt = 0;
        for (long num = 5; n / num > 0; num *= 5) {
            cnt += n / num;
        }
        return cnt;
    }
}
