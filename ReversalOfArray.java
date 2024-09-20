import java.util.*;
class Reverse
{
    public void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    /*
     * Here the Time Complexity = O(n):-Becasue we use loop with total number of array length.
     * Space Complexity = O(n):- Because we use extra array to store the reversal number.
     */
    public void worstCase(int arr[])
    {
        System.out.println("Your Original array is: ");
        display(arr);
        int ar[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
            ar[i]=arr[arr.length-i-1];
        System.out.println("Your Updated array is: ");
        display(ar);
    }
    /*
     * Here the Time Complexity = O(n):-Becasue we use loop.
     * Space Complexity = O(1):- Because we do not use extra array to store the reversal number.
     */
    public void bestCase(int arr[])
    {
        System.out.println("Your Original array is: ");
        display(arr);
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println("Your Updated array is: ");
        display(arr);
    }
}

public class ReversalOfArray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of an array: ");
    int range=sc.nextInt();
    int arr[]=new int[range];
    System.out.println("Enter values in the array: ");
    for(int i=0;i<range;i++)
        arr[i]=sc.nextInt();
    Reverse ob=new Reverse();
    System.out.println("With worst case: Time Complexity = O(n) & Space Complexity = O(n)");
    ob.worstCase(arr);
    System.out.println("*********************************************");
    System.out.println("With best case: Time Complexity = O(n) & Space Complexity = O(1");
    ob.bestCase(arr);
    sc.close();
    }  
}