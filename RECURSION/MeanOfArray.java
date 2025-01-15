import java.util.*;
public class MeanOfArray {
    public static double calculateMean(int ar[],int n){
        if(n==1)
            return (double)ar[n-1];
        else
            return ((double)(calculateMean(ar,n-1)*(n-1)+ar[n-1])/n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pslease enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println(calculateMean(ar,ar.length));
        sc.close();
    }
}
