package unit2_一维数组.part2_hot_problem.topic2_2单调数组;

/**
 *  热身专题1：判断数组元素是否有序
 * 判断数组的单调性
 */
public class Monotonic {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3};
        int testMethod = 1;
//        通过两次遍历来实现
        System.out.println(isMonotonic(a));
//        一次遍历实现
        System.out.println(isMonotonic_2(a));

    }

    /**
     * 两次遍历确定
     *
     * @param nums
     * @return
     */
    public static boolean isMonotonic(int[] nums) {
        return isSorted(nums, true) || isSorted(nums, false);
    }

    public static boolean isSorted(int[] nums, boolean increasing) {
        int n = nums.length;
        for (int i = 0; i < n - 1; ++i) {
            if(increasing){
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            }else{
                if (nums[i] < nums[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 一次遍历确定
     *
     * @param nums
     * @return
     */
    public static boolean isMonotonic_2(int[] nums) {
        boolean inc = true, dec = true;
        int n = nums.length;
        for (int i = 0; i < n - 1; ++i) {
            if (nums[i] > nums[i + 1]) {
                inc = false;
            }
            if (nums[i] < nums[i + 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }
}
