package unit13_动态规划.part2_高频面试题;

public class MaxProfit_122 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int answer = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                answer += prices[i] - prices[i - 1];
            }
        }
        return answer;
    }
}
