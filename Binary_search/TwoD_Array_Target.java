package Binary_search;

public class TwoD_Array_Target {
    public static void main(String[] args) {
        int[][] arr = {{1, 3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(search(arr,16));
    }

    public static boolean search(int[][] arr, int t)
    {
        int n = arr.length,m = arr[0].length;//rows and columns

        int st = 0,end = n*m -1;
        while(st<=end)
        {
            int mid = (st + end)/2;
            int mele = arr[mid/m][mid%m];

            if(mele == t)
            {
                return true;
            }
            else if(t <mele)
            {
                end = mid -1;
            }
            else {
                st = mid +1;
            }
        }
        return false;
    }
}
