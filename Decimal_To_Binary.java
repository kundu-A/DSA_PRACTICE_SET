import java.util.*;
public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number to convert into binary form: ");
        int input=sc.nextInt();
        int disp=input;
        String res="";
        if(input==0)
            System.out.println(0);
        else{
            while (input>0) {
                int rem=input%2;
                res=res+rem;
                input=input/2;
            }
        }
        StringBuilder sb=new StringBuilder(res);
        System.out.println("Binary of "+disp+" is :"+sb.reverse());
        sc.close();
    }
}
