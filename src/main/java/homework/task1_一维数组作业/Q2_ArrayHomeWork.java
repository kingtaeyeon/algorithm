package homework.task1_一维数组作业;

import java.util.Arrays;

public class Q2_ArrayHomeWork {
    /**
     * 第二次作业
     * 请设计一个算法，在单调数组中，将出现的重复元素一个都不要，例如
     * 示例1：
     * 原始数组为[1，1，2，2，3，4，5]，由于1，2存在重复，所以数组变成[3,4,5]
     * 示例2：
     * 原始数组为[0，2，2，2，2，2，5]，由于2存在重复，所以返回[0,5]
     * 要求：
     * 1.时间复杂度不能高于O(n)，空间复杂度为O（1）级别，只允许操作原始数组，不得创建新数组
     * 2.在下面removeAllDuplicate()中实现你的代码，其他代码不可以修改
     * <p>
     * 提示：双指针思想再拓展一下
     */

    /**
     * @param arr 待处理的数组
     */
    public static void removeAllDuplicate(int[] arr) {
        //todo  这里实现你的算法
        int slow = 0, fast = 1;
        boolean isMove = true;
        while (fast < arr.length) {
            if (arr[slow] == arr[fast]) {
                isMove = false;
            } else {
                if (isMove) {
                    slow++;
                }
                arr[slow] = arr[fast];
                isMove = true;
            }
            fast++;
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 2, 3, 4, 5};
        removeAllDuplicate(arr1);
        // 此时arr1的前三个元素为[3 4 5]

        int[] arr2 = {0, 2, 2, 2, 2, 2, 5};
        removeAllDuplicate(arr2);
        //此时arr2的前两个元素为[0 5]

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }


}
