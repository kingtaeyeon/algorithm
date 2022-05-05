package unit2_数组.part2_hot_problem.topic2_4_替换空格;

/**
 * 替换空格
 */
public class ReplaceSpace {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("We are happy.");
        System.out.println(replaceSpace1Test(sb));
        System.out.println(replaceSpace2Test(sb));
    }

    /**
     * 方法1：创建新的字符串
     *
     * @param str
     * @return
     */
    public static String replaceSpace1Test(StringBuffer str) {

        String result = "";
        for (int i  = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (' ' == c) {
                result += "%20";
            } else {
                result += c;
            }
        }
        return result;
    }



    /**
     * 方法2：长度可变的情况
     *
     * @param str
     * @return
     */
    public static String replaceSpace2Test(StringBuffer str) {
        if (str == null) {
            return null;
        }
        int len = str.length();
        int numOfBlank = 0;
        for (int i = 0; i<len; i++) {
            if (' ' == str.charAt(i)) {
                numOfBlank++;
            }
        }
        str.setLength(len + 2 * numOfBlank);
        int fast = len - 1, slow = (len + 2 * numOfBlank) - 1;
        while (fast >= 0 && slow > fast) {
            char c = str.charAt(fast);
            if (' ' == c) {
                str.setCharAt( slow--, '0');
                str.setCharAt( slow--, '2');
                str.setCharAt( slow--, '%');
            } else {
                str.setCharAt( slow--, c);
            }
            fast--;
        }
        return str.toString();
    }








    /**
     * 方法1：创建新的字符串
     *
     * @param str
     * @return
     */
    public static String replaceSpace1(StringBuffer str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ')
                res += "%20";
            else
                res += c;
        }
        return res;
    }

    /**
     * 方法2：在原数组基础上改
     *
     * @param str
     * @return
     */
    public static String replaceSpace2(StringBuffer str) {
        if (str == null)
            return null;
        int numOfblank = 0;//空格数量
        int len = str.length();
        for (int i = 0; i < len; i++) {  //计算空格数量
            if (str.charAt(i) == ' ')
                numOfblank++;
        }
        str.setLength(len + 2 * numOfblank); //设置长度
        int fast = len - 1;  //两个指针
        int slow = (len + 2 * numOfblank) - 1;

        while (fast >= 0 && slow > fast) {
            char c = str.charAt(fast);
            if (c == ' ') {
                fast--;
                str.setCharAt(slow--, '0');
                str.setCharAt(slow--, '2');
                str.setCharAt(slow--, '%');
            } else {
                str.setCharAt(slow, c);
                fast--;
                slow--;
            }
        }
        return str.toString();
    }
}
