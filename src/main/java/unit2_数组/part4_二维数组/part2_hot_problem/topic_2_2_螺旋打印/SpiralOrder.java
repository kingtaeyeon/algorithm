package unit2_数组.part4_二维数组.part2_hot_problem.topic_2_2_螺旋打印;

import java.util.ArrayList;

/**
 * 【1】螺旋矩阵打印
 */
public class SpiralOrder {

    public static void main(String[] args) {
        int intA[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(intA));
    }

    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res=new ArrayList<>();
        if(matrix.length==0){
            return res;
        }
        //定义四个坐标，表示每次循环的四个位置
        int top=0,bottom=matrix.length-1;
        int left=0,right=matrix[0].length-1;
        while(top<(matrix.length+1)/2 &&left<(matrix[0].length+1)/2){
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }

            for(int i=top+1;i<=bottom;i++){
                res.add(matrix[i][right]);
            }

            for(int i= right-1;i>=left&& top!=bottom;i--){
                res.add(matrix[bottom][i]);
            }
            for(int i=bottom-1;i>=(top+1)&&left!=right;i--){
                res.add(matrix[i][left]);
            }
            top++;
            bottom--;
            left++;
            right--;

        }
        return res;
    }
}
