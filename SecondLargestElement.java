import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        Arrays.sort(ar);
        System.out.println("This is the second largest element in the array: "+ar[ar.length-2]);
        sc.close();
    }
}
