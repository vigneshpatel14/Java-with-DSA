package Binary_search;

/*

4. You are given a sorted array containing N integers and a number target, you have to find the number of
occurrences of the target in the given array

 */
public class Number_of_occurences {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,4,4,4,4,5,6,7};
        System.out.println(occ(arr,6));
    }
    static int occ(int[] arr,int t)
    {
        int f = -1 , l = -1;
        int  n = arr.length;
        int low = 0 , high = n - 1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]>=t)
            {
                if(arr[mid]== t)
                {
                    f = mid;
                }
                high = mid - 1;
            }
            else {
                low = mid+1;
            }
        }

        int lo = 0 ,h = n -1 ;
        while(lo<=h)
        {
            int m = (lo+h)/2;
            if(arr[m]<=t)
            {
                if(arr[m]== t)
                {
                    l = m;
                }
                lo = m+1;
            }
            else {
                h = m - 1;
            }
        }

        return (f==-1)?-1:l-f+1;
    }
}
