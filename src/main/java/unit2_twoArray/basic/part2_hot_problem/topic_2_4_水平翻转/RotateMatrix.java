package unit2_twoArray.basic.part2_hot_problem.topic_2_4_水平翻转;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int intA[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(rotateMatrix2(intA, 3)));
    }

    /**
     * 方法1：依次移动
     * @param mat
     * @param n
     * @return
     */
    public static int[][] rotateMatrix1(int[][] mat, int n) {
        int tR = 0;
        int tC = 0;
        int dR = n - 1;
        int dC = n - 1;
        while (tR < dR) {
            for (int i = 0; i < dC - tC; i++) {
                int tmp = mat[tR][tC + i];
                mat[tR][tC + i] = mat[dR - i][tC];
                mat[dR - i][tC] = mat[dR][dC - i];
                mat[dR][dC - i] = mat[tR + i][dC];
                mat[tR + i][dC] = tmp;
            }
            tR++;
            tC++;
            dR--;
            dC--;
        }
        return mat;
    }

    /**
     * 方法2：两次翻转法
     * @param mat
     * @param n
     * @return
     */
    public static int[][] rotateMatrix2(int[][] mat, int n) {
        // 对角线
        for(int i=0; i<n;i++) {
            for(int j=i+1; j< n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // 以横轴翻转
        for(int i=0;i<n;i++) {
            for(int j=0; j< n/2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
        }
        return mat;
    }

}
