/*
 * Time complexity = O(n^2)
 * Space complexity = O(1)
 */
import java.util.*;
class BubbleSortAlgo{
    public static void ascendingOrder(int ar[]){
        System.out.println("In Ascending Order:");
        for(int i=0;i<ar.length;i++){
            boolean flag=false;
            for(int j=0;j<ar.length-1-i;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag)
                break;
        }
        System.out.println("Sorted elements are: ");
        for (int i : ar) {
            System.out.print(i+" ");
        }
    }
    public static void decendingOrder(int ar[]){
        System.out.println("In Decending order: ");
        for(int i=0;i<ar.length;i++){
            boolean flag=false;
            for(int j=0;j<ar.length-1-i;j++){
                if(ar[j]<ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    flag=true;
                }
                if(!flag)
                    break;
            }
        }
        System.out.println("Sorted elements are: ");
        for (int i : ar) {
            System.out.print(i+" ");
        }
    }
}
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        BubbleSortAlgo.ascendingOrder(ar);
        System.out.println();
        BubbleSortAlgo.decendingOrder(ar);
        sc.close();
    }
}
