package Sorting;

public class Bub_sort_effective {
    static void bub_sort(int[] a)
    {
        int n = a.length;
        for(int i = 0;i<n-1;i++)
        {
            boolean flag = false;
            for(int j = 0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    //swap
                    flag= true;
                }
            }
            if(!flag)
            {
                return;
            }
        }
    }
}
