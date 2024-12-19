package basics.operators;

import java.util.Scanner;



public class count_bits_ForConversion {
        public static int countBits(int n)
        {
            int count  = 0;
            while(n>0)
            {
                count += n & 1;
                n>>=1;
            }
            return count;
        }

        public static int FlipBits(int x , int y)
        {
            int xor = x ^ y;
            return countBits(xor);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(FlipBits(x,y));
    }
}
