//Use Binary Search Algorithm to find the fisrt occurance of any target element.
/*
 * Time complexity: O(logN)
 * Space complexity: O(N)
 */
import java.util.*;
public class LowerBoundAlgo {
    private static int findLowerBound(int[] ar, int target) {
        int low=0,high=ar.length-1,index=-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(ar[mid]==target){
                index=mid;
                high=mid-1;
            }
            else if(ar[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arrya: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in an array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Enter the target element to find it's first occurance: ");
        int target=sc.nextInt();
        int index=findLowerBound(ar,target);
        if(index==-1)
            System.out.println("Element is not present in the array.");
        else
            System.out.println("Element is present and it's first occurance is present at :"+(index+1));
        sc.close();
    }
}
