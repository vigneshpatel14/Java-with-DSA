package ARRAYS.OneDarray;

public class countno1 {

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 1, 1};
        int count = countOnes(arr);
        System.out.println("Number of 1's: " + count); // Output: Number of 1's: 4
    }

    public static int countOnes(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int lastZeroIndex = -1;

        // Binary search to find the last occurrence of 0
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == 0) {
                lastZeroIndex = mid;
                left = mid + 1; // Look for a 0 to the right
            } else {
                right = mid - 1; // Look for a 0 to the left
            }
        }

        // Calculate number of 1's
        return n - lastZeroIndex - 1;
    }
}
