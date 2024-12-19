package basics;

import java.util.Scanner;

public class a_power_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 1, k = 1;
        for (i = 1; i <= b; i++) {
            k = k * a;
        }
        System.out.println(k);
    }


}
