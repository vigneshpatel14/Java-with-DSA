package BackTracking;

public class MazePath {
    public static void main(String[] args) {
        int rows = 3 , cols = 3;
        int count = maze(1 , 1 , rows , cols);
        System.out.println(count);
    }


    private static int maze(int sr , int sc , int er , int ec)
    {
        if( sr > er || sc > ec) return 0;
        if(sr == er && sc == ec) return 1;
        int downways = maze(sr + 1, sc , er , ec);
        int rightways = maze(sr , sc + 1, er , ec);
        int totalways = downways + rightways;
        return totalways;
    }
}
