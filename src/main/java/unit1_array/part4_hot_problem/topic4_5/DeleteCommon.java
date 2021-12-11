package unit1_array.ch4_hot_problem.topic4_5;

public class DeleteCommon {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int last = removeDuplicates(arr);
        for (int i = 0; i < last; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        //j用来标记有效位
        int j = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[j - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
