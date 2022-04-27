package unit2_数组.part2_hot_problem.topic2_2单调数组;

/**
 * leetcode35 寻找插入位置
 */
public class SearchInsert {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println(searchInsert(arr,2));
    }

    /**
     * leetcode35:给定⼀个排序数组和⼀个⽬标值，在数组中找到⽬标值，并返回其索引。如果⽬标值不存在于数组
     * 中，返回它将会被按顺序插⼊的位置。
     * @param nums
     * @param target
     * @return
     * @Author: LiHao
     * @Since: 2022/4/26 22:17
     */
    public static int searchInsertTest(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1, res = len;
        while (left <= right) {
            int mid = left + ()
        }

        return 0;
    }
    



















    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
