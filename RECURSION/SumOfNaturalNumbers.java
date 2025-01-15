import java.util.*;
public class SumOfNaturalNumbers {
    public static int calculateSum(int n){
        if(n==1)
            return n;
        else
            return calculateSum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the range: ");
        int range=sc.nextInt();
        System.out.println(calculateSum(range));
        sc.close();
    }
}
