package ARRAYS.OneDarray;

import java.util.Scanner;

public class queries {
    static int[] freq(int[] a)
    {
        int[] freq = new int[100005];
        for(int i=0;i<a.length;i++)
        {
            freq[a[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int[] freq=freq(a);
        System.out.println("Enter no. of queries");
        int q=sc.nextInt();
        while(q>0)
        {
            System.out.println("Enter element to be searched");
            int x=sc.nextInt();
            if(freq[x]>0)
                System.out.println(freq[x]);
            else
                System.out.println("NOTHING");
            q--;
        }
    }

}

