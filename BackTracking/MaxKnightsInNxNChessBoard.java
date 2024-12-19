package BackTracking;

public class MaxKnightsInNxNChessBoard {

    static int maxKnights = - 1 ; //To keep track of max knights
    static int number = 5;
    public static boolean isSafe(char[][] board , int row , int col)
    {
        //Checks is it valid to place there or not
        int n = board.length;

        int i , j;

        //But i , j conditions check chy
        i = row - 2;
        j = col + 1;
        if(i>= 0 && j <n && board[i][j] == 'K') //Ah place lo already knight unte return false
        {
            return false;
        }

        //2U 1L
        i = row - 2;
        j = col - 1;
        if(i>= 0 && j >=0 && board[i][j] == 'K')
        {
            return false;
        }

        //2D 1R
        i = row + 2;
        j = col + 1;
        if(i<n && j <n && board[i][j] == 'K')
        {
            return false;
        }

        //2D 1L
        i = row + 2;
        j = col - 1;
        if(i<n && j >=0 && board[i][j] == 'K')
        {
            return false;
        }




        //2R 1U
        i = row - 1;
        j = col + 2;
        if(i>=0 && j <n && board[i][j] == 'K')
        {
            return false;
        }

        //2R 1D
        i = row + 1;
        j = col + 2;
        if(i<n && j <n && board[i][j] == 'K')
        {
            return false;
        }


        //2L 1U
        i = row - 1;
        j = col - 2;
        if(i>=0 && j >=0 && board[i][j] == 'K')
        {
            return false;
        }

        //2L 1D
        i = row + 1;
        j = col - 2;
        if(i<n && j >=0 && board[i][j] == 'K')
        {
            return false;
        }


        return true;
    }


    public static void nknight(char[][] board , int row , int col , int num)
    {
        int n = board.length;

        if(row == n) //Base Case
        {
            //Ante anni rows traversed -- Now print
            //if(num == number)
            //{
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }
            System.out.println();
            //}

            maxKnights = Math.max(maxKnights , num);
            return;

        }

        else if(isSafe(board, row ,col)) //Else if chusuko
        {
            board[row][col] = 'K';
            if(col != n-1)
            {
                //Recursion
                nknight(board, row, col + 1, num + 1);
                //Ante ah row motham fill cheyachu ga
            }
            else
            {
                nknight(board, row + 1, 0, num + 1);
                //Ante next row lo first nundi check chy
            }

            board[row][col] = 'x'; //BackTracking
        }


        if(col != n-1) nknight(board, row, col + 1, num );
        else nknight(board, row + 1, 0, num);


    }

    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x'; //Empty Board
            }
        }

        nknight(board , 0 , 0 , 0);
        System.out.println(maxKnights);

    }
}

