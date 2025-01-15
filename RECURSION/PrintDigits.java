import java.util.*;
class PrintDigits{
    public static void printDigits(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printDigits(n-1);
        System.out.print(n+" ");
    }
    public static void reversePrint(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        reversePrint(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the range : ");
        int range=sc.nextInt();
        System.out.println("From 1 to N");
        printDigits(range);
        System.out.println("\nFrom N to 1");
        reversePrint(range);
        sc.close();

    }
}