import java.util.*;
public class NewFibonacci {
    public static void printFibo(int a ,int b ,int n){
        if(n==0)
            return;
        int c=a+b;
        System.out.print(c+" ");
        printFibo(b, c, n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the limit: ");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.println("Your Fibonacci Series is: ");
        System.out.print(a+" "+b+" ");
        printFibo(a, b, n);
        sc.close();
    }
}
