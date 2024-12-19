package basics;

import java.awt.geom.CubicCurve2D;
import java.util.Random;
import java.util.Scanner;
 class square extends Thread
 {
     int x;
     square(int n)
     {
         x=n;
     }
     public void run()
     {
         int sqr=x*x;
         System.out.println("square"+sqr);
     }
 }
 class cube extends Thread
 {
     int x;
     cube(int n)
     {
         x=n;
     }
     public void run()
     {
         int cube=x*x*x;
         System.out.println("Cube"+cube);
     }
 }
class Rnumber extends Thread
{
    public void run()
    {
        Random random =new Random();
        for (int i=0;i<5;i++)
        {
            int randomnumber= random.nextInt(20);
            System.out.println("Random number is"+randomnumber);

                square s = new square(randomnumber);
                s.start();

                cube c = new cube(randomnumber);
                c.start();

            try
            {
                Thread.sleep(5000);
            }
            catch (InterruptedException ex)
            {
                System.out.println(ex);
            }
        }
    }
}

public class labinternal1 {
    public static void main(String[] args) {
        Rnumber n = new Rnumber();
        n.start();
    }
}
