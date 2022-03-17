package unit2_二维数组.part2_hot_problem.topic_2_2_螺旋打印;

import java.util.Arrays;

/**
 * 【2】螺旋矩阵生成
 */
public class GenerateMatrix {
    public static void main(String[] args) {
        int[][] a= generateMatrix(5);
        System.out.println(Arrays.deepToString(a));
    }
    public static int[][] generateMatrix(int n) {
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int[][] mat = new int[n][n];
        int num = 1, tar = n * n;
        while(num <= tar){
            for(int i = l; i <= r; i++)
                mat[t][i] = num++; // left to right.
            t++;

            for(int i = t; i <= b; i++)
                mat[i][r] = num++; // top to bottom.
            r--;

            for(int i = r; i >= l; i--)
                mat[b][i] = num++; // right to left.
            b--;

            for(int i = b; i >= t; i--)
                mat[i][l] = num++; // bottom to top.
            l++;
        }
        return mat;
    }
}
