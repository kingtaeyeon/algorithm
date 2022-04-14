package unit10_数学_位图与字符串.part2_高频算法题.topic2_6初等数论;

public class NthUglyNumber {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }

    public static int nthUglyNumber(int index) {
        if (index < 1)
            return 0;
        int[] pUglyNumbers = new int[index]; //依次保存第n个丑数
        pUglyNumbers[0] = 1; //第一个丑数是1
        int pMultiply2 = 0, pMultiply3 = 0, pMultiply5 = 0;

        for (int i = 1; i < index; i++) {
            int min = getMin(pUglyNumbers[pMultiply2] * 2, pUglyNumbers[pMultiply3] * 3,
                    pUglyNumbers[pMultiply5] * 5);
            pUglyNumbers[i] = min;
            while (pUglyNumbers[pMultiply2] * 2 <= min)
                pMultiply2++;
            while (pUglyNumbers[pMultiply3] * 3 <= min)
                pMultiply3++;
            while (pUglyNumbers[pMultiply5] * 5 <= min)
                pMultiply5++;
        }
        return pUglyNumbers[index - 1];
    }

    public static int getMin(int a, int b, int c) {
        int min = a > b ? b : a;
        return c < min ? c : min;
    }
}
