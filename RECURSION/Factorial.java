import java.util.*;
public class Factorial {
    public static void findFactorial(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        else{
            System.out.println(n);
            findFactorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number to find the factorial: ");
        int n=sc.nextInt();
        findFactorial(n);
        sc.close();
    }
}
