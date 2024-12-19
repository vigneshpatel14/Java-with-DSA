package patterns;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        System.out.println("ENTER NO OF ROWS");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1;i<=x;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
