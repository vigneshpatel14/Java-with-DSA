package basics;

import java.util.Scanner;


public class eihi {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt(); // number of test cases

            while (T-- > 0) {
                String s = scanner.next(); // input string for each test case
                System.out.println(palindromeReorder(s));
            }
            scanner.close();
        }

        public static String palindromeReorder(String s) {
            int[] count = new int[26]; // Count occurrences of each character

            // Count occurrences of each character in the string
            for (char ch : s.toCharArray()) {
                count[ch - 'A']++;
            }

            // Check if it's possible to form a palindrome
            int oddCount = 0;
            for (int i = 0; i < 26; i++) {
                if (count[i] % 2 != 0) {
                    oddCount++;
                }
            }

            // If more than one character has an odd count, palindrome is not possible
            if (oddCount > 1) {
                return "impossible";
            }

            // Construct the first half of the palindrome
            char[] firstHalf = new char[s.length() / 2];
            char oddChar = 0; // Character with odd count, if any
            int index = 0;
            for (int i = 0; i < 26; i++) {
                while (count[i] >= 2) {
                    firstHalf[index++] = (char) ('A' + i);
                    count[i] -= 2;
                }
                if (count[i] == 1) {
                    oddChar = (char) ('A' + i);
                }
            }

            // Construct the full palindrome string
            char[] palindrome = new char[s.length()];
            index = 0;
            for (int i = 0; i < firstHalf.length; i++) {
                palindrome[index++] = firstHalf[i];
            }
            if (oddChar != 0) {
                palindrome[index++] = oddChar;
            }
            for (int i = firstHalf.length - 1; i >= 0; i--) {
                palindrome[index++] = firstHalf[i];
            }

            return new String(palindrome);
        }
    }



