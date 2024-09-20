import java.util.*;
public class PintOfMultiples_Recursion {
    public static void printMaltiple(int num,int k){
        if(k==1){
            System.out.println(num);
            return;
        }
        printMaltiple(num, k-1);
        System.out.println(num*k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the actual numner: ");
        int num=sc.nextInt();
        System.out.println("Enter how many time you want to see the table: ");
        int k=sc.nextInt();
        System.out.println("Table of "+num+" is : ");
        printMaltiple(num, k);
        sc.close();
    }
}
