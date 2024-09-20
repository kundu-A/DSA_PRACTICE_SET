/*
 * Time complexity = O(n^2)
 * Space complexity = O(1)
 */
import java.util.*;
class InsertionSortAlgo{
    public static void ascendingOrder(int ar[]){
        for(int i=1;i<ar.length;i++){
            int j=i;
            while(j>0 && ar[j]<ar[j-1]){
                int temp=ar[j];
                ar[j]=ar[j-1];
                ar[j-1]=temp;
                j--;
            }
        }
        System.out.println("Sorted array in ascending order is: ");
        System.out.println(Arrays.toString(ar));
    }
    public static void decendingOrder(int ar[]){
        for(int i=1;i<ar.length;i++){
            int j=i;
            while(j>0 && ar[j]>ar[j-1]){
                int temp=ar[j];
                ar[j]=ar[j-1];
                ar[j-1]=temp;
                j--;
            }
        }
        System.out.println("Sorted array in decending order is: ");
        System.out.println(Arrays.toString(ar));
    }
}
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        InsertionSortAlgo.ascendingOrder(ar);
        InsertionSortAlgo.decendingOrder(ar);
        sc.close();
    }
}
