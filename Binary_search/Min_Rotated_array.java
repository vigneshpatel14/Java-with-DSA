package Binary_search;

/*

Given a sorted array of distinct integers that is rotated in nature, find the value of the maximum element in
the array

 */
public class Min_Rotated_array {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,1,2};
        System.out.println(Minvalue(arr));
    }
    static int Minvalue(int[] arr)
    {
        int st = 0 ,n = arr.length;
        int end = n - 1;
        int ans = -1;
        while(st<=end)
        {
            int mid = (end+st)/2;
            if(arr[mid]>=arr[n-1])
            {
                ans = mid;
                st = mid + 1 ;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
