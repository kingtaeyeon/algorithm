package unit7_排序;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {

        int[] array = {6, 3, 2, 1, 4, 5, 8, 7};
        int []result= insertSort(array);
        System.out.println(Arrays.toString(result));

    }
    public static int[] insertSort (int[] arr) {
        if(arr==null || arr.length<2){
            return null;
        }
        for(int i=1;i<arr.length;i++){
            int j=i;
            int temp=arr[i];
            for(;j>0;j--){
                if(arr[j-1]>temp){
                    arr[j]=arr[j-1];
                }else{
                    break;
                }
            }
            arr[j]=temp;
        }
        return arr;
    }
}
