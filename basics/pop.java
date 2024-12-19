package basics;
import java.util.Scanner;
public class pop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            printRightAngledTriangle(N);
            System.out.println();
        }
    }
    private static void printRightAngledTriangle(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i + 1; j <= N; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}

//public class Main {
//    public static void main(String[] args) {
//        int N = 4; // Change this value to change the size of the triangle
//        printRightAngledTriangle(N);
//    }
//
//
//}


