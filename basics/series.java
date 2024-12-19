package basics;

import java.util.Scanner;
//1-2+3.......n
public class series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                s-=i;
            else
                s+=i;
        }
        System.out.println(s);

    }
}
