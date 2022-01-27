package unit2_twoArray.basic.part2_hot_problem.topic_2_1杨辉三角;

import java.util.ArrayList;
import java.util.List;

public class Yanghui {
    public static void main(String[] args) {
        basicYanghui();
        System.out.println("------------------------");
        //第二种方式，代码更精简一些
        List<List<Integer>> yanghui = generate(7);
        for (int row = 0; row < yanghui.size(); row++) {
            for (int column = 0; column < yanghui.get(row).size(); column++) {
                System.out.print(yanghui.get(row).get(column) + " ");
            }

        }
        System.out.println("\n----------只输出最后一行--------------");
        //第三个问题：只输出最后一行
        System.out.println(generate2(5));
    }

    /**
     * 基本的杨辉三角
     */
    public static void basicYanghui() {
        //确定一个有10个数组（元素为数组）的二维数组
        int a[][] = new int[10][];
        //取出a[0],a[1]......a[9]十个数组
        for (int i = 0; i < a.length; i++) {
            //为10个数组确定空间（元素数目）
            a[i] = new int[i + 1];
            //将所有数组的第一个和最后一个元素元素赋值为1
            a[i][0] = 1;
            a[i][i] = 1;
        }

        //取出a[0],a[1]......a[9]十个数组
        for (int i = 0; i < a.length; i++) {

            //从第三个数组开始
            if (i > 1) {
                for (int j = 0; j < a.length; j++) {
                    //所有数组的第二个到倒数第二个元素，它们的值为前一个数组所对应的元素和前一个元素的和（a[2][1]=a[1][1]+a[1][0])
                    if (j > 0 && j < i) {
                        a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
                    }
                }
            }
        }
        //通过下标访问数组的元素
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                //这里使用print不进行自动换行，使用“\t”进行跳格（tab key即为空格键)
                System.out.print(a[i][j] + "\t");
            }
            //这里每进行一次for循环，都将结果进行换行
            System.out.println();
        }
    }

    /**
     * 第二种方式
     * @param numRows
     * @return
     */
    public static List<List<Integer>> generate(int numRows) {
        // 我们采用如下的方法来模拟生成杨辉三角:
        List<List<Integer>> triangle = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            List<Integer> numbers = new ArrayList<>();
            for (int column = 0; column <= row; column++) {
                if (column == 0 || column == row) {
                    numbers.add(1);
                } else {
                    numbers.add(triangle.get(row-1).get(column - 1) + triangle.get(row - 1).get(column));
                }
            }

            triangle.add(numbers);
        }

        return triangle;
    }

    /**
     * 只输出最后一行
     * @param numRows
     * @return
     */
    public static List<Integer> generate2(int numRows) {
        // 我们采用如下的方法来模拟生成杨辉三角:
        List<List<Integer>> triangle = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            List<Integer> numbers = new ArrayList<>();
            for (int column = 0; column <= row; column++) {
                if (column == 0 || column == row) {
                    numbers.add(1);
                } else {
                    numbers.add(triangle.get(row - 1).get(column - 1) + triangle.get(row - 1).get(column));
                }
            }

            triangle.add(numbers);
        }

        return triangle.get(numRows - 1);
    }
}
