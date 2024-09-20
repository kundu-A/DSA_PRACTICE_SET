import java.util.*;
public class BinarySearch_Recursion {
    public static int binarySearch(int ar[],int low,int high,int target){
        while (low<=high) {
            int mid=(low+high)/2;
            if(ar[mid]==target)
                return mid;
            else if(ar[mid]<target)
                return binarySearch(ar, mid+1, high, target);
            else
                return binarySearch(ar, low, mid-1, target);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Enter the number to find: ");
        int target=sc.nextInt();
        int result=binarySearch(ar,0,size-1,target);
        if(result==-1)
            System.out.println("This element is not present in the array.");
        else
            System.out.println("This element is present at : "+(result+1)+" position");
        sc.close();
    }
}
