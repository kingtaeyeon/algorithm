package unit1_一维数组.part2_hot_problem.topic2_3_数组合并;

import java.util.Arrays;

/**
 * 合并K个数组
 */
public class MergeKArray {
    public static void main(String[] args) {

        int[][] twoArray = initArray();
        int[] a = mergeArrays(twoArray);
        System.out.println(Arrays.toString(a));
    }

    public static int[] mergeArrays(int[][] array) {
        int arrNums = array.length, arrLen;
        if (arrNums == 0) {
            return new int[0];
        }

        //数组内容校验
        arrLen = array[0].length;
        for (int i = 1; i < arrNums; i++)
            if (arrLen != array[i].length)
                return new int[0];
        //开辟空间
        int[] result = new int[arrNums * arrLen];
        //将各个数组依次合并到一起
        for (int i = 0; i < arrNums; i++)
            for (int j = 0; j < arrLen; j++)
                result[i * arrLen + j] = array[i][j];
        //排序一下
        Arrays.sort(result);
        return result;
    }

    /**
     * 初始化方法
     * @return
     */
    private static int[][] initArray() {
        int[] arr1 = {1, 3, 5, 6};
        int[] arr2 = {1, 2, 5, 7};
        int[] arr3 = {3, 6, 9, 11};
        int[] arr4 = {5, 7, 13, 17};

        //先合并到一起再排序
        int[][] twoArray = new int[4][4];
        twoArray[0] = Arrays.copyOf(arr1, 4);
        twoArray[1] = Arrays.copyOf(arr2, 4);
        twoArray[2] = Arrays.copyOf(arr3, 4);
        twoArray[3] = Arrays.copyOf(arr4, 4);
        return twoArray;
    }

}
