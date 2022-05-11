package unit2_数组.part2_hot_problem.topic2_5_删除元素;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {1,2,0};
        System.out.println(firstMissingPositive(nums));

        int[] nums2 = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums2));

        int[] nums3 = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums3));
    }

    public static int firstMissingPositive(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (curr == res) {
                res++;
            }

        }
        return res;
    }
}
