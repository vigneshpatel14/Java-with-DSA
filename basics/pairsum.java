package basics;
import java.util.Scanner;
class algebra{
     int sum(int a,int b)
    {
        return a+b;
    }
}
public class pairsum {
    public static void main(String[] args) {
        algebra obj = new algebra();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans = obj.sum(x,y);
        System.out.print(ans);


    }
}
