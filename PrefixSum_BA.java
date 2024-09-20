//It is BruteForce Approach.
//Time Complexity = O(M*N)
//Space Complexity = o(1)
import java.util.*;
public class PrefixSum_BA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row range:" );
        int row=sc.nextInt();
        System.out.println("Enter the column range: ");
        int col=sc.nextInt();
        int ar[][]=new int[row][col];
        System.out.println("Enter values in the array: ");
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length;j++)
                ar[i][j]=sc.nextInt();
        }
        System.out.println("Your 2D array is: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                System.out.print(ar[i][j]+" ");
            System.out.println();
        }
        System.out.println("Enter the starting row: ");
        int r1=sc.nextInt();
        System.out.println("Enter the starting column: ");
        int c1=sc.nextInt();
        System.out.println("Enter the ending row: ");
        int r2=sc.nextInt();
        System.out.println("Enter the ending column: ");
        int c2=sc.nextInt();
        int sum=0;
        for(int i=r1;i<=r2;i++)
        {
            for(int j=c1;j<=c2;j++)
                sum+=ar[i][j];
        }
        System.out.println(sum);
        sc.close();
    }
}
