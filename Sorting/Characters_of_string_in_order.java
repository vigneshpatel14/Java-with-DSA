package Sorting;

import java.util.Scanner;

public class Characters_of_string_in_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i = 1;i<n;i++)
        {
            int j = i;
            while(j>0 && arr[j]<arr[j-1])
            {
                char temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(char i :arr)
        {
            System.out.print(i+" ");
        }
    }
}
