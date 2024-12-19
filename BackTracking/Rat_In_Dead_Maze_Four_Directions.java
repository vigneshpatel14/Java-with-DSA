package BackTracking;

public class Rat_In_Dead_Maze_Four_Directions {
    public static void main(String[] args) {
        int rows = 4 ;
        int cols = 6;
        int[][] maze = {{1,0,1,1,1,1},
                {1,1,1,1,0,1},
                {0,1,1,1,1,1},
                {0,0,1,0,1,1}};
        boolean[][] isvisited = new boolean[rows][cols]; // space --> O(N*N)

        print(0 , 0 , rows - 1, cols - 1, "" , maze , isvisited);
    }

    private static void print(int sr, int sc, int er, int ec, String s, int[][] maze , boolean[][] isvisited) {
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
        if(isvisited[sr][sc] == true)
        {
            return;
        }
        isvisited[sr][sc] = true;
        //Go right
        print(sr , sc + 1 , er , ec , s+"R" , maze , isvisited);
        //Go down
        print(sr + 1 , sc , er , ec , s + "D" , maze , isvisited);
        //Go left
        print(sr , sc - 1 , er , ec , s + "L" ,maze ,  isvisited);
        //Go up
        print(sr -1 , sc , er , ec , s + "U" ,maze , isvisited);
        //BackTracking
        isvisited[sr][sc] = false;

    }
}
