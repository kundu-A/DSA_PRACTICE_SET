/*
 * Time complexity = O(n^2)
 * Space complexity = O(1)
 */
import java.util.*;
class SelectionSortAlgo{
    public static void ascendingOrder(int ar[]){
        for(int i=0;i<ar.length;i++){
            int min_index=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]<ar[min_index])
                    min_index=j;
            }
            if(min_index!=i){
                int temp=ar[i];
                ar[i]=ar[min_index];
                ar[min_index]=temp;
            }
        }
        System.out.println("So the sorted array in ascending order is: ");
        System.out.println(Arrays.toString(ar));
    }
    public static void decendingOrder(int ar[]){
        for(int i=0;i<ar.length;i++){
            int min_index=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]>ar[min_index])
                    min_index=j;
            }
            if(min_index!=i){
                int temp=ar[i];
                ar[i]=ar[min_index];
                ar[min_index]=temp;
            }
        }
        System.out.println("So the sorted array in decending order is: ");
        System.out.println(Arrays.toString(ar));
    }
}
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        SelectionSortAlgo.ascendingOrder(ar);
        SelectionSortAlgo.decendingOrder(ar);
        sc.close();
    }
}
