package patterns;

import java.util.Scanner;

public class numerical_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS AND COLUMNS");
        int r=sc.nextInt();
//        int c = sc.nextInt();
        for (int i=1;i<=r;i++)
        {
            for (int j=i;j<=r;j++)
            {
                System.out.print(j);
            }
            for (int k=1;k<i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
