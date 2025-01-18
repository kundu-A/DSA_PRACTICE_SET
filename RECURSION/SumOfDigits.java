import java.util.*;
public class SumOfDigits {
    public static int sum(int num){
        if(num==0)
            return 0;
        else
            return (num%10)+sum(num/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number to find out the sum of the digits: ");
        int num=sc.nextInt();
        System.out.println(sum(num));
        sc.close();
    }
}
