/*
 * Time Complexity = O(n)
 * Space Complexity = O(n)
 */
import java.util.*;
public class AlternateSumSeries_Recursion {
    public static int findSum(int num){
        if(num==0)
            return 0;
        if(num%2==0)
            return findSum(num-1)-num;
        else
            return findSum(num-1)+num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to value of alternate sum series: ");
        int num=sc.nextInt();
        int result=findSum(num);
        System.out.println("The sum is: "+result);
        sc.close();
    }
}
