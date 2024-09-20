import java.util.*;
public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of the array: ");
        int range=sc.nextInt();
        int ar[]=new int[range];
        System.out.println("Enter values in array: ");
        for(int i=0;i<range;i++)
            ar[i]=sc.nextInt();
        DuplicateElements obj=new DuplicateElements();
        obj.findDuplicate(ar);
        sc.close();
    }
    public void findDuplicate(int ar[])
    {
        System.out.println("Duplicates elements are: ");
        int flag=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    flag=1;
                    System.out.print(ar[i]+" at "+(j+1));
                }
            }
        }
        if(flag==0)
            System.out.println("Sorry!!..No duplicate element is present in the array.");
    }
}
