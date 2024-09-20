import java.util.*;
public class Asg_SumOfAlternateSign_Recursion {
    public static int findSum(int n){
        int result=0;
        if(n==0)
            return 0;
        else{
            if(n%2==0)
                result=findSum(n-1)-n;
            else
                result=findSum(n-1)+n;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number: ");
        int n=sc.nextInt();
        int result=findSum(n);
        System.out.println(result);
        sc.close();
    }
}
