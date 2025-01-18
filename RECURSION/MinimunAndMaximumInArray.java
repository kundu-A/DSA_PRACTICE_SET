import java.util.*;
public class MinimunAndMaximumInArray {
    public static int minimun(int ar[],int size){
        if(size==1){
            return ar[size-1];
        }
        /*else{
            int s=ar[size-1];
            int p=minimun(ar, size-1);
            if(s<p)
                return s;
            else{
                s=p;
                return s;
            }
        }*/
        else{
            if(ar[size-1]<minimun(ar, size-1))
                return ar[size-1];
            else
                return minimun(ar, size-1);
        }
    }
    public static int maximun(int ar[],int size){
        if(size==1){
            return ar[size-1];
        }
        /*else{
            int s=ar[size-1];
            int p=maximun(ar, size-1);
            if(s>p)
                return s;
            else{
                s=p;
                return s;
            }
        }*/
        else{
            if(ar[size-1]<maximun(ar, size-1))
                return ar[size-1];
            else
                return maximun(ar, size-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("The Minimum Value of the Array is: "+minimun(ar, size));
        System.out.println("The Maximun Value of the Array is: "+maximun(ar, size));
        sc.close();
    }
}
