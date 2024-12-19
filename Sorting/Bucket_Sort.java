package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Bucket_Sort {
    public static void main(String[] args) {
        float[] arr = {0.0f,0.3f,0.4f,0.6f,0.06f,0.045f,0.1f,0.62f};
        Bucketsort(arr);
        for(float k : arr)
        {
            System.out.print(k+" ");
        }
    }
    static  void Bucketsort(float[] arr)
    {
        int n = arr.length;
        ArrayList<Float>[] buckets = new ArrayList[n];

        for(int i = 0;i<n;i++)
        {
            buckets[i] = new ArrayList<Float>();
        }
        for(int i = 0;i<n;i++)
        {
            int bucketIndex = (int)arr[i]*n;
            buckets[bucketIndex].add(arr[i]);
        }

        for(int i = 0;i< buckets.length;i++)
        {
            Collections.sort(buckets[i]);
        }

        int idx = 0;

        for(int i = 0;i< buckets.length;i++)
        {
            ArrayList<Float> currBuckets = buckets[i];
            for(int j = 0;j<currBuckets.size();j++)
            {
                arr[idx++] = currBuckets.get(j);
            }
        }
    }
}
