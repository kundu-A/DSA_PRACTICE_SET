//By using the modified Binary Search Approach we solve this.
//Time complexity: O(logN)
//Space complexity: O(N)
import java.util.*;
public class SquareRootAlgo {
    private static int findSquareRoot(int target) {
        int low=0,high=target,result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            long value=mid*mid;
            if(value==target){
                return mid;
            }
            else if(value<target){
                result=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which we want to find the square root:");
        int target=sc.nextInt();
        int result=findSquareRoot(target);
        if((result*result)==target)
            System.out.println("The Square Root of the given element is: "+result);
        else
            System.out.println("The nearest square root of this element is: "+result);
        sc.close();
    }
}
