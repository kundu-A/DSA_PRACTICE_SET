// Heigth of the Stack = n
import java.util.*;
public class PowerCalculation {
    public static int calPow(int x ,int n){
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        return x*calPow(x, n-1);
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
