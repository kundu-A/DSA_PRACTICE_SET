import java.util.*;
public class PassRequired_BySelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        int iteration=0;
        for(int i=0;i<ar.length;i++){
            int min_index=i;
            int flag=0;
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]>ar[min_index])
                    min_index=j;
            }
            if(min_index!=i){
                int temp=ar[i];
                ar[i]=ar[min_index];
                ar[min_index]=temp;
                flag=1;
            }
            if(flag!=0)
                iteration++;
        }
        System.out.println(iteration);
        sc.close();
    }
}
