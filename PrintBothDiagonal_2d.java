import java.util.*;
public class PrintBothDiagonal_2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int row=sc.nextInt();
        System.out.println("Enter the column size: ");
        int column=sc.nextInt();
        int ar[][]=new int[row][column];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                ar[i][j]=sc.nextInt();
        }
        System.out.println("This is your matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                System.out.print(ar[i][j]+" ");
            System.out.println();
        }
        System.out.println("This is your primary diagoanl elements: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i==j)
                    System.out.println(ar[i][j]);
            }
        }
        System.out.println("This is your secondary diagonal elements: ");
        for(int i=0;i<row;i++){
            for(int j=column-1;j>=0;j--){
                if((i+j)==ar.length-1)
                System.out.println(ar[i][j]);
            }
        }
        sc.close();
    }
}
