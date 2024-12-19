package Sorting;

import java.util.Scanner;

public class Move_zeros_to_end {
    static void sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0;i<n-1;i++)
        {
            boolean flag = false;
            for(int j = 0;j<n-i-1;j++)
            {
                if(arr[j] == 0 && arr[j+1]!=0)
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag = true;
                }
            }
            if (!flag)
            {
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,6,0,0,5,0,4};
        sort(arr);
        for(int i :arr)
        {
            System.out.print(i+" ");
        }
    }
}

/* Inko method enti ante

for(int i = 0;i<n;i++)
{
    if(arr[i]!=0)
    {
        arr[idx++] = arr[i];
    }
}

inko loop run chy for 0 from idx to n varaku then store all zeroes in it
 */
