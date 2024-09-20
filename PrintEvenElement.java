import java.util.*;
public class PrintEvenElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of then array:" );
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Here are the even elements: ");
        for (int i : ar) {
            if(i%2==0)
                System.err.println(i);
        }
        sc.close();
    }
}
