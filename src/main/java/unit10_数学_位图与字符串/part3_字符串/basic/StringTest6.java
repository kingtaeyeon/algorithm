package unit10_数学_位图与字符串.part3_字符串.basic;

public class StringTest6 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1.equals(s2));//判断字符串内容
        System.out.println(s1 == s2);//判断字符串引用
    }
}