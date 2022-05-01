package unit12_贪心;

public class Test {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4,2,1};
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
        int right = 0;
        int conver = 0;
        int steps = 0;
        for (int left = 0; left < nums.length - 1; left++) {
            //找能跳的最远的
            conver = Math.max(conver, nums[left] + left);
            if (left == right) { //遇到边界，就更新边界，并且步数加一
                right = conver;
                steps++;
            }
            if (right == nums.length - 1) {
                return steps;
            }
        }
        return steps;
    }


}

