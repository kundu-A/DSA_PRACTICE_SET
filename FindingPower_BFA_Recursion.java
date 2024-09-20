/*
 * It is a Brute Force Appraoch
 * Time Complexity = O(b) , b=power value
 * Space Complexity = O(b) , b= power value.
 */

import java.util.*;
public class FindingPower_BFA_Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base value: ");
        int num=sc.nextInt();
        System.out.println("Enter the power value: ");
        int power=sc.nextInt();
        int result=findPower(num, power);
        System.out.println(num+"^"+power+" is : "+result);
        sc.close();
    }
    public static int findPower(int a,int b){
        int result=0;
        if(b==1){
            return a;
        }
        else{
            result=a*findPower(a, b-1);
        }
        return result;
    }
}
