/*
 * Time Complexity: O(logN)
 * Space Complexity: O(1)
 */
import java.util.*;
public class BinarySearchAlgo {
    public static int BinarySearch(int ar[],int target){
        int low=0,high=ar.length-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(ar[mid]==target)
                return mid;
            else if(ar[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the array in sortde order(Increment order): ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Enter the target element: ");
        int target=sc.nextInt();
        int index=BinarySearch(ar,target);
        if(index==0)
            System.out.println("Element is not found.");
        else
            System.out.println("Element is found at: "+(index+1));
        sc.close();
    } 

}
/*
 * ADVANTAGES:
 *      1.Time complexity is very less as compare to the Linear Search.
 *      2.When we search any element in a large amount of data then this algo is suitable.
 * DISADVANTAGES:
 *      1.It is mendatory that the array element should be in assending or decending order other wise it not not work.
 */