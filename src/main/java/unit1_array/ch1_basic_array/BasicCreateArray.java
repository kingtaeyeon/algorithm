package unit1_array.ch1_basic_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1.4 数组基本操作
 * (1)数组创建和初始化
 */
public class BasicCreateArray {
    public static void main(String[] args) {
        //第一种创建和初始化的方法
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i;
        System.out.println("arr1:" + Arrays.toString(arr));

        //第二种创建和初始化的方法
        int[] arr2 = new int[]{0, 1, 2, 3, 5, 6, 8};
        System.out.println("arr2:" + Arrays.toString(arr2));

        //第二种方式的简化版本:
        int[] arr3 = {2, 5, 0, 4, 6, -10};
        System.out.println("arr3" + Arrays.toString(arr3));


    }
}
