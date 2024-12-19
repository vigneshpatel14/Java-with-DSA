package BackTracking;

public class MazePath_Four_Directions {
    public static void main(String[] args) {
        int rows = 3 , cols = 3;
        boolean[][] isvisited = new boolean[rows][cols]; //By deafult false
        print(0 , 0 , rows - 1  , cols - 1 , "" , isvisited);
    }

    private static void print(int sr, int sc, int er, int ec , String s , boolean[][] isvisited)
    {

        if(sr < 0 || sc < 0)
            return;

        //Edge cases ah box nundi bayataki pokunda
        if( sr > er || sc > ec)
        {
            return;
        }
        if(isvisited[sr][sc] == true)
        {
            return; //Already visited
        }
        if( sr == er && sc == ec)
        {
            System.out.println(s);
            return;
        }

        isvisited[sr][sc] = true; //This place lo unnav ga so mark it as true
        //Go down
        print(sr + 1 , sc , er , ec , s + "D" , isvisited);
        //Go right
        print(sr  , sc + 1 , er , ec , s + "R" , isvisited);
        //Go left
        print(sr , sc - 1 , er , ec , s + "L" , isvisited);
        //Go up
        print(sr -1 , sc , er , ec , s + "U" , isvisited);
        //BackTracking
        isvisited[sr][sc] = false;
    }
}
