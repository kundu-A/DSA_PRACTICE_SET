//Here the time complexity = O(n)
//Space Complexity = O(n)
import java.util.*;
public class SumOfDigits_Recursion {
    public static int findSum(int num){
        if(num==0)
            return 0;
        else
            return (num%10)+findSum(num/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to finds the sum of all digits: ");
        int num=sc.nextInt();
        System.out.println("Sum of digits of "+num+" is : "+findSum(num));
        sc.close();
    }
}
