package Sorting;


import java.util.Scanner;

/*Given an array of n elements, the task is to find the elements that are greater than
half of elements in an array. In case of odd elements, we need to print elements larger
than floor(n/2) elements where n is total number of elements in array.
*/
public class ElementsGreaterThanRemaningHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,6,5,0,0,4};
        int k = sort(arr);
        for(int i = k;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static int sort(int[] arr)
    {
        int n = arr.length;
        for(int i = 1;i<n;i++)
        {
            int j = i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        if(n%2 == 0)
        {
            return n/2;
        }
        else
        {
            return n/2 +1;
        }
    }


}
