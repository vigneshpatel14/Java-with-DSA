package Binary_search;

public class sqrt_Round_nearest {
    /*ex: x = 4
    o/p = 2

    x = 11
    o/p = 3
     */
    static int sqrt(int x)
    {
        int low = 0,high = x,ans = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int val = mid*mid;
            if(val==x)
            {
                return mid;
            } else if (val<x) {
                ans = mid;
                low = mid+1;
            }
            else {
                high = mid - 1;
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(100));
    }
}
