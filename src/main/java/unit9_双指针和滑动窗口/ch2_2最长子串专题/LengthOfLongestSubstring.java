package unit9_双指针和滑动窗口.ch2_2最长子串专题;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {

//        String s = "abcabcbb";
//        String s = "au";
        String s = " ";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        Set<Character> curSet = new HashSet<>();
        int right = 0, max = 0;
        int n=s.length();
        for (int left = 0; left < n; ++left) {
            if (left != 0) {
                curSet.remove(s.charAt(left - 1));
            }
            while (right < n - 1 && curSet.contains(s.charAt(right ))) {
                curSet.add(s.charAt(right ));
                right++;
            }
            max = Math.max(max, right - left + 1);

        }

        return max;

    }


}
