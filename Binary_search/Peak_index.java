package Binary_search;

public class Peak_index {
    public static void main(String[] args) {
        int[] arr = {1,2,400,82,18,1,84};
        System.out.println(idx(arr));
    }

    static int idx(int[] arr)
    {
        int st = 0 , end = arr.length-1;
        int ans = -1;
        while(st<=end)
        {
            int mid = (st+end)/2;
            if(arr[mid]<arr[mid+1])
            {
                ans = mid+1;
                st = mid +1;
            }

            else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
