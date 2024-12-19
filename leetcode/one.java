package leetcode;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class one {
        public static List<String> findRookMoves(List<String> positions) {
            List<String> result = new ArrayList<>();

            for (String position : positions) {
                char column = position.charAt(0);
                int row = Character.getNumericValue(position.charAt(1));

                // Horizontal moves
                for (int i = 1; i <= 8; i++) {
                    if (i != row) {
                        result.add(column + "" + i);
                    }
                }

                // Vertical moves
                for (char c = 'a'; c <= 'h'; c++) {
                    if (c != column) {
                        result.add(c + "" + row);
                    }
                }
            }

            return result;
        }

        public static void main(String[] args) {
            try {
                Scanner scanner = new Scanner(System.in);

                int t = scanner.nextInt();
                List<String> positions = new ArrayList<>();

                for (int i = 0; i < t; i++) {
                    positions.add(scanner.next());
                }

                List<String> moves = findRookMoves(positions);

                for (String move : moves) {
                    System.out.println(move);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


}
