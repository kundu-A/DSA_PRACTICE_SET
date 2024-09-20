/*It is a Optimized Approach
 * Optimized Approach
 * Time Complexity = O(log n)
 */

import java.util.*;
public class FindingPower_OA_Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base value: ");
        int num=sc.nextInt();
        System.out.println("Enter the power value: ");
        int power=sc.nextInt();
        if(power%2==0)
            System.out.println(num+"^"+power+" is : "+findPower(num, power));
        else
        System.out.println(num+"^"+power+" is : "+(2*findPower(num, power-1)));
        sc.close();
    }
    private static long findPower(int a, int b) {
        long result=0,finalResult=0;
        if(b==1)
            return a;
        else{
            result=findPower(a,b/2);
            finalResult=result*result;
        }
        return finalResult;
    }
}
