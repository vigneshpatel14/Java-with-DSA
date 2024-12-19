package pending;

public class _90_Rotation {
//    public static void main(String[] args) {
//
//    }
    static void rotate(int[] arr,int k  )
    {
        int n = arr.length;
        k = k%n;
        int [] ans = new int[n];
        int j =0;
        for (int i = n-k;i<n;i++)
        {
            ans[j++] = arr[i];
        }
        for(int i =0;i<n-k;i++)
        {
            ans[j++] = arr[i];
        }

    }
//    static void rev(int[] arr,int i ,int j)
//    {
//
//    }
//
//
//    public static void main(String[] args) {
//        rev(arr,0,n-k-1);
//        rev(arr,n-k,n-1);
//        rev(arr,0,n-1);
//    }
}
