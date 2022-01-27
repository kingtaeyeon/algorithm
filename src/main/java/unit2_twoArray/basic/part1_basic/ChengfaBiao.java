package unit2_twoArray.basic.part1_basic;

/**
 * 题目1：打印乘法口诀表
 */
public class ChengfaBiao {
    public static void main(String[] args) {
        //确定一个有10个数组（它的元素也为数组）的二维数组
        int a[][] = new int[10][];

        //取出9个数组（a[1],a[2],...a[9])确定空间（元素数目），其余为空
        for (int i = 1; i < a.length; i++) {
            //初始化9个数组的元素数目（空间），a[1]有两个空间，以此类推
            a[i] = new int[i + 1];
            //为9个数组的元素赋值，a[1]中有a[1][0]和a[1][1],为a[1][1]赋值，其余为空，以此类推
            for (int j = 1; j < a[i].length; j++) {
                a[i][j] = i * j;
                System.out.print(i + "*" + j + "=" + a[i][j] + "\t");    //"\t"为空格键
            }

            //内循环结束后执行该语句，即每确定一个i,都将换一行
            System.out.println();

        }
    }
}
