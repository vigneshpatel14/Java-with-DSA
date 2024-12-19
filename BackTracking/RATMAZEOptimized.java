package BackTracking;

public class RATMAZEOptimized {
    public static void main(String[] args) {
        int rows = 4 ;
        int cols = 6;
        int[][] maze = {{1,0,1,1,1,1},
                {1,1,1,1,0,1},
                {0,1,1,1,1,1},
                {0,0,1,0,1,1}};
        //boolean[][] isvisited = new boolean[rows][cols];
        // space --> O(N*N)

        print(0 , 0 , rows - 1, cols - 1, "" , maze);
    }

    private static void print(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if (sr < 0 || sc < 0)
        {
            return;
        }
        if(sr > er || sc > ec)
        {
            return;
        }
        if(sr == er && sc == ec)
        {
            System.out.println(s);
            return;
        }
        if(maze[sr][sc] == 0)
        {
            return;
        }
        if(maze[sr][sc] == -1)  //This was already visited so dont visit again
        {
            return;
        }
        maze[sr][sc] = -1;
        //Go right
        print(sr , sc + 1 , er , ec , s+"R" , maze );
        //Go down
        print(sr + 1 , sc , er , ec , s + "D" , maze );
        //Go left
        print(sr , sc - 1 , er , ec , s + "L" ,maze );
        //Go up
        print(sr -1 , sc , er , ec , s + "U" ,maze );
        //BackTracking
        maze[sr][sc] = 1;

    }
}
