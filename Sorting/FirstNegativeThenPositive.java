package Sorting;

public class FirstNegativeThenPositive {
    static void partition(int[] arr)
    {
        int l = 0 , r = arr.length - 1;
        while(l<r)
        {
            while(arr[l]<0)
            {
                l++;
            }
            while (arr[r]>=0)
            {
                r--;
            }
            if(l<r)
            {
                arr[l] = arr[l]+arr[r];
                arr[r]= arr[l]-arr[r];
                arr[l]= arr[l]-arr[r];
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int[] k = {-1,2,34,23,25,-3,5,-32,-23,0,0,-2,3};
        partition(k);
        for (int i:k)
        {
            System.out.print(i+" ");
        }
    }
}
