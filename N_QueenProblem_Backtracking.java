/*
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.
 */

import java.util.*;
class Solution{
    public static void queen(char[][] board, int row, List<List<String>> ans) {
        if(row==board.length){
            ans.add(makeString(board));
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                queen(board, row+1, ans);
                board[row][col]='.';
            }
        }
    }
    public static boolean isSafe(char[][] board,int row,int col){
        //Check vertically.
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Check Left Diagonal.
        int maxLeft=Math.min(row, col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]=='Q')
                return false;
        }
        //Check Right Diagonal.
        int maxRight=Math.min(row, board.length-1-col);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]=='Q')
                return false;
        }
        return true;
    }
    public static List<String> makeString(char[][] board) {
        List<String> l=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String row=new String(board[i]);
            l.add(row);
        }
        return l;
    }     
    public List<List<String>> solveNQueen(int n){
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                board[i][j]='.';
        }
        List<List<String>> ans=new ArrayList<>();
        queen(board,0,ans);
        return ans;
    }
}
public class N_QueenProblem_Backtracking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the matrix: ");
        int size=sc.nextInt();
        Solution solution=new Solution();
        List<List<String>> result=solution.solveNQueen(size);
        System.out.println(result);
        sc.close();
    }
}
