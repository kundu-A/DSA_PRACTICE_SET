import java.util.*;
public class Count_1s_In_SortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        int c=0;
        c=linearCount(ar);
        if(c==-1)
            System.out.println("No 1 is present.");
        else
            System.out.println("Total number of 1's : "+(size-c));
        c=binaryCount(ar);
        if(c==-1)
            System.out.println("No 1 is present.");
        else
            System.out.println("Total number of 1's : "+(size-c));
        sc.close();
    }
    public static int linearCount(int ar[]){
        int index=-1;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==1){
                index=i;
                break;
            }
        }
        return index;
    }
    public static int binaryCount(int ar[]){
        int low=0,high=ar.length-1;
        int index=-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(ar[mid]==1){
                index=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return index;
    }
}
