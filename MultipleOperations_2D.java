import java.util.*;
public class MultipleOperations_2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The the row size: ");
        int m=sc.nextInt();
        System.out.println("Enter the column size: ");
        int n=sc.nextInt();
        int ar[][]=new int[m][n];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                ar[i][j]=sc.nextInt();
        }
        int positive=0,negative=0,zeros=0,odds=0,evens=0;
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++) {
                if(ar[i][j]>0)
                    positive++;
                if(ar[i][j]<0)
                    negative++;
                if(ar[i][j]%2==0)
                    evens++;
                if(ar[i][j]%2!=0)
                    odds++;
                if(ar[i][j]==0)
                    zeros++;
                
            }
        }
        System.out.println("Numbers of positive numbers: "+positive);
        System.out.println("Numbers of negative numbers: "+negative);
        System.out.println("Numbers of evens numbers: "+evens);
        System.out.println("Numbers of odds numbers: "+odds);
        System.out.println("Numbers of zeros numbers: "+zeros);
        sc.close();
    }
}
