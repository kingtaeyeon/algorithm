package unit10_数学_位图与字符串.字符串.hot_problem;

public class LeetCode709 {

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < n; ++i) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                chars[i] += 32;
            }
        }
        String str = new String(chars);
        return str;
    }
}
