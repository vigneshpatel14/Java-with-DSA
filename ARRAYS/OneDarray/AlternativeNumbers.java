/*Q2. Given an array of positive and negative numbers, arrange them in an alternate fashion such that
every positive number is followed by a negative and vice-versa maintaining the order of appearance.
The number of positive and negative numbers need not be equal. Begin with a negative number.
If there are more positive numbers, they appear at the end of the array. If there are more negative
numbers, they too appear at the end of the array*/

package ARRAYS.OneDarray;

import java.util.Scanner;
//almost done index batti alternate arrange cheyali kavachu anukukntuna
public class AlternativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int i =0,j= a.length-1,temp=0;
        while(i<=j)
        {
            if(a[i] > 0 && a[j]<0)
            {
                temp = a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            } else if (a[i]<0 && a[j] <0) {
                i++;
            }
            else if (a[i]>0 && a[j] >0)
            {
                j--;
            }
            else {
                i++;
                j--;
            }
        }
        for(int k = 0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }

    }
}
