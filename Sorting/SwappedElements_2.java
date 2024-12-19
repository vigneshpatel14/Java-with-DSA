package Sorting;

public class SwappedElements_2 {
    static void sortarr(int[] arr,int n)
    {
        if(n<=1)
            return;

        int x = -1,y = -1;
        int prev = arr[0];

        for(int i =  1;i<n;i++)
        {
            if(prev>arr[i])
            {
                if(x==-1)
                {
                    x = i-1;
                    y = i;
                }
                else {
                    y = i;
                }
            }
            prev = arr[i];
        }
        int temp =arr[x];
        arr[x] = arr[y];
        arr[y]=temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,9,11,13,26,20,19};
        sortarr(arr,arr.length);
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
