import java.util.*;
public class MaximumElement {
    public static void longProcess(int ar[])
    {
        int max=-1;
        for (int i : ar) {
            if(i>max)
                max=i;
        }
        System.out.println("This is the largest element in the array: "+max);
    }
    public static void shortProcess(int ar[])
    {
        int max=-1;
        for (int i : ar) {
            max=Math.max(max, i);
        }
        System.out.println("This is the largest element in the array: "+max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        longProcess(ar);
        System.out.println("**************************************");
        shortProcess(ar);
        sc.close();
    }
}
