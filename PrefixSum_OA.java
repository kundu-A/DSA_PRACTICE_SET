//Here we use Optimize Approach to calculate the prefixsum.
//Time Complexity = O(M*N)
//Space Complexity = O(1)
import java.util.*;
class OptimizedAlgorithms
{
    public void finalArrya(int ar[][])
    {
        //Row-wise.
        for(int i=0;i<ar.length;i++)
        {
            for(int j=1;j<ar[0].length;j++)
                ar[i][j]+=ar[i][j-1];
        }
        //Column-wise.
        for(int j=0;j<ar[0].length;j++)
        {
            for(int i=1;i<ar.length;i++)
                ar[i][j]+=ar[i-1][j];
        }
        quaries(ar);
    }
    public void quaries(int arr[][])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting row coordinate: ");
        int r1=sc.nextInt();
        System.out.println("Enter the starting column coordinate: ");
        int c1=sc.nextInt();
        System.out.println("Enter the ending row coordinate: ");
        int r2=sc.nextInt();
        System.out.println("Enter the ending column coordinate: ");
        int c2=sc.nextInt();
        int sum=arr[r2][c2],up=arr[r1-1][c2],left=arr[r2][c1-1],region=arr[r1-1][c1-1];
        int result=sum-up-left+region;
        System.out.println(result);
        sc.close();
    }
}
public class PrefixSum_OA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row: ");
        int row=sc.nextInt();
        System.out.println("Enter the size of column: ");
        int column=sc.nextInt();
        int ar[][]=new int[row][column];
        System.out.println("Enter values in the array: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
                ar[i][j]=sc.nextInt();
        }
        OptimizedAlgorithms obj=new OptimizedAlgorithms();
        obj.finalArrya(ar);
        sc.close();
    }
}
