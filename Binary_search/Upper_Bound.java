package Binary_search;

/*You are given a sorted array containing N integers and a number target. Implement the upper bound
function that returns the index of an element just greater than the target element. If there exists no such
element then return -1.
Note: The target may not be present in the array.

 */
public class Upper_Bound {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Upper_b(arr,5));
    }
    static int Upper_b(int[] arr,int t)
    {
        int low = 0 , high = arr.length-1;
        int ans = arr.length;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]>t)
            {
                ans = Math.min(ans,mid);
                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }
        return (ans< arr.length)?ans:-1;
    }

}
