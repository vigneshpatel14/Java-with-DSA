package Binary_search;

public class Peak_Element {
    public static void main(String[] args) {
        int[] arr = {1,2,400,82,18,1,84};
        System.out.println(idx(arr));
    }
    static int idx(int[] arr)
    {
        int n = arr.length;
        int st = 0,end = n-1;
        while(st<=end)
        {
            int mid = (st+end)/2;
            if((mid == 0 || arr[mid]>arr[mid -1]) && (arr[mid] > arr[mid +1] || mid == n -1)){
                return mid;
            }
            if(arr[mid]<arr[mid+1])
            {
                st = mid +1;
            }
            else
            {
                end = mid -1 ;
            }
        }
        return -1;
    }
}
