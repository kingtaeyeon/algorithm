package unit2_数组.part4_二维数组.part1_basic;

public class Juzhen {
    public static void main(String args[]) {
        int a[][] = new int[10][10];

        //取出9个数组，a[1],a[2]....a[9]
        for (int i = 1; i < a.length; i++) {
            //    a[i]=new int [i+1];    该数组的空间(元素数目）已经确定，不需要类似的语句进行确定

            //a[1]中有a[1][0],a[1][1]....a[1][10],为a[1][1].....a[1][9]赋值，其余为空，以此类推
            for (int j = 1; j < a[i].length; j++) {
                a[i][j] = i * j;
                System.out.print(i + "*" + j + "=" + a[i][j] + "\t");   //"\t"为空格键
            }
            System.out.println();
        }
    }
}
