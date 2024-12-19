package Intresting_questions;
import java.util.ArrayList;
import java.util.List;

public class alternate_end_B {

    public static void main(String[] args) {
        int[] A = {10, 15, 25};
        int[] B = {1, 5, 20, 30};
        int m = A.length;
        int n = B.length;

        generateAllArrays(A, B, m, n);
    }

    // Function to generate all alternating arrays
    public static void generateAllArrays(int[] A, int[] B, int m, int n) {
        List<Integer> result = new ArrayList<>();
        // Start by picking an element from A
        for (int i = 0; i < m; i++) {
            result.add(A[i]);
            generateUtil(A, B, result, i + 1, 0, m, n, false); // Next pick from B
            result.remove(result.size() - 1); // Backtrack
        }
    }

    // Recursive utility function to generate arrays
    private static void generateUtil(int[] A, int[] B, List<Integer> result, int i, int j, int m, int n, boolean flag) {
        if (!flag) { // If flag is false, pick from B
            for (int k = j; k < n; k++) {
                if (B[k] > result.get(result.size() - 1)) {
                    result.add(B[k]);
                    printArray(result); // Print each valid result that ends with B
                    generateUtil(A, B, result, i, k + 1, m, n, !flag); // Next pick from A
                    result.remove(result.size() - 1); // Backtrack
                }
            }
        } else { // If flag is true, pick from A
            for (int k = i; k < m; k++) {
                if (A[k] > result.get(result.size() - 1)) {
                    result.add(A[k]);
                    generateUtil(A, B, result, k + 1, j, m, n, !flag); // Next pick from B
                    result.remove(result.size() - 1); // Backtrack
                }
            }
        }
    }

    // Utility function to print the array
    private static void printArray(List<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}




