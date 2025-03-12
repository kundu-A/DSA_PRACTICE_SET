// Height of the Stack = log(N)
import java.util.*;
public class NewPowerCalculation {
    public static int calPow(int x ,int n){
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        if(n%2==0)
            return calPow(x, n/2)*calPow(x, n/2);
        else
            return calPow(x, n/2)*calPow(x, n/2)*x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int x=sc.nextInt();
        System.out.println("Please enter the power value: ");
        int n=sc.nextInt();
        System.out.println(x+"^"+n+" = "+calPow(x, n));
        sc.close();
    }
}
