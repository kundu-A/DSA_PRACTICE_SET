import java.util.*;
class MissingNumber
{
    /*
     * Here the time complexity = O(n)
     * Space Complexity = O(1).
     * But this is more efficient than the second one because here we do not use any in-built method.
     */
    public void case1(int ar[])
    {
        int n=ar.length;
        int sumOfNaturalNumbers=((n+1)*(n+2))/2;
        int sum=0;
        for(int i=0;i<ar.length;i++)
            sum+=ar[i];
        System.out.println("So the missing element is : "+(sumOfNaturalNumbers-sum));
    }
    /*
     * Here the time complexity = O(n)
     * Space Complexity = O(1).
     */
    public void case2(int ar[])
    {
        Arrays.sort(ar);
        int a=ar[0]-0;
        for(int i=0;i<ar.length;i++)
        {
            if((i+a)!=ar[i])
            {
                System.out.println("So, the missing element is: "+(i+a));
                break;
            }
        }
    }
}
public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of an array: ");
        int range=sc.nextInt();
        int ar[]=new int[range];
        System.out.println("Enter values in the array: ");
        for(int i=0;i<range;i++)
            ar[i]=sc.nextInt();
        MissingNumber obj=new MissingNumber();
        obj.case1(ar);
        System.out.println("*******************************");
        obj.case2(ar);
        sc.close();
    }
}
