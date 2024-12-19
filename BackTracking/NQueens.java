package BackTracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nqueen(board , 0);


    }

    private static void nqueen ( char[][] board, int row)
    {
        //Ah ok row lo anni columns ni checking which is safe
        int n = board.length;
        if(row == n)
        {
            //Ante anni rows traversed -- Now print
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(); //Spacing

            return;

        }
        for (int j = 0 ; j< n ; j++)
        {
            if(issafe(board , row , j))
            {
                //Ah place lo pettadam safe ayte
                board[row][j] = 'Q';
                //Oka sari pettinaka next row ki vellu
                nqueen(board , row + 1);
                //Now backTrack
                board[row][j] = 'X';
            }
            //If ah row motham unsafe ayte ante condititon fail ayte

        }
    }

    private static boolean issafe(char[][] board, int row, int col) {
        //Safe eppudu avutadi
        //Check row
        int n = board.length;
        for (int j = 0 ; j< n ; j++)
        {
            if(board[row][j] == 'Q')
            {
                return false; //Ah row lo ekkada unna false
            }
            //Ante east west motham checked
        }


        //Check all columns

        for (int i = 0 ; i< n ; i++)
        {
            if(board[i][col] == 'Q')
            {
                return false; //Ah column lo ekkada unna false
            }
            //North south - north checked
        }

        //Now diagonal check
        //North west , north east , south east , south west


        //Check North east

        int i = row;
        int j = col;
        while( i >= 0 && j < n)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
            i--;
            j++;
        }


        //Check south east

        i = row;
        j = col;

        while (i < n && j < n)
        {
            if(board[i][j] == 'Q')
            {
                return  false;
            }
            i++;
            j++;
        }


        //Check south west

        i = row;
        j = col;

        while (i < n && j >= 0)
        {
            if(board[i][j] == 'Q')
            {
                return  false;
            }
            i++;
            j--;
        }

        //Check north west

        i = row;
        j = col;

        while (i >= 0 && j >= 0)
        {
            if(board[i][j] == 'Q')
            {
                return  false;
            }
            i--;
            j--;
        }


        return true;

    }
}
