package unit10_数学_位图与字符串.数学;

public class ConvertToBase7 {

    public static void main(String[] args) {
       int num = 100;
        System.out.println(convertToBase7(num));
    }
    public static String convertToBase7(int num) {
        boolean flag = true;
        if(num<0){
            flag = false;
            num = (-1)*num;
        }
        if(num==0){
            return 0+"";
        }
        int a = 0;
        a=num%7;
        num=num/7;

        int i=1;
        while(num>0){
            a+=(num%7)*(int)Math.pow(10,i);
            i++;
            num=num/7;
        }
        if(flag){
            return a+"";
        }else{
            return "-"+a;
        }
    }
}
