import java.util.*;
public class FindElement_LinearSearch {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Enter the target element to find: ");
        int x=sc.nextInt();
        int flag=0;
        for (int i=0;i<size;i++) {
            if(ar[i]==x){
                System.out.println("Target element is found at: "+(i+1));
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Element is not present.");
        sc.close();
    }   
}