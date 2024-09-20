import java.util.*;
public class Middle_Row_Column_Print_2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int row=sc.nextInt();
        System.out.println("Enter the column size: ");
        int column=sc.nextInt();
        int ar[][]=new int[row][column];
        System.out.println("Enter elements in array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                ar[i][j]=sc.nextInt();
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                System.out.print(ar[i][j]+" ");
            System.out.println();
        }
        int midRow=(row/2),midColumn=(column/2);
        System.out.println("Middle column elements: ");
        for(int i=0;i<row;i++){
            System.out.print(ar[i][midColumn]+" ");
        }
        System.out.println();
        System.out.println("Middle row elements: ");
        for(int i=0;i<row;i++){
            System.out.print(ar[midRow][i]+" ");
        }
        sc.close();
    }
}
