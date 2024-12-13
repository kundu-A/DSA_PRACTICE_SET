/*
    RATE IN A MAZE PROBLEM:
 * Consider a rat placed at (0,0) in a square matrix of order N*N . It has to reach the destination at (N-1 ,N-1). Find all possible paths that the rat can take to reach from source to destination . The directions in which the rat can move "U(up)" , "D(down)" , "L(left)" , "R(right)".Value 0 at a cell in the matrix represents that it is blocked and rat cannot move to it while value 1at a cell in the matrix represents that rat can travel through it.
 * Note: In a path , no cell be visited more than one time.If the source cell is 0 , the rat cannot move to any other cell.
 */

import java.util.ArrayList;
import java.util.Scanner;
class Solution{
    public static void solveMaze(ArrayList<String> ans, int r, int c, int[][] m, int n, String path,boolean[][] vis) {
        if(r==n-1 && c==n-1 && m[r][c]!=0){
            ans.add(path);
            return;
        }
        if(c>=0 && c<n && r>=0 && r<n){
            if(vis[r][c]==true || m[r][c]==0){
                return;
            }
            vis[r][c]=true;
            solveMaze(ans, r+1, c, m, n, path+'D', vis);//Down
            solveMaze(ans, r, c-1, m, n, path+'L', vis);//Left
            solveMaze(ans, r, c+1, m, n, path+'R', vis);//Right
            solveMaze(ans, r-1, c, m, n, path+'U', vis);//Up
            vis[r][c]=false;
        }
    }
    public static ArrayList<String> findPath(int m[][],int n){
        ArrayList<String> ans=new ArrayList<>();
        boolean vis[][]=new boolean[n][n];
        solveMaze(ans,0,0,m,n,"",vis);
        return ans;
    }
}
public class RateInAMaze_Backtracking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int size=sc.nextInt();
        int ar[][]=new int[size][size];
        System.out.println("Enter values (0s and 1s) in the matrix: ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++)
                ar[i][j]=sc.nextInt();
        }
        ArrayList<String>result=Solution.findPath(ar, size);
        System.out.println(result);
        sc.close();
    }
}