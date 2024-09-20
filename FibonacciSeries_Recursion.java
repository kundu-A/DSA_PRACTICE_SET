import java.util.*;
public class FibonacciSeries_Recursion {
    public static int findFibonacci(int n){
        int result=0;
        if(n<=1)
            return n;
        else
            result=findFibonacci(n-1)+findFibonacci(n-2);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find Fibonacci value: ");
        int n=sc.nextInt();
        System.out.println("The Fibonacci value of "+n+" is : "+findFibonacci(n));
        sc.close();
    }
}
