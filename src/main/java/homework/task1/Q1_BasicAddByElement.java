package homework.task1;

public class Q1_BasicAddByElement {
    /**
     * 第一个问题
     * 在讲义《一位数组和双指针》中，1.4.(3)增加一个元素部分，我们说增加元素时有两种方式，一种是先查找位置，再移动数据并插入，讲义中已经实现。
     * 另一种是从后向前一边移动一边对比查找，找到位置直接插入，这种方式减少了一次遍历，因此性能更好一些。现在请你实现这一种方法
     * @param args
     */

    public static void main(String[] args) {
        //通过元素有序插入
        int[] arr = new int[20];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 7;
        arr[3] = 8;
//中间位置插入
        addByElementSequence(arr, 4, 6);
        printList("通过元素顺序插入", arr, 5);
//尾部插入
        addByElementSequence(arr, 5, 9);
        printList("通过元素顺序，尾部插入", arr, 6);

//      测试元素有序并且在表头插入
        addByElementSequence(arr, 6, 0);
        printList("通过元素顺序，尾部插入", arr, 7);
    }

    /**
     * @param arr
     * @param size    数组已经存储的元素数量
     * @param element 待插入的元素
     * @return
     */
    public static int addByElementSequence(int[] arr, int size, int element) {

        //这里仅仅为了便于能过而设置，你可以修改
        return 0;
    }

    public static void printList(String msg, int[] arr, int size) {
        System.out.println("\n通过" + msg + "打印");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
