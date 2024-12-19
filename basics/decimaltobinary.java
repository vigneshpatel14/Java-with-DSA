package basics;

import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int r,ans=0;
        while(x>0)
        {
            r=x%2;
            ans=ans*10+r;
            x=x/2;

        }
        System.out.println(ans);
    }
}
