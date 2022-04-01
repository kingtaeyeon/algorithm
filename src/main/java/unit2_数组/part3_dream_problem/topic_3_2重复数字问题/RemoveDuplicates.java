package unit2_数组.part3_dream_problem.topic_3_2重复数字问题;

/**
 * 问题1 重复项保留K次
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        //前两个元素不必管
        //slow=2表示索引为2的位置可以被替换
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
