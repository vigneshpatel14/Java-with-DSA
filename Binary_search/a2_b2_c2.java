package Binary_search;

import java.util.Scanner;

public class a2_b2_c2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        boolean flag = false;
        for(int a =  0;a*a<=c;a++)
        {
            int b = c - (int)(a*a);
            if(bsearch(0,b,b))
            {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
    static boolean bsearch(int low , int high , int n)
    {
        if(low>high)
        {
            return false;
        }
        int mid = (low+high)/2;
        if(mid*mid == n)
        {
            return true;
        }
        if(mid*mid >n)
        {
            return bsearch(low,mid-1,n);
        }
        return bsearch(mid+1,high,n);
    }

}
