package ARRAYS.OneDarray;

import java.util.Scanner;

public class pair_sum {
    static int pairsum(int[] arr,int target){
        int n= arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER TARGET SUM");
        int target = sc.nextInt();
        System.out.println(pairsum(arr,target));
    }
}
