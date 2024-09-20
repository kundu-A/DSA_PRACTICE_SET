import java.util.*;
public class LargestElement_2d {
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
        int max=-1;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(ar[i][j]>max)
                    max=ar[i][j];
            }
        }
        System.out.println("This is the Maximum element of this arrya: "+max);
        sc.close();
    }
}
