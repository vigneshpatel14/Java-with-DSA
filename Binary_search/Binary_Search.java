package Binary_search;

public class Binary_Search {
    static boolean Bsearch(int[] arr,int target)
    {
        int n = arr.length;
        int low = 0,high = n-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==target)
            {
                return true;
            } else if (arr[mid]>target) {
                high = mid -1;
                //If rec approach ayte Bsearch(arr,low,high place lo mid - 1,target);
                //Just ekkada changes chesamo akkada replace cheyali
            }
            else {
                low = mid +1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,86,32,12,52,23,12};
        System.out.println(Bsearch(arr,3));
    }

}

