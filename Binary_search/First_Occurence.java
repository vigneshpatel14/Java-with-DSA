package Binary_search;

public class First_Occurence {
    static int Focc(int[] arr,int t)
    {
        int n = arr.length;
        int low = 0,high = n-1;
        int fo = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==t)
            {
                fo = mid;
                high = mid - 1;
            } else if (arr[mid]>t) {
                high = mid -1;
            }
            else {
                low = mid +1;
            }
        }
        return fo;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,4,4,30};
        System.out.println(Focc(arr,30));
    }
}
