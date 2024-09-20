import java.util.*;
public class PassRequired_ByBubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        int iteration=0;
        for(int i=0;i<size;i++){
            int flag=0;
            for(int j=0;j<ar.length-1-i;j++){
                if(ar[j]<ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    flag=1;
                }
            }
            if(flag!=0)
                iteration++;
        }
        System.out.println("Total number of iteration to sort the array is: "+iteration);
        sc.close();
    }
}
