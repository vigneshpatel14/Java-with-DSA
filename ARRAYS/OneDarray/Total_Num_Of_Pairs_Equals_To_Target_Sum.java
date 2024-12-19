package ARRAYS.OneDarray;

import java.util.Scanner;

public class Total_Num_Of_Pairs_Equals_To_Target_Sum {
    static int pairsum(int[] arr,int target)
    {
        int ans=0;
        int n =arr.length;
        for (int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                    ans++;
            }
        }
        return ans;
    }













    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target Sum");
        int t=sc.nextInt();
        System.out.println(pairsum(arr,t));
    }
}
