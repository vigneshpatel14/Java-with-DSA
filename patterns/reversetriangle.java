package patterns;

import java.util.Scanner;

public class reversetriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int k=1;
        for (int i=1;i<=r;i++)
        {
            for (int j=k;j<=r;j++)
            {
                System.out.print("*");
            }
            k++;
            System.out.println();
        }
    }
}
