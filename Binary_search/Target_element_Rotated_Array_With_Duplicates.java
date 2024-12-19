package Binary_search;

public class Target_element_Rotated_Array_With_Duplicates {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,6,7,7,1,1,2,2,2};
        System.out.println(Target_idx(arr,7));
    }
    static int Target_idx(int[] a,int t)
    {
        int n = a.length;
        int st = 0,end = n-1;
        while(st<=end)
        {
            int mid = st + (end - st)/2;
            if(a[mid]==t)
            {
                return mid;
            } else if (a[st]==a[mid] && a[end]==a[mid]) {

                st++;
                end--;
            } else if (a[mid]<=a[end]) {
                if(t>a[mid] && t<a[end])
                {
                    st = mid+1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if(t>=a[st] && t<a[mid])
                {
                    end = mid - 1;
                }
                else
                {
                    st = mid + 1;
                }
            }
        }
        return -1;
    }
}
