package unit2_一维数组.part3_dream_problem.topic_3_1加法;

import java.util.Arrays;

/**
 * 数组实现整数加法
 */
public class PlusOne数组加1 {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0)
                return digits;
        }
        // 比较巧妙的设计
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digital = {9};
        System.out.println(Arrays.toString(plusOne(digital)));
    }
}
