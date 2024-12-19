package Gradient;

import java.util.Scanner;

public class Move_oAndOne {
    static void sort(int[] arr)
    {
        int n = arr.length,count = 0,nonZeroIndex = n-1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex--;
            }

        }

        for (int i = nonZeroIndex; i >= 0; i--) {
            arr[i] = 0;
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
