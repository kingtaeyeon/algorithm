package unit10_数学_位图与字符串.part2_高频算法题.topic2_6初等数论;

public class IsPrime {
    public static void main(String[] args) {

        System.out.println(isPrime(11));
    }

   public static boolean isPrime(int num) {
        int max = (int)Math.sqrt(num);
        for (int i = 2; i <= max; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
