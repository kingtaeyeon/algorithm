package unit2_数组.part1_basic_array;

/**
 * @author liuqingchao
 * @说明 测试在数组中查找元素
 * @email 505459350@qq.com
 */

public class BasicSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10};
        //通过元素查找
        int key = 10;
        System.out.println("元素" + key + "的索引位置为：" + findByElement(arr, 9, key));
    }

    /**
     * @param arr
     * @param size 已经存放的元素容量
     * @param key  待查找的元素
     * @return
     */
    public static int findByElement(int[] arr, int size, int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    /***
     * 如果数组是递增的，此时查找时如果相等或者当前位置元素⽐⽬标值更⼤就停下了
     * @Author: LiHao
     * @param arr
     * @param size 已经存放的元素容量
     * @param key  待查找的元素
     * @return
     * @Since: 2022/4/13 23:05
     */
    public static int findByElementInContinuousArray(int[] arr, int size, int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key)
                return i;
            if (key > arr[i]) {
                return -1;
            }
        }
        return -1;
    }

}
