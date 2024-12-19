package Binary_search;


/*

You are given a sorted array containing N integers and a number target. Implement the lower bound
function that returns the index of the first element that is greater than or equal to the ‘target’ value. If there
exists no such element then return -1

 */
public class Lower_Bound {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4,5,6,7};
        System.out.println(Lower_b(arr,5 ));
    }
    static int Lower_b(int[] arr,int t)
    {
        int low = 0 , high = arr.length-1;
        int ans = arr.length;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]>=t)
            {
                ans = mid;
                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }
        return (ans< arr.length)?ans:-1;
    }

}
