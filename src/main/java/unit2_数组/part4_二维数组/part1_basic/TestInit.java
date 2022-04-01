package unit2_数组.part4_二维数组.part1_basic;

/**
 * 测试二维数组初始化
 */
public class TestInit {
    public static void main(String[] args) {
        //二维数组不是规则的矩阵
        int[] intA[] = {{1, 2}, {2, 3, 4}, {3, 4, 5, 6}};

        //声明一个二维数组，用于存储3个一维数组，每一个一维数据存多少个数组，不知道
        int[][] intB = new int[3][];
        intB[0] = new int[3];
        intB[1] = new int[]{1, 2, 3, 4};
        intB[2] = new int[2];
        //声明一个二维数组，存储三个一维数组，每个一维数组的长度为4
        int[] intC[] = new int[3][4];
    }
}
