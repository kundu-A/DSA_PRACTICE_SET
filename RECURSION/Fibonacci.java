import java.util.*;
public class Fibonacci {
    public static int fibonacci(int n){
        if(n<=1)
            return n;
        else
            return fibonacci(n-2)+fibonacci(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the range of the Fibonacci Series: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            System.out.print(fibonacci(i)+" ");
        System.out.println("\nSum of the Fibonacci Series is: "+fibonacci(n));
        sc.close();
    }
}
