/*
 * In Fibonacci Series:
 * Index: 0 1 2 3 4 5 ....
 * value: 0 1 1 2 3 5....
 * In StairCase problem to find the Number of ways:
 * Index: 0 1 2 3 4 5...
 * value: 0 1 2 3 5 8.... 
 */

import java.util.*;
public class StairCaseProblem_Recursion {
    //This problem is solved by the help of Fibonacci Series algorithm.
    public static int fibonacci(int n){
        if(n<=1)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of stairs: ");
        int n=sc.nextInt();
        int result=fibonacci(n+1);
        System.out.println("The Numner of Ways to climb those "+n+" no. of stairs is: "+result);
        sc.close();
    }
}
