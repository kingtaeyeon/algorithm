package unit6_查找.part2_热门问题;

public class topic2_5Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(9));
    }
    public static int sqrt (int x) {
        int l=1,r=x;
        while(l <= r){
            int mid = l + ((r - l)>>1);
            if(x/mid > mid){
                l = mid + 1;
            } else if(x / mid < mid){
                r = mid - 1;
            } else  if(x/mid == mid){
                return mid;
            }
        }
        return r;
    }
}
