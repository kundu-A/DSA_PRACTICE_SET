/*
 * Time complexity = O(n)
 * Space Complexity = O(n) : Because to execute the recursive call , internally use a stack to maintain the every call record , so to store the record of every step it will depends on the number of calls.
 */
import java.util.*;
public class Factorial_Recursion {
    public static int findFactorial(int n){
        int result=0;
        if(n==0 || n==1)
            return 1;
        else
            result=n*findFactorial(n-1);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the Factorial: ");
        int n=sc.nextInt();
        int result=findFactorial(n);
        System.out.println("Factorial of "+n+" is : "+result);
        sc.close();
    }
}