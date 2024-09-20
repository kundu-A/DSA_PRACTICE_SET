import java.util.*;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input to check that it is perfect square or not: ");
        int input=sc.nextInt();
        int divident=squarecCalculation(input);
        if((divident*divident)==input)
            System.out.println("It is perfect square.");
        else
            System.out.println("It is not a perfect square.");
        sc.close();
    }
    public static int squarecCalculation(int target){
        int low=0,high=target;
        while (low<=high) {
            int mid=low+(high-low)/2;
            int value=mid*mid;
            if(value==target)
                return mid;
            else if(value<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return 0;
    }
}
