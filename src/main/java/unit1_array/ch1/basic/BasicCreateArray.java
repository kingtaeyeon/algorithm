package unit1_array.ch1.basic;

import java.util.Arrays;

public class BasicCreateArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i;
        System.out.println("arr1:" + Arrays.toString(arr));
        int[] arr2 = new int[]{0, 1, 2, 3, 5, 6, 8};
        System.out.println("arr2:" + Arrays.toString(arr2));
        //这么写也行:
        int[] arr3 = {2, 5, 0, 4, 6, -10};
        System.out.println("arr3" + Arrays.toString(arr3));
    }
}
