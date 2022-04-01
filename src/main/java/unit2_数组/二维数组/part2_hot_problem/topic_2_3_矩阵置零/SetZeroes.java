package unit2_数组.二维数组.part2_hot_problem.topic_2_3_矩阵置零;

import java.util.Arrays;

/**
 * 矩阵置零
 */
public class SetZeroes {
    public static void main(String[] args) {
        int intA[][]={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes1(intA);
        System.out.println(Arrays.deepToString(intA));
    }
    //方法1：使用两个数组辅助标记
    public static void setZeroes1(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    /**
     * 使用两个变量标记
     * @param matrix
     */
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean flagCol0 = false, flagRow0 = false;
        //检查第一列有没有0
        for (int i = 0; i < m; i++) {
            //列有0，就标记一下
            if (matrix[i][0] == 0) {
                flagCol0 = true;
            }
        }
        //检查第一行有没有0
        for (int j = 0; j < n; j++) {
            //第一列有0，就标记一下
            if (matrix[0][j] == 0) {
                flagRow0 = true;
            }
        }
        //标记之后，第一行和第一列的原有元素就不重要了，能被覆盖
        //可以用来代替上一种方法里的row和col数组
        //接下来的逻辑与方法一种的是一样的了
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        //最后再根据两个标记决定是否将第一行或第一列也清空，
        if (flagCol0) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        if (flagRow0) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
