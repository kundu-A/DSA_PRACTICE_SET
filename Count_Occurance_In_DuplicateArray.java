import java.util.*;;
public class Count_Occurance_In_DuplicateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Enter the target element: ");
        int target=sc.nextInt();
        linearCount(ar, target);
        //binaryCount(ar, target);
        sc.close();
    }
    public static void linearCount(int ar[],int target){
        System.out.println("By using linear search algorithm.");
        int count=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==target)
                count++;
        }
        System.out.println("Total number of the target element is: "+count);
    }
    /*public static void binaryCount(int ar[],int target){

    }*/
}
