package ARRAYS;

import java.util.ArrayList;
import java.util.HashMap;

public class arraylist {

        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            arr.add(25);
            arr.add(3);
            arr.add(3);
            arr.add(5);
            arr.add(6);
            arr.add(25);
            arr.add(25);

            int[] pip = ansarr(arr);

            System.out.println("Most frequent element: " + pip[0]);
            System.out.println("Frequency: " + pip[1]);
            }


        public static int[] ansarr(ArrayList<Integer> arr) {
            if (arr == null || arr.isEmpty()) {
                return null;
            }

            HashMap<Integer, Integer> mp = new HashMap<>();
            int[] ans = new int[2];
            int max = 0;
            for (int num : arr) {
                mp.put(num, mp.getOrDefault(num, 0) + 1);

                if (mp.get(num) > max) {
                    max = mp.get(num);
                    ans[0] = num;
                    ans[1] = mp.get(num);
                }
            }

            return ans;
        }
    }

