package unit1_array.part2_hot_problem.topic2_5_删除元素;

/**
 * 原地移除所有数值等于 val 的元素
 */
public class DeleteVal {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3, 3};
        int test = 0;
        if (test == 1) {
            System.out.println(removeElement(arr, 3));
        } else {
            System.out.println(removeElement2(arr, 2));
        }

    }

    public static int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        //最后剩余元素的数量
        return slow;
    }

    public static int removeElement2(int[] nums, int val) {
        int right = nums.length;
        for (int left = 0; left < right; ) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return right;
    }
}
