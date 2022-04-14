package unit10_数学_位图与字符串.part1_基础知识;

//1822. 数组元素积的符号

public class ArraySign {
    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
        System.out.println(arraySign(nums));

    }

    public static int arraySign(int[] nums) {
        int prod = 1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
                return 0;//一切归零
            } else if (nums[i] < 0) {
                //交替就够了，很好的处理技巧
                prod = -prod;
            }
        }
        return prod;
    }
}
