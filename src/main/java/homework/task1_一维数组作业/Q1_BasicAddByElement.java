package homework.task1_一维数组作业;

public class Q1_BasicAddByElement {
    /**
     * 第一次作业
     * 在讲义《一位数组和双指针》中，1.4.(3)增加一个元素部分，我们说增加元素时有两种方式，一种是先查找位置，再移动数据并插入，讲义中已经实现。
     * 另一种是从后向前一边移动一边对比查找，找到位置直接插入，这种方式减少了一次遍历，因此性能更好一些。
     * 现在请你在下面的addByElementSequence()方法里实现
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

        // 测试元素有序并且在表头插入
        addByElementSequence(arr, 6, 0);
        printList("通过元素顺序，尾部插入", arr, 7);
    }

    /**
     * @param arr
     * @param size    数组已经存储的元素数量
     * @param element 待插入的元素
     * <p>
     *    1、先判断数组是否有插入元素的空间，即size是否小于数组arr的长度
     *    2、从数组尾部向头部遍历，如果待插入元素比当前数组元素大，则直接插入，否则将数组元素后移
     * </p>
     * @return 返回插入位置的数组下标
     */
    public static int addByElementSequence(int[] arr, int size, int element) {

        /*
         * 如果size大于或等于arr的length就抛出异常
         */
        if (size >= arr.length) {
            throw new IllegalArgumentException("not enough space");
        }
        /*
         * 从size开始遍历
         */
        int index = 0;
        for (int i = size; i > 0; i--) {
            /*
             * 如果待插入元素大于或等于当前遍历的元素大则直接插入
             */
            if (element >= arr[i - 1]) {
                arr[i] = element;
                index = i;
                break;
            }
            /*
             * 否则将数组元素向后移动
             */
            arr[i] = arr[i-1];
        }
        arr[index] = element;
        //这里仅仅为了便于能过而设置，你可以修改
        return index;
    }

    public static void printList(String msg, int[] arr, int size) {
        System.out.println("\n通过" + msg + "打印");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
