package Binary_search;

public class TwoD_Array_Target_TopToBottomSorted {
    public static void main(String[] args) {
        int[][] arr = {{2,4,6,8},{5,6,7,20},{7,11,13,25},{12,14,17,30}};
        System.out.println(search(arr,17));
    }
    static boolean search(int[][] arr,int t)
    {
        int n = arr.length, m = arr[0].length;
        int i = 0,j = m-1;
        while(i<n && j>=0)
        {
            if(arr[i][j]==t)
            {
                return  true;
            }
            if(t<arr[i][j])
            {
                j--;//move left
            }
            else {
                i++;//move down
            }
        }
        return false;
    }
}
