import java.util.*;
public class SumOfArrayElements {
    public static int findSum(int ar[],int n){
        if(n==1)
            return ar[n-1];
        else
            return ar[n-1]+findSum(ar, n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println(findSum(ar,size));
        sc.close();
    }
}
