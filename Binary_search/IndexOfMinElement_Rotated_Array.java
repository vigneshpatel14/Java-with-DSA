package Binary_search;

public class IndexOfMinElement_Rotated_Array {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,1,2};
        System.out.println(MinIndex(arr));
    }
    static int MinIndex(int[] arr)
    {
        int n = arr.length;
        int st = 0 , end = n-1,ans = 0;
        while(st<=end)
        {
            int mid = st+(end - st)/2;
            if(arr[mid]<=arr[n-1]){
                ans = mid;
                end = mid-1;
            }
            else {
                st = mid+1;
            }
        }
        return ans;
    }
}
