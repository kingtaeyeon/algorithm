package unit2_数组.part1_basic_array;

import java.util.Arrays;

import static tools.ArrayTool.printList;

/**
 * @author liuqingchao
 * @说明 测试在数组中删除元素
 * @email 505459350@qq.com
 */

public class BasicDelete {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 19, 4, 9, 10, 18, 12};
        Arrays.sort(arr, 2, 4);
        System.out.println(Arrays.toString(arr));
//        int size = 7;
//        size = removeByElement(arr, size, 2);
//        System.out.println(size);
//        printList("根据索引删除", arr, size);
    }


    /**
     * 遍历数组，如果发现目标元素，则将其删除，
     * 数组的删除就是从目标元素开始，用后续元素依次覆盖前继元素
     *
     * @param arr  数组
     * @param size 数组中的元素个数
     * @param key  要删除的目标值
     */
    public static int removeByElement(int[] arr, int size, int key) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index + 1; i < size; i++)
                arr[i - 1] = arr[i];
            size--;
        }
        return size;
    }

    /**
     * 遍历数组，如果发现目标元素，则将其删除，
     * 数组的删除就是从目标元素开始，用后续元素依次覆盖前继元素
     *
     * @param arr  数组
     * @param size 数组中的元素个数
     * @param key  要删除的目标值
     */
    public static int test(int[] arr, int size, int key) {
        int index = -1;
        for (int i = 0; i< size; i++) {
            if (key == arr[i]) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int j = index + 1; j < size; j++) {
                arr[j-1] = arr[j];
            }
            size--;
        }
        return size;
    }
}
