import java.util.*;
public class Asg_SumOfDigits_Recursion {
    public static int findSum(int num){
        int result=0;
        if(num==0)
            return 0;
        else{
            result=(num%10)+findSum(num/10);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int result=findSum(num);
        System.out.println("Sum of digits of "+num+" is : "+result);
        sc.close();
    }   
}