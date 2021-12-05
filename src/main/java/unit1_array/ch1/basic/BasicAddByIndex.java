package unit1_array.ch1.basic;

import static tools.ArrayTool.printList;

public class BasicAddByIndex {
    public static void main(String[] args) {
//通过元素有序插入
        int[] arr = new int[20];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 7;
        arr[3] = 8;

        addByIndex(arr, 4,2, 6);
        printList("通过元素顺序插入", arr, 5);

    }

    /**
     * @param arr   数组
     * @param size  已经存放元素的数量
     * @param index 插入的位置
     * @param key   插入的元素
     */
    public static void addByIndex(int[] arr, int size, int index, int key) {
        //注意这里是错的，是size >= arr.length-1，或者size > arr.length都行
        if (size >= arr.length-1) {
            throw new IllegalArgumentException("Add failed. array is full.");
        }
        //这里后面的条件应该是index >= arr.length
        if (index < 0 || index > arr.length)
            throw new IllegalArgumentException("Add failed.");
        for (int i = size-1 ; i >= index; i--)
            arr[i + 1] = arr[i];
        arr[index] = key;
        size++;
    }
}
