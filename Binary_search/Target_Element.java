package Binary_search;

/*
Given an sorted array of integers and a key element, you need to print the index where the element is
present. If the target element is not present in the array, print -1
 */
public class Target_Element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Target_idx(arr,4));
    }
    static int Target_idx(int[] arr, int t)
    {
        int st  = 0 ,n = arr.length;
        int end = n - 1;
        while(st<=end)
        {
            int mid = st+(end - st)/2;
            if(arr[mid]==t)
            {
                return mid;
            }
            else if (arr[mid]<t)
            {
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
