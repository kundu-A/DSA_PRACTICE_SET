import java.util.*;
public class SlidingWindow {
    public static void main(String[] args) {
        System.out.println("SLINDING WINDOW PROBLEM USING BRUTE FORCE APPROACH");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Enter the size of the window:");
        int windowSize=sc.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<=ar.length-windowSize;i++){
            int max=Arrays.stream(ar,i,i+windowSize).max().orElseThrow();
            arrayList.add(max);
        }
        System.out.println(arrayList.size()+"\nAnd the Maximum elements are: "+arrayList);
        sc.close();
    }
}
