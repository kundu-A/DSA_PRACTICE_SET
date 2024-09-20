import java.util.*;
public class SumOfEvenIndexes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        int sum=0;
        for(int i=0;i<ar.length;i++){
            if(i%2==0)
                sum=sum+ar[i];
        }
        System.out.println("The sum of the elements present in the even indexes: "+sum);
        sc.close();
    } 
}