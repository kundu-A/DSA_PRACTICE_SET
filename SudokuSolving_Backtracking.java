/*
Write a program to solve a Sudoku puzzle by filling the empty cells.

A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.
 */

class Solution{
    public void solveSudoku(char[][] board){
        solveBoard(board);
        System.out.println("Your solved Sudoku is: ");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++)
                System.out.print(board[i][j]+" ");
            System.out.println();
        }
    }
    public boolean solveBoard(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isValid(board,i,j,c)){
                            board[i][j]=c;
                            if(solveBoard(board)){
                                return true;
                            }else{
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char board[][],int row,int col,char ch){
        for(int i=0;i<9;i++){
            if(board[row][i]==ch)
                return false;
            if(board[i][col]==ch)
                return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==ch)
                return false;
        }
        return true;
    }
}
public class SudokuSolving_Backtracking {
    public static void main(String[] args) {
        char board[][]={{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        System.out.println("Your Problem is : ");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++)
                System.out.print(board[i][j]+" ");
            System.out.println();
        }
        Solution solution=new Solution();
        solution.solveSudoku(board);
    }
}