import java.util.*;
public class PrintSecondDiagonal_2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int row=sc.nextInt();
        System.out.println("Enter the column size: ");
        int column=sc.nextInt();
        int ar[][]=new int[row][column];
        System.out.println("Enter elememts in array: ");
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++)
                ar[i][j]=sc.nextInt();
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
                System.out.print(ar[i][j]+" ");
            System.out.println();
        }
        System.out.println("Second Diagonal elements are: ");
        for(int i=0;i<ar.length;i++){
            for(int j=ar[i].length-1;j>=0;j--){
                if((i+j)==ar.length-1)
                    System.out.println(ar[i][j]);
            }
        }
        sc.close();
    }
}
