import java.util.*;
public class LastOccurancceOfTargetElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Enter the target element: ");
        int target=sc.nextInt();
        int index=0;
        System.out.println("By using Linear Search algorithm");
        index=LinearSearchAlgo(ar, target);
        if(index!=-1)
            System.out.println("Last index of the "+target+" is : "+index);
        else
            System.out.println("Element is not found.");
        System.out.println("By using Binary Search algorithm");
        index=BinarySearchAlgo(ar, target);
        if(index!=-1)
            System.out.println("Last index of the "+target+" is : "+index);
        else
            System.out.println("Element is not found.");
        sc.close();
    }
    public static int LinearSearchAlgo(int ar[],int target){
        int index=-1;
        for(int i=0;i<ar.length;i++){
            if(target==ar[i])
                index=i;
        }
        return index;
    }
    public static int BinarySearchAlgo(int ar[],int target){
        int low=0,high=ar.length-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(ar[mid]==target)
                return mid;
            else if(ar[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
}
