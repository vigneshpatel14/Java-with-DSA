package ARRAYS.OneDarray;

import java.util.Scanner;

public class Merge_sortedarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,3,6,8};
        int[] b = {2,4,5,7};
        int[] c = new int[a.length + b.length];
        int i = 0,j= 0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {
                c[k++]= a[i];
                i++;
            }
            else{
                c[k++]=b[j];
                j++;
            }
        }
        while(i < a.length)
        {
            c[k++] = a[i];
            i++;
        }
        while(j < b.length)
        {
            c[k++] = b[j];
            j++;
        }
        for(int p : c)
        {
            System.out.print(p+" ");
        }
    }
}
